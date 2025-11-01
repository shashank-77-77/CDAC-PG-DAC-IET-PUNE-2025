package com.demo.test;

import com.demo.sorting.MergeSortAlgorithm;

public class TestMergeSort {

	public static void main(String[] args) {
		int[] arr= {20,5,7,11,21,2,7,25,30,3};
		MergeSortAlgorithm.mergeSortAscending(arr, 0,arr.length-1);

	}

}
