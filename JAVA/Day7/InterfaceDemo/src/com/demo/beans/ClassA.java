package com.demo.beans;

public class ClassA {
	private int x;
	public void m1() {
		System.out.println("in m1 of ClassA");
	}

}

 class ClassB extends ClassA{
	 public void m1() {
			System.out.println("in m1 of ClassA");
		}
	
}
