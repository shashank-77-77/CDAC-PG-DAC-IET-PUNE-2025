package com.test;

import com.arrays.My2dArray;

public class Test2dArray {

	public static void main(String[] args) {
		My2dArray obj=new My2dArray();
		obj.acceptData();
		obj.displayData();
		obj.findSumRowWise();
		obj.findSumColWise();
		obj.rowRotation(true, 2);
		obj.displayData();
		obj.colRotation(true, 2);
		obj.displayData();
		
	}

}
