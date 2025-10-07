package com.demo.interfaces;

public interface Inter1 {
	//public and abstract
	int m1();
	void m2(int i);
	int i=12;   //public static final
	private void m5() {
		System.out.println("same part of m3 and m4");
	}
	default int m3() {
		m5();
		System.out.println("in m3 method;");
		return 10;
	}
	default int m4() {
		m5();
		System.out.println("in m4 method;");
		return 20;
	}
	public static void myfunct1() {
		System.out.println("in myfunction1");
	}

}
