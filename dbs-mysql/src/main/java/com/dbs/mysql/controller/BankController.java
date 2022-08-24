package com.dbs.mysql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dbs.mysql.service.CustomerService;

@Controller
public class BankController {
	@Autowired
	CustomerService customerService;
	
	@GetMapping("/home")
	public String loginPage() {
		return "Home.jsp";
	}
	
	@RequestMapping(value = "/userPage", method = RequestMethod.POST)
	public String userPage(@RequestParam String userId, @RequestParam String password) {
		System.out.println(userId);
		System.out.println(password);
		return customerService.Login(userId, password);
		
	}

}
