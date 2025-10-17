package com.test;
import com.beans.*;
import com.threads.*;
public class TestMultiThreadng {
	public static void main(String[] args) {
		MyClass c1=new MyClass();
		
		FactorialThread fth =new FactorialThread(5,c1);
		fth.start();
		
		PrintTableThread pth=new PrintTableThread(3,c1);
		pth.start();
		
		PrintTableThread pth1=new PrintTableThread(9,c1);
		pth1.start();
		
		PrimeNumThread pn1=new PrimeNumThread(3,c1);
		Thread th=new Thread(pn1);
		th.start();
		
		AddNumThread ad1=new AddNumThread(5,10,c1);
		Thread th1=new Thread(ad1);
		th1.start();
		
		MultNumThread mt1=new MultNumThread(20,3,c1);
		mt1.start();
		
		
		System.out.println("Main complete its work");
	}
}
