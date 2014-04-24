package edu.ncsu.beans;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.hibernate.Session;

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
}
