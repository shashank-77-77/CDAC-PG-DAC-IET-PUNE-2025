package com.test;

import java.util.stream.IntStream;

import com.array.MyArray;

public class TestArray {
	public static void main(String[] args) {
		MyArray mya=new MyArray();
		mya.add(3);
		mya.add(7);
		mya.add(5);
		mya.add(6);
		mya.add(2);
		
		System.out.println(mya);
		mya.addAtGivenPos(9, 1);
		System.out.println(mya);
		mya.add(8);
		System.out.println(mya);
		System.out.println("Position of 7 :" + mya.SearchByValue(7));
		mya.deleteByPos(3);
		System.out.println(mya);
		mya.deleteByValue(7);
		System.out.println(mya);
		int [] arr1=mya.exchangeIndexValue();
		IntStream.of(arr1).forEach(e-> System.out.print(e + " , "));
		arr1=mya.reverseArray(true);
		System.out.println(mya);
	
		
		
		
		
	}
}
