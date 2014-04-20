package edu.ncsu.beans;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.hibernate.Session;

import edu.ncsu.util.HibernateUtil;
import edu.ncsu.util.TestDAO;

@ManagedBean(name = "loginBean")
public class LoginBean {

	private String name;
    private String password;

    public String getName ()
    {
        return name;
    }


    public void setName (final String name)
    {
        this.name = name;
    }


    public String getPassword ()
    {
        return password;
    }


    public void setPassword (final String password)
    {
        this.password = password;
    }
    
    public String login() {
    	
    	Session session = HibernateUtil.getSessionFactory().getCurrentSession();
    	session.beginTransaction();
    	
    	User user = (User) session.get(User.class, name);
    	session.getTransaction().commit();
    	if (user != null && user.getPassword().equals(this.password)) {
    		return "success";
    	}
    	
    	FacesContext context = FacesContext.getCurrentInstance(); 
        FacesMessage message = new FacesMessage("Invalid Username and/or Password"); 
        context.addMessage("loginForm", message);
        return "failure";
    }
	
}
