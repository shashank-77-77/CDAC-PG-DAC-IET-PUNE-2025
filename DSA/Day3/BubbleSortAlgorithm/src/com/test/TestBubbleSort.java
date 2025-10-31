package com.test;

import java.util.stream.IntStream;

import com.sorting.BubbleSortAlgo;

public class TestBubbleSort {

	public static void main(String[] args) {
		int [] arr= {10,2,34,3,53,433,4,22,33,88};
		//BubbleSortAlgo.bubbleSort(arr);
		BubbleSortAlgo.ImprovedBubbleSort(arr);
		IntStream.of(arr).forEach(e->System.out.println(e +"\t"));

	}

}
