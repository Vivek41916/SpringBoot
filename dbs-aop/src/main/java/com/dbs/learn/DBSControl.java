package com.dbs.learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class DBSControl {
	@Autowired
	DBSBusiness bu;
	@GetMapping("/dbs/vivek")
	public void hello() {
		bu.Display();
	}
	
}
