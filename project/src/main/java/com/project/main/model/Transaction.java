package com.project.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transaction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long transactionId;
	
	long senderId;
	String senderName,receiverName,receiverBic,receiverBank,message,status;
	double fee, clearBalance,transactionAmount;
	public double getFee() {
		return fee;
	}
	public Transaction(long transactionId, long senderId, String senderName, String receiverName, String receiverBic,
			String receiverBank, String message, String status, double fee, double clearBalance,
			double transactionAmount) {
		super();
		this.transactionId = transactionId;
		this.senderId = senderId;
		this.senderName = senderName;
		this.receiverName = receiverName;
		this.receiverBic = receiverBic;
		this.receiverBank = receiverBank;
		this.message = message;
		this.status = status;
		this.fee = fee;
		this.clearBalance = clearBalance;
		this.transactionAmount = transactionAmount;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public double getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public long getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}
	public long getSenderId() {
		return senderId;
	}
	public void setSenderId(long senderId) {
		this.senderId = senderId;
	}
	public String getSenderName() {
		return senderName;
	}
	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}
	public String getReceiverName() {
		return receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}
	public String getReceiverBic() {
		return receiverBic;
	}
	public void setReceiverBic(String receiverBic) {
		this.receiverBic = receiverBic;
	}
	public String getReceiverBank() {
		return receiverBank;
	}
	public void setReceiverBank(String receiverBank) {
		this.receiverBank = receiverBank;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public double getClearBalance() {
		return clearBalance;
	}
	public void setClearBalance(double clearBalance) {
		this.clearBalance = clearBalance;
	}
	
	
}
