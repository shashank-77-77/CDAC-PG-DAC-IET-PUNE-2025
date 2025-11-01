package com.demo.sorting;

import java.util.Arrays;

public class InsertionSortAlgorithm {
	public static void insertionSortAscending(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int j=i-1;
			//copy the element to be sorted
			int key=arr[i];
			//shift elements on the rigth, till the value at j th location is > than key or
			//j>=0
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			//place the key in the sorted array
			arr[j+1]=key;
			System.out.println(Arrays.toString(arr));
		}
	}
	
	public static void insertionSortDescending(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int j=i-1;
			//copy the element to be sorted
			int key=arr[i];
			//shift elements on the rigth, till the value at j th location is > than key or
			//j>=0
			while(j>=0 && arr[j]<key) {
				arr[j+1]=arr[j];
				j--;
			}
			//place the key in the sorted array
			arr[j+1]=key;
			System.out.println(Arrays.toString(arr));
		}
	}

}
