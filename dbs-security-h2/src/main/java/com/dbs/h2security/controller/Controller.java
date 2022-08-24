package com.dbs.h2security.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("/home")
	public String welcomDBS() {
		
		return "<h1> Welcome to DBS</h1>";
	}
	@GetMapping("/user")
	public String welcomeUserDBS() {
		
		return "<h1>user Welcome to DBS</h1>";
	}
	@GetMapping("/admin")
	public String welcomeAdminDBS() {
		
		return "<h1>admin Welcome to DBS</h1>";
	}
}