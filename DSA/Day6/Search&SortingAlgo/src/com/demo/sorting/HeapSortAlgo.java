package com.demo.sorting;

import java.util.Arrays;

public class HeapSortAlgo {
	
	private static void heapify(int[] arr, int n, int i) {
		int left=2*i+1;
		int right=2*i+2;
		int largest=i;
		if(left<n && arr[left]>arr[largest]) {
			largest=left;
		}
		if(right<n && arr[right]>arr[largest]) {
			largest=right;
		}
		if(largest!=i) {
		    
			int temp=arr[i];
			arr[i]=arr[largest];
			arr[largest]=temp;
			heapify(arr,n,largest);
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("- - - - - - - - - - - -");
		
	} 	
	
  public static void heapSortAscending(int[] arr) {
	
	  for(int i=(arr.length/2)-1;i>=0;i--) {
		  heapify(arr,arr.length,i);
	  }
	  int n=arr.length;
	  for(int i=n-1;i>=0;i--) {
	
		  int temp=arr[0];
		  arr[0]=arr[i];
		  arr[i]=temp;
		heapify(arr,i,0);
		  
	  }
	  
  }


}
