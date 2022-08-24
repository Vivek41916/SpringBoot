package com.dbs.jpa.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.jpa.Model.Emp;
import com.dbs.jpa.Service.EmpService;

@RestController
public class EmpController {
	@Autowired
	EmpService empService;
	
	@PostMapping("/addEmp")
	
	public String addEmp(@RequestBody Emp emp) {
		empService.addNewEmp(emp);
		return "Successfully added new record";	}
	
	@GetMapping("/findAll")
	public List<Emp> findAll() {
		return	empService.findAllEmp();
	}
	
	@PutMapping("/updateEmp")
	public String updateEmp(@RequestBody Emp emp) {
		return empService.updateEmployee(emp);
		
	}
}
