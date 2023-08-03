package com.Air.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Buisnesspay {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	Integer id;
	
	String firstname;
	String cardnumber;
	String Expirydate;
	int securitynumber;
	
	public Buisnesspay() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getCardnumber() {
		return cardnumber;
	}

	public void setCardnumber(String cardnumber) {
		this.cardnumber = cardnumber;
	}

	public String getExpirydate() {
		return Expirydate;
	}

	public void setExpirydate(String expirydate) {
		Expirydate = expirydate;
	}

	public int getSecuritynumber() {
		return securitynumber;
	}

	public void setSecuritynumber(int securitynumber) {
		this.securitynumber = securitynumber;
	}

	@Override
	public String toString() {
		return "Buisnesspay [id=" + id + ", firstname=" + firstname + ", cardnumber=" + cardnumber + ", Expirydate="
				+ Expirydate + ", securitynumber=" + securitynumber + "]";
	}
	
	

}
