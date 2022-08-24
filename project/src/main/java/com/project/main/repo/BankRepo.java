package com.project.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.main.model.Bank;

public interface BankRepo extends JpaRepository<Bank, String>{

}
