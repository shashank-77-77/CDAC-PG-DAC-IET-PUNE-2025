package com.demo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvices {
	@Before("execution (* com.demo.beans.M*.m*(..))")
	public void beforeAdvice() {
		System.out.println("in before advice");
	}
	
	@After("execution (* com.demo.beans.M*.m*(..))")
	public void afterAdvice() {
		System.out.println("in after advice");
	}
	
	@Around("execution (* com.demo.beans.M*.m*(..))")
	public Object aroundadvice(ProceedingJoinPoint jpoint) throws Throwable {
		System.out.println("in around advice before function call");
		Object ob=jpoint.proceed(); //actual function will be called
		System.out.println("in around advice after function call");
		return ob;
		
	}

}
