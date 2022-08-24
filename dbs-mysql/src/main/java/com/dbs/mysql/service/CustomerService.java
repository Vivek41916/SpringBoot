package com.dbs.mysql.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dbs.mysql.model.Customer;
import com.dbs.mysql.repo.DBSRepo;

@Component
public class CustomerService {
	@Autowired
	DBSRepo dbsRepo;

	public String Login(String userId, String password) {
		Customer newCustomer=dbsRepo.findById(userId).orElse(null);
		System.out.println(newCustomer);
		if(newCustomer!=null && newCustomer.getPassword().equals(password)) {
			return "User.jsp";	
		}
		return "Home.jsp";
	}
	
	

}
