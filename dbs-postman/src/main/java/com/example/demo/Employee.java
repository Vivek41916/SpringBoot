package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	int EmpId;
	String Name,BusUnit;
	public Employee() {
		super();
	}
	public Employee(int empId, String name, String busUnit) {
		super();
		EmpId = empId;
		Name = name;
		BusUnit = busUnit;
	}
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getBusUnit() {
		return BusUnit;
	}
	public void setBusUnit(String busUnit) {
		BusUnit = busUnit;
	}
	

}
