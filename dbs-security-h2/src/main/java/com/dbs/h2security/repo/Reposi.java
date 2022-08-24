package com.dbs.h2security.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.h2security.model.User;

public interface Reposi extends JpaRepository<User,Integer>{
	
	User findByUserName(String name);
	

}
