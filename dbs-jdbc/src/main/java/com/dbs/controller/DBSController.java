package com.dbs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.dbs.model.Employee;
import com.dbs.service.EmployeeService;

public class DBSController {
    @Autowired
    EmployeeService empService;

    @GetMapping("/allEmp")
    public List<Employee> getAllEmployees(){

        return empService.findAllEmployees();

    }

}