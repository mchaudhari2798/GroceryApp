package com.groceryApp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Registration {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long user_Id;
	private String UserName;
	private long PhoneNo;
	private String Email;
	private String Password;
	private String Address;
	
	public Registration() {
//		super();
		// TODO Auto-generated constructor stub
	}

	public Registration(long user_Id, String userName, long phoneNo, String email, String password, String address) {
		super();
		this.user_Id = user_Id;
		UserName = userName;
		PhoneNo = phoneNo;
		Email = email;
		Password = password;
		Address = address;
	}

	public long getUser_Id() {
		return user_Id;
	}

	public void setUser_Id(long user_Id) {
		this.user_Id = user_Id;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public long getPhoneNo() {
		return PhoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		PhoneNo = phoneNo;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	
	
	
	
	
	
	

}
