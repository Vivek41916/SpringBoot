package com.project.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sample {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long sid;
	String sname;
	public Sample() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Sample(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
	public int getSid() {
		return (int) sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
}
