package com.demo.test;

import java.util.Arrays;

import com.demo.sorting.HeapSortAlgorithm;

public class TestHeapSortAlgorithm {

	public static void main(String[] args) {
		int[] arr= {3,7,5,10,9,8,4};
		HeapSortAlgorithm.heapSortAscending(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("-------------------------------");

	}

}
