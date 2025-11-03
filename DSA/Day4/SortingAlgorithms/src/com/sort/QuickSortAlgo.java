package com.sort;

import java.util.Arrays;

public class QuickSortAlgo {
	
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
		
			if (pivot!=j){ 
				int temp=arr[pivot];
				arr[pivot]=arr[j];
				arr[j]=temp;
			}
			System.out.println(Arrays.toString(arr));
			System.out.println("pivot position : "+j+" Pivot number : "+arr[j]);
			System.out.println(arr[j] + "  Swapped with "+arr[pivot]);
			
			return j;
		}
		
		public static void QuickSortAlgoAscending(int[] arr,int start,int end) {
			if(start<end) { 
				int p=partition(arr,start,end);
				QuickSortAlgoAscending(arr,start,p-1);
				QuickSortAlgoAscending(arr,p+1,end);
				
			}
		}



	
	
	

}
