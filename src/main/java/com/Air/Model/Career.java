package com.Air.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Career {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer id;
	
	String firstname;
	String email;
	String message;
	public Career() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Career(String firstname, String email, String message) {
		super();
		this.firstname = firstname;
		this.email = email;
		this.message = message;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Career [firstname=" + firstname + ", email=" + email + ", message=" + message + "]";
	}
	
	
	
	
	
}
