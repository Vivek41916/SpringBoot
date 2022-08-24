package com.project.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.project.main.model.Customer;
import com.project.main.repo.CustomerRepo;

@Component
public class CustomerService {
	@Autowired
	CustomerRepo customerRepo;
	
	public Customer loadCustomer(long cid) {
		try {
			Customer customer= customerRepo.findById(cid).orElse(null);
			if(customer!=null) {
				return customer;
			}
		}
		catch(Exception e){
			return null;
		}
		return new Customer();
	}

}
