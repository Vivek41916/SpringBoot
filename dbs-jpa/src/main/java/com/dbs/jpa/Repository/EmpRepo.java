package com.dbs.jpa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.jpa.Model.Emp;

public interface EmpRepo extends JpaRepository<Emp, Integer> {

}
