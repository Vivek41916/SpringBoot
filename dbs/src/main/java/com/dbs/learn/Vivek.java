package com.dbs.learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Vivek {
	@Autowired
	@Qualifier("ITT")
	BusinessUnit bu;
	void Hello() {
		System.out.println("Hello DBS");
		bu.Display();
	}
}
