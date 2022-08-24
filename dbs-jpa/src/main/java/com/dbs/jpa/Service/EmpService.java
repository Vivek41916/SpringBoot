package com.dbs.jpa.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dbs.jpa.Model.Emp;
import com.dbs.jpa.Repository.EmpRepo;
@Component
public class EmpService {
	@Autowired
	EmpRepo empRepo;
	public void addNewEmp(Emp emp) {
		empRepo.save(emp);
		
	}
	public List<Emp> findAllEmp() {
		return empRepo.findAll();
	}
	public String updateEmployee(Emp emp) {
		try {
			Emp findEmp=empRepo.findById(emp.getid()).orElse(null);
			if(findEmp!=null && findEmp.getid()==emp.getid()) {
				empRepo.save(emp);
			}
			else {
				return "ID Not Found";
			}
		}
		catch(Exception e) {
			return "Internal Error";
		}
		return "Successfully Updated the record";
		
	}
	

}
