package com.project.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.main.model.Customer;

public interface CustomerRepo extends JpaRepository<Customer,Long>{

}
