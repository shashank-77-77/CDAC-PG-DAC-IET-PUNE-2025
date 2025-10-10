package com.demo.test;

import java.util.Vector;

public class TestVector {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<>();
		v.add(12);
		v.add(13);
		v.add(13);
		System.out.println(v);
		System.out.println("Capacity : "+v.capacity());
		System.out.println("Size : "+v.size());
		for(int i=0;i<10;i++) {
			v.add(i+20);
		}
		System.out.println(v);
		System.out.println("Capacity : "+v.capacity());
		System.out.println("Size : "+v.size());
		for(int i=0;i<10;i++) {
			v.add(i+20);
		}
		System.out.println(v);
		System.out.println("Capacity : "+v.capacity());
		System.out.println("Size : "+v.size());
		v.remove(new Integer(13));
		System.out.println(v);
		System.out.println("Capacity : "+v.capacity());
		System.out.println("Size : "+v.size());
	}

}
