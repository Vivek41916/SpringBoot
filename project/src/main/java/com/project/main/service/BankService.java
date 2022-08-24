package com.project.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.main.model.Bank;
import com.project.main.repo.BankRepo;


@Component
public class BankService {
	@Autowired
	BankRepo bankRepo;

	public String loadBankName(String bic) {
		try {
			Bank bankDetails= bankRepo.findById(bic).orElse(null);
			if(bankDetails!=null) {
					return bankDetails.getName();
			}
		}
		catch(Exception e){
			return "Internal Error";
		}
		return "No bank found with specified BIC";
	}
}
