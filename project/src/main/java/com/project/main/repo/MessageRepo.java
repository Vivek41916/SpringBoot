package com.project.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.main.model.Message;

public interface MessageRepo extends JpaRepository<Message, String>{

}
