package com.demo.sorting;

import java.util.Arrays;

public class QuickSortAlgorithm {
	private static int partition(int[] arr, int start, int end) {
		int pivot=start;
		int i=start;
		int j=end;
		while(i<j) {
			while(i<end && arr[i]<=arr[pivot]) {
				i++;
			}
			while(j>start && arr[j]>arr[pivot]) {
				j--;
			}
			if(i<j) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			
		}
		//swap j with pivot
		if (pivot!=j){ //swap only if pivot and j are not at same position
			int temp=arr[pivot];
			arr[pivot]=arr[j];
			arr[j]=temp;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("pivot position : "+j+" Pivot number : "+arr[j]);
		System.out.println(arr[j] + "  Swapped with "+arr[pivot]);
		
		return j;
	}
	
	public static void quicksort(int[] arr,int start,int end) {
		if(start<end) {   //test array size should be minimum 2
			int p=partition(arr,start,end);
			quicksort(arr,start,p-1);
			quicksort(arr,p+1,end);
			
		}
	}

	

}
