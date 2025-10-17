package com.threads;

import com.beans.MyClass;

public class AddNumThread implements Runnable {
	private int n;
	private int n1;
	private MyClass ob;
	

	public AddNumThread(int n, int n1, MyClass ob) {
		super();
		this.n = n;
		this.n1 = n1;
		this.ob = ob;
	}


	@Override
	public void run() {
		int ans =ob.addNum(n, n1);
		System.out.println("Addition is " + ans);
		
	}
	

}
