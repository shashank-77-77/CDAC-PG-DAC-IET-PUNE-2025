package com.threads;

import com.beans.MyClass;

public class PrintTableThread extends Thread {
	private int n;
	private MyClass ob;
	public PrintTableThread(int n, MyClass ob) {
		super();
		this.n = n;
		this.ob = ob;
	}
	
	public void run()
	{
		ob.printTable(n);
	}

}
