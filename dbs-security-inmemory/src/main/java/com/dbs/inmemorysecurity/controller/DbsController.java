package com.dbs.inmemorysecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DbsController {
	@GetMapping("/home")
	public String welcomDBS() {
		
		return "<h1> Welcome to DBS</h1>";
	}


}
