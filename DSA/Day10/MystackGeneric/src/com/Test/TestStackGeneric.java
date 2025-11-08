package com.Test;

import com.Stack.MyStackGeneric;

public class TestStackGeneric {
	public static void main(String[] args) {
		MyStackGeneric ob=new MyStackGeneric(5);
		
		
		  ob.push(25);
		  ob.push(202);
		  ob.push(20);
		  ob.push(7);
		  ob.push(350);
		  ob.push(23);
		  
		  
		  System.out.println("-------------------");
		  
		  
		  System.out.println(ob.pop());
		  System.out.println(ob.pop());
		  System.out.println(ob.pop());
		  System.out.println(ob.pop());
		  System.out.println(ob.pop());
		  System.out.println(ob.pop());
	}
}
