package com.dbs.learn;

import org.springframework.stereotype.Component;

@Component("ITT")

public class ITT implements BusinessUnit{
	public void Display() {
	System.out.println("This is ITT Business Unit");
	}

}
