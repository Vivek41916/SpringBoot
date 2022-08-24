package com.dbs.learn;

import org.springframework.stereotype.Component;

@Component("IBGT")

public class IBGT implements BusinessUnit{
	public void Display() {
	System.out.println("This is IGBT Business Unit");
	}

}
