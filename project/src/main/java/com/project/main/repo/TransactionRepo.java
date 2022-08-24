package com.project.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.main.model.Transaction;

public interface TransactionRepo extends JpaRepository<Transaction, Long>{

}
