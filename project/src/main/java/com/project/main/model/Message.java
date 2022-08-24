package com.project.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Message {
	
	@Id
	String code;
	
	String Description;

	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Message(String code, String description) {
		super();
		this.code = code;
		Description = description;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}
	

}
