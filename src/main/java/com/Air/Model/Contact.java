package com.Air.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Contact {
	@Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   Integer id;

	String name;
	String email;
	long phone;
	String message;
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contact(String name, String email, long phone, String message) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.message = message;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Contact [name=" + name + ", email=" + email + ", phone=" + phone + ", message=" + message + "]";
	}
	
	

	
}
