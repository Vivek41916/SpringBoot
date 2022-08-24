package com.dbs.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dbs.model.Employee;
import com.dbs.repo.DBSRepo;
@Service
public class EmployeeService {

    @Autowired
    DBSRepo empRepo;

    public List<Employee> findAllEmployees() {

        return empRepo.getAllEmployees();

    }

}

