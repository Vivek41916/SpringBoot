package com.dbs.learn;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class DBSConfig {
	@Before(value= "execution(* com.dbs.learn.*.*(..))")
	public void methos(JoinPoint joinPoint) {
		System.out.println("Executing after AOP");
		
	}
	

}
