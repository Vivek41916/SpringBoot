package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@Autowired
	Employee emp;
	@GetMapping("/postman")
	public String Display() {
		/*System.out.println("testing with Postman");
		emp.setBusUnit(newemp.getBusUnit());
		emp.setEmpId(newemp.getEmpId());
		emp.setName(newemp.getName());*/
		return "Hello";
	}
}
