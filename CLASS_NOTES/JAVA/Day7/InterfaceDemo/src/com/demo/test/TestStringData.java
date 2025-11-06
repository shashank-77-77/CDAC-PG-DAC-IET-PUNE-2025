package com.demo.test;

public class TestStringData {

	public static void main(String[] args) {
		String s1="Test";
		String s2="Test";
		String s3=s2;
		String s4=new String("Test");
		System.out.println(" s2 == s3 "+(s2==s3));  //true
		System.out.println(" s2 == s4 "+(s2==s4));  //false 
		System.out.println(" s2 .equals(s4) "+(s2.equals(s4))); //true
		s1="welcome";
		System.out.println(" s2 == s1 "+(s2==s1));  //false
		
		//all the methods are synchronized, so they are thread safe
		//useful in multithreaded program
		StringBuffer sbf=new StringBuffer("Hello");
		System.out.println(sbf.append(" Everyone")); //Hello Everyone
		
		//useful in single threaded program, It is not thread safe
		StringBuilder sbd=new StringBuilder("test");
		System.out.println(sbd.append(" data"));   //test data
		
		String s6="xxx,yyy,zzz-rrrr";
		String[] arr=s6.split(",");
		String str=String.join(":",arr);
		System.out.println(str);
		
	}

}
