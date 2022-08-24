package com.project.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	long customerId;
	String customerName;
	String isODAvailable;
	double clearBalance;
	public Customer() {
		super();

	}
	public Customer(long customerId, String customerName, String isODAvailable, double clearBalance) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.isODAvailable = isODAvailable;
		this.clearBalance = clearBalance;
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String isODAvailable() {
		return isODAvailable;
	}
	public void setODAvailable(String isODAvailable) {
		this.isODAvailable = isODAvailable;
	}
	public double getClearBalance() {
		return clearBalance;
	}
	public void setClearBalance(double clearBalance) {
		this.clearBalance = clearBalance;
	}
	

}
