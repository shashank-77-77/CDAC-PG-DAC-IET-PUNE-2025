package com.demo.beans;

import com.demo.interfaces.MyComparable;

public class MyNewCompare implements MyComparable{

	@Override
	public int compare(int a, int b) {
		System.out.println("in compare method;");
		return 10;
	}

}
