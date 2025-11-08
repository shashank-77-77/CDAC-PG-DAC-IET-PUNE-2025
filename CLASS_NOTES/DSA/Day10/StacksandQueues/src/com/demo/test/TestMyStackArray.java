package com.demo.test;

import com.demo.stacks.MyStackArray;

public class TestMyStackArray {
	public static void main(String[] args) {
		MyStackArray ob=new MyStackArray(5);
		  ob.push(23);
		  ob.push(22);
		  ob.push(20);
		  ob.push(7);
		  ob.push(3);
		  ob.push(23);// stack is full
		  System.out.println("-------------------");
		  System.out.println(ob.pop());
		  System.out.println(ob.pop());
		  System.out.println(ob.pop());
		  System.out.println(ob.pop());
		  System.out.println(ob.pop());
		  System.out.println(ob.pop());//stack enmpty
	}
  
  
}
