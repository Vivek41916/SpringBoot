package com.dbs.rabbit.model;

public class OrderStatus {
	private Order order;
	private String status;
	private String message;
	public OrderStatus() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderStatus(Order order, String status, String message) {
		super();
		this.order = order;
		this.status = status;
		this.message = message;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	

}
