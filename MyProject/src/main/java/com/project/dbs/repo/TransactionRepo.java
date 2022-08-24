package com.project.dbs.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.project.main.model.TransactionDetails;


public interface TransactionRepo extends JpaRepository<TransactionDetails,Integer>{

}
