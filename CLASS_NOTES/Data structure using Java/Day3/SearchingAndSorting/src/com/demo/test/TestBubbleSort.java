package com.demo.test;

import java.util.stream.IntStream;

import com.demo.sorting.BubbleSortAlgorithm;

public class TestBubbleSort {

	public static void main(String[] args) {
		int[] arr= {21,2,5,1,7,8,10,3};
		//BubbleSortAlgorithm.bubbleSort(arr);
		//BubbleSortAlgorithm.bubbleSortImproved(arr);
		BubbleSortAlgorithm.bubbleSortImprovedDescending(arr);
		IntStream.of(arr).forEach(e->System.out.print(e+"\t"));

	}

}
