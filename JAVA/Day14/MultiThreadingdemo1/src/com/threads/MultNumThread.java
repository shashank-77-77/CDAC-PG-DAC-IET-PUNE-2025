package com.threads;

import com.beans.MyClass;

public class MultNumThread extends Thread{
	private int n;
	private int n1;
	private MyClass ob;
	public MultNumThread(int n, int n1, MyClass ob) {
		super();
		this.n = n;
		this.n1 = n1;
		this.ob = ob;
	}
	
	public void run()
	{
		int ans=ob.multNum(n, n1);
		System.out.println("Multiplication is " + ans);
	}
	
	
}
