package com.project.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.main.model.Customer;
import com.project.main.model.Transaction;
import com.project.main.repo.TransactionRepo;

@Component
public class TransactionService {
	@Autowired
	TransactionRepo transactionRepo;
	
	@Autowired
	CustomerService customerService;
	
	
	public void addTransaction(long cid, String senderName, String receiverName, double clearBalance,
			double transactionAmount, String receiverBic, String receiverBank, String messageCode ) {
		// TODO Auto-generated method stub
		
		System.out.println("Inside service");
		System.out.println(cid);
		Transaction newTransaction=new Transaction();
		double fee, remainingClearBalance;
		String status;
		Customer customer=customerService.loadCustomer(cid);
		if(customer.getClearBalance()>=transactionAmount || customer.isODAvailable().toLowerCase().equals("yes")) {
			fee=transactionAmount*0.25;
			remainingClearBalance=clearBalance-transactionAmount-fee;
			status="Accepted";
		}
		else {
			status="rejected";
			fee=0;
			remainingClearBalance=clearBalance;
		}
		//newTransaction.setTransactionId(0L);
		newTransaction.setClearBalance(remainingClearBalance);
		newTransaction.setFee(fee);
		newTransaction.setSenderId(cid);
		newTransaction.setSenderName(senderName);
		newTransaction.setTransactionAmount(transactionAmount);
		newTransaction.setReceiverBic(receiverBic);
		newTransaction.setReceiverBank(receiverBank);
		newTransaction.setStatus(status);
		newTransaction.setReceiverName(receiverName);
		newTransaction.setMessage("Done");
		System.out.println(newTransaction);
		transactionRepo.save(newTransaction); 
		System.out.println("Done");
		
		
	}

	

}
