package com.sort;

import java.util.Arrays;

public class InsertionSortAlgo {

	public static void insertionSortingAscending(int[] arr) {
		for(int i=1;i<arr.length;i++)
			{
			  int j=i-1;
			  int key =arr[i];
			  
			  while(j>=0 && arr[j]>key)
			  {
				  arr[j+1]=arr[j];
				  j--;
			  }
			  
			  arr[j+1]=key;
			  System.out.println(Arrays.toString(arr));
			}
		}

	public static void insertionSortingDescending(int[] arr) {
		for(int i=1;i<arr.length;i++)
		{
			int j=i-1;
			int key=arr[i];
			
			while(j>=0 && arr[j]<key)
			{
				arr[j+1]=arr[j];
				j--;
				
			}
			arr[j+1]=key;
			System.out.println(Arrays.toString(arr));
		}
		
	}
	

}
