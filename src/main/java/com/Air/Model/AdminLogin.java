package com.Air.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class AdminLogin {

	@Id
	String username;
	String password;
	public AdminLogin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AdminLogin(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "AdminLogin [username=" + username + ", password=" + password + "]";
	}
	
	
	
}
