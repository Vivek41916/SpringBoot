package com.project.dbs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.project.dbs.service.BankService;

@Controller
public class BankController {
	@Autowired
	BankService bankService;

}
