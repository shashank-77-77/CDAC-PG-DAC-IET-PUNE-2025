package com.demo.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyUser {
	
	
	@Value("Soham")
	private String name;

	public MyUser() {
		super();
	}

	public MyUser(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		System.out.println("In getName method");
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void m1()
	{
		System.out.println("in m1 method");
	}
	
	public int m2(int x)
	{
	   System.out.println("In m2 method" + x);
	   return x+20;
	   
	}

	@Override
	public String toString() {
		return "MyUser [name=" + name + "]";
	}
	
	
	
}
