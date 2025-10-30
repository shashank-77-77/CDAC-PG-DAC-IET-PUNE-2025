package com.demo.test;

import java.util.stream.IntStream;

import com.demo.arrays.My2DArray;

public class TestMy2DArray {

	public static void main(String[] args) {
		My2DArray ob1=new My2DArray();
		//My2DArray ob2=new My2DArray();
		//My2DArray ob2=new My2DArray(2,2);
		ob1.acceptData();
		ob1.displayData();
		//ob2.acceptData();
		
		//row rotation
		/*ob1.rowRotation(true, 1);
		ob1.displayData();
		ob1.rowRotation(false, 1);
		ob1.displayData();*/
		
		//column rotation
		/*ob1.columnRotation(true, 2);
		ob1.displayData();
		ob1.columnRotation(false, 1);
		ob1.displayData();*/
		
		//transpose of matrix
		int[][] arr=ob1.transpose();
		displayarray(arr);
		
		//check for symmetric
		if(ob1.isSysmmetric()) {
			System.out.println("symmetric matrix");
		}else {
			System.out.println("not symmetric matrix");
		}
		
		//check for identity
			if(ob1.isIdentity()) {
				System.out.println("Identity matrix");
			}else {
				System.out.println("not Identity matrix");
			}
		//add or subtract matrix
		/*int[][] arr=ob1.add2DArrays(ob2);
		if(arr!=null) {
			displayarray(arr);
		}else {
			System.out.println("dimenssions doesnot match");
		}*/
	}

	private static void displayarray(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}
