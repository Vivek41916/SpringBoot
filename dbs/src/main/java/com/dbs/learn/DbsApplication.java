package com.dbs.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DbsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(DbsApplication.class, args);
		Vivek dbs= context.getBean(Vivek.class);
		dbs.Hello();
	}
}
