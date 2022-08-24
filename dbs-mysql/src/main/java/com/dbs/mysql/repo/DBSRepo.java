package com.dbs.mysql.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.mysql.model.Customer;


public interface DBSRepo extends JpaRepository<Customer,String>{

}
