package com.demo.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyUser {
	@Override
	public String toString() {
		System.out.println("tostring method called");
		return "MyUser [name=" + name + "]";
	}

	@Value("Rajan")
	private String name;

	public MyUser() {
		super();
	}

	public MyUser(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		System.out.println("in getName method");
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void m1() {
		System.out.println("in m1 method");
	}
	
	public int m2(int x) {
		System.out.println("in m2 method "+x);
		return x+10;
	}
	
	

}
