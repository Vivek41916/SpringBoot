package com.project.dbs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.project.dbs.repo.BankRepo;

@Component
public class BankService {
	@Autowired
	BankRepo bankRepo;

}
