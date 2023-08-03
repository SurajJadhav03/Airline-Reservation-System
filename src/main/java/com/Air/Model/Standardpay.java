package com.Air.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Standardpay {
    @Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	Integer id;
	
	String firstname;
	String cardnumber;
	String Expirydate;
	int securitynumber;
	public Standardpay() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Standardpay(Integer id, String firstname, String cardnumber, String expirydate, int securitynumber) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.cardnumber = cardnumber;
		Expirydate = expirydate;
		this.securitynumber = securitynumber;
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
		return "Standardpay [id=" + id + ", firstname=" + firstname + ", cardnumber=" + cardnumber + ", Expirydate="
				+ Expirydate + ", securitynumber=" + securitynumber + "]";
	}
	
	

}
