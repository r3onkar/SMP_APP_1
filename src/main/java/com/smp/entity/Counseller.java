package com.smp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Counseller {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CID;
	
	public int getCID() {
		return CID;
	}
	public void setCID(int cID) {
		CID = cID;
	}
	private String name;
	private String email;
	private String password;
	private int phone;
	
	
	
	public Counseller() {
		super();
	}
	public Counseller(String name, String email, String password, int phone, int CID) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.CID=CID;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
}
