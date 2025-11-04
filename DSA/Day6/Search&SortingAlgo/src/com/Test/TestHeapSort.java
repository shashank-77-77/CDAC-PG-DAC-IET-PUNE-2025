package com.Test;

import java.util.Arrays;

import com.demo.sorting.HeapSortAlgo;

public class TestHeapSort {

	public static void main(String[] args) {
		int[] arr= {3,7,5,10,9,8,4};
		HeapSortAlgo.heapSortAscending(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("--------------------");

	}

}
