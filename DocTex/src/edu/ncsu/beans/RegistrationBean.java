package edu.ncsu.beans;

import java.security.Security;
import java.util.Date;
import java.util.Properties;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.mail.*;
import javax.mail.internet.*;

import org.hibernate.Session;

import com.sun.mail.smtp.SMTPTransport;

import edu.ncsu.entities.User;
import edu.ncsu.util.HibernateUtil;

@ManagedBean(name = "RegistrationBean")
public class RegistrationBean {
	
	private String username;
	private String password;
	private String reTypePassword;
	private String email;
	private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" +
													"[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	private static final String DOCTEX_USER = "doctex.noreply";
	private static final String DOCTEX_PWD = "BethanySucks";
	
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the reTypePassword
	 */
	public String getReTypePassword() {
		return reTypePassword;
	}
	
	/**
	 * @param reTypePassword the password confirmed to set
	 */
	public void setReTypePassword(String reTypePassword) {
		this.reTypePassword = reTypePassword;
	}
	
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String register() {
		
		FacesContext fc = FacesContext.getCurrentInstance();
    	Session session = HibernateUtil.getSessionFactory().getCurrentSession();
    	session.beginTransaction();
    	
    	User user = (User) session.get(User.class, username);
    	session.getTransaction().commit();
    	if (user != null) {
    		fc.addMessage("registerUser", new FacesMessage("Username already taken"));

    		return "failure";
    	} else if (this.password == null || this.reTypePassword == null 
    				|| !this.password.equals(this.reTypePassword)) {
    		fc.addMessage("registerUser", new FacesMessage("Password does not match"));

    		return "failure";
    	}
    	
    	if (this.email == null || !this.email.matches(EMAIL_PATTERN)) {
    		fc.addMessage("registerUser", new FacesMessage("Invalid email address"));

    		return "failure";
    	}
    	
    	try {
    		sendConfirmationEmail();
    	} catch (Exception e) {
    		System.out.println("Email could not be sent");
    		
    		return "failure";
    	}
    	
    	User newUser = new User();
    	newUser.setEmail(this.email);
    	newUser.setUser_id(this.username);
    	newUser.setPassword(this.password);
    	
    	session = HibernateUtil.getSessionFactory().getCurrentSession();
    	session.beginTransaction();
    	session.save(newUser);
    	session.getTransaction().commit();
    	
    	return "success";
	}
	
	public void sendConfirmationEmail() throws AddressException, MessagingException {
        Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
        final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";

        // Get a Properties object
        Properties props = System.getProperties();
        props.setProperty("mail.smtps.host", "smtp.gmail.com");
        props.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
        props.setProperty("mail.smtp.socketFactory.fallback", "false");
        props.setProperty("mail.smtp.port", "465");
        props.setProperty("mail.smtp.socketFactory.port", "465");
        props.setProperty("mail.smtps.auth", "true");

        /*
        If set to false, the QUIT command is sent and the connection is immediately closed. If set 
        to true (the default), causes the transport to wait for the response to the QUIT command.

        ref :   http://java.sun.com/products/javamail/javadocs/com/sun/mail/smtp/package-summary.html
                http://forum.java.sun.com/thread.jspa?threadID=5205249
                smtpsend.java - demo program from javamail
        */
        props.put("mail.smtps.quitwait", "false");

        javax.mail.Session session = javax.mail.Session.getInstance(props, null);

        // -- Create a new message --
        final MimeMessage msg = new MimeMessage(session);

        // -- Set the FROM and TO fields --
        msg.setFrom(new InternetAddress(DOCTEX_USER + "@gmail.com"));
        msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(this.email, false));
        
        msg.setSubject("DocTex Registration Confirmation");
        msg.setText("Thank you for signing up for DocTex, " + this.username + "! DocTex is currently under construction, but we will notify you as soon as it is released.", "utf-8");
        msg.setSentDate(new Date());

        SMTPTransport t = (SMTPTransport)session.getTransport("smtps");

        t.connect("smtp.gmail.com", DOCTEX_USER, DOCTEX_PWD);
        t.sendMessage(msg, msg.getAllRecipients());      
        t.close();
	}
}
