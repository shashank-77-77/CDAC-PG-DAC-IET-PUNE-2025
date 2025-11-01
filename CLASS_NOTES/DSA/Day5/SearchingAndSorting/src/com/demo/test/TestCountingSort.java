package com.demo.test;

import java.util.Arrays;

import com.demo.sorting.CountingSortAlgorithm;

public class TestCountingSort {

	public static void main(String[] args) {
		int[] arr= {6,5,4,8,6,9,5,3,4,6,9};
		int[] output=CountingSortAlgorithm.countingSortAscending(arr);
		System.out.println("sorted data");
		System.out.println(Arrays.toString(output));

	}

}
