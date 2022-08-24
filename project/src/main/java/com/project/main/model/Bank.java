package com.project.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bank {
	@Id
	String bic;
	String Name;
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bank(String bic, String name) {
		super();
		this.bic = bic;
		Name = name;
	}
	public String getBic() {
		return bic;
	}
	public void setBic(String bic) {
		this.bic = bic;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}

}
