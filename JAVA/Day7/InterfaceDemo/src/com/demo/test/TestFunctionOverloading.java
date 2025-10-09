package com.demo.test;

import com.demo.beans.MyTestClass;

public class TestFunctionOverloading {

	public static void main(String[] args) {
		MyTestClass ob=new MyTestClass();
		System.out.println(ob.max(12,13,45));
		System.out.println(ob.max(13,45));
		System.out.println(ob.max(12.5f,13.7f));
		System.out.println(ob.max("hello", "Welcome"));
        System.out.println(ob.add(12,34));
        System.out.println(ob.add(12,34,5,4,6,7,8));
	}

}
