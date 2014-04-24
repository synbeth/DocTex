package edu.ncsu.beans;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "RegistrationBean")
public class RegistrationBean {
	
	private String username;
	private String password;
	private String reTypePassword;
	private String email;
	
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
		
		return "failure";
	}
}
