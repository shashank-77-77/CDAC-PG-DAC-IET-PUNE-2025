package com.test;

import com.singleDimensionalArray.MyArray;

public class MyArrayTest {

	public static void main(String[] args) {
		int [] arr = {9,23,4,37,42,41,1};
		
		MyArray ma=new MyArray();
		int[] digitSums = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++)
		{
		  digitSums[i] =ma.sumOfDigits(arr[i]);
		}
		System.out.print("Sum of digits for each element: ");
			for (int sum : digitSums) 
		    {
		       System.out.print(sum + " ");
		    }
			System.out.println();
		//ma.addArrayDigit(arr);
		ma.PrimeFact(arr);
		ma.MaxPrime(arr);
		ma.CopyArray(arr);

	
	}
}


