package com.project.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.main.model.Customer;
import com.project.main.service.BankService;
import com.project.main.service.CustomerService;
import com.project.main.service.TransactionService;



@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200/")
public class Controller {
	@Autowired
	BankService bankService;
	
	@Autowired
	CustomerService customerService;
	
	@Autowired
	TransactionService transactionService;
	
	
	@GetMapping("/loadbank")
	public String loadBank(@RequestParam String bic) {
		return bankService.loadBankName(bic);	
	}
	
	
	@GetMapping("/loadcustomer")
	public Customer loadCustomer(@RequestParam long cid) {
		return customerService.loadCustomer(cid);
	}
	
	@PostMapping("/updateCustomerandTransaction")
	public String update(@RequestParam long cid,
			@RequestParam String senderName,
			@RequestParam String receiverName,
			@RequestParam double clearBalance,
			@RequestParam double transactionAmount,
			@RequestParam String receiverBic,
			@RequestParam String receiverBank,
			@RequestParam String messageCode ) {
		
		
		transactionService.addTransaction(cid,senderName,receiverName,clearBalance,transactionAmount,receiverBic,receiverBank,messageCode);
		return "Success";
		
	}

}
