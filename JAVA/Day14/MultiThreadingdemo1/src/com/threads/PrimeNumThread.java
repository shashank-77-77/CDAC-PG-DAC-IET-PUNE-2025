package com.threads;

import com.beans.MyClass;

public class PrimeNumThread implements Runnable{
	
	private int n;
	private MyClass ob;
	
	
	

	public PrimeNumThread(int n, MyClass ob) {
		super();
		this.n = n;
		this.ob = ob;
	}




	@Override
	public void run() {
		boolean status =ob.primeNum(n);
		if(status)
		{
			System.out.println("Number is prime");
		}
		else
		{
			System.out.println("Number is not prime");
		}
		
	}
	
	

}
