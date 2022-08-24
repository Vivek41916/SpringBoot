package com.dbs.mysql.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Customer {
	@Id
	int accountNumber;
	String customerName,userId,password;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int accountNumber, String ifscCode, String customerName, String userId, String password) {
		super();
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.userId = userId;
		this.password = password;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
