package com.project.dbs.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TransactionDetails {
	@Id
	long id,cid,receiverAccNumber;
	double clearBalance,amout,fee;
	String dateTime,senderName,receiverName,receiverBIC,transferType,messageCode;
	public TransactionDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TransactionDetails(int id, String dateTime, long cid, String senderName, double clearBalance,
			String receiverName, String receiverBIC, long receiverAccNumber, String transferType, String messageCode,
			double amout, double fee) {
		super();
		this.id = id;
		this.dateTime = dateTime;
		this.cid = cid;
		this.senderName = senderName;
		this.clearBalance = clearBalance;
		this.receiverName = receiverName;
		this.receiverBIC = receiverBIC;
		this.receiverAccNumber = receiverAccNumber;
		this.transferType = transferType;
		this.messageCode = messageCode;
		this.amout = amout;
		this.fee = fee;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	public long getCid() {
		return cid;
	}
	public void setCid(long cid) {
		this.cid = cid;
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
	public String getReceiverBIC() {
		return receiverBIC;
	}
	public void setReceiverBIC(String receiverBIC) {
		this.receiverBIC = receiverBIC;
	}
	public long getReceiverAccNumber() {
		return receiverAccNumber;
	}
	public void setReceiverAccNumber(long receiverAccNumber) {
		this.receiverAccNumber = receiverAccNumber;
	}
	public String getTransferType() {
		return transferType;
	}
	public void setTransferType(String transferType) {
		this.transferType = transferType;
	}
	public String getMessageCode() {
		return messageCode;
	}
	public void setMessageCode(String messageCode) {
		this.messageCode = messageCode;
	}
	public double getAmout() {
		return amout;
	}
	public void setAmout(double amout) {
		this.amout = amout;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public double getClearBalance() {
		return clearBalance;
	}
	public void setClearBalance(double clearBalance) {
		this.clearBalance = clearBalance;
	}
	public void setId(long id) {
		this.id = id;
	}
	

}
