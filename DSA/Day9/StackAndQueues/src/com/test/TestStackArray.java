package com.test;

import com.stackandqueue.MyStackArray;

public class TestStackArray {

	public static void main(String[] args) {
		MyStackArray os=new MyStackArray(5);
		os.push(12);
		os.push(7);
		os.push(15);
		os.push(30);
		os.push(5);
		System.out.println(os.pop());
		System.out.println(os.pop());
		System.out.println(os.pop());
		System.out.println(os.pop());
		System.out.println(os.pop());

	}

}
