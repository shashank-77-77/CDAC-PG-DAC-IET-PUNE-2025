package com.demo.beans;

public class MyClass {
	private int n1;
	private int n2;
	
	public MyClass() {
		super();
	}

	public MyClass(int n1, int n2) {
		super();
		this.n1 = n1;
		this.n2 = n2;
	}

	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}

	@Override
	public String toString() {
		return "MyClass [n1=" + n1 + ", n2=" + n2 + "]";
	}
	
	public void m1(int x) {
		System.out.println("in m1 method");
	}
	

}
