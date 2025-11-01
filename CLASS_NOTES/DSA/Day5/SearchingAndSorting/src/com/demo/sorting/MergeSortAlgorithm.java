package com.demo.sorting;

import java.util.Arrays;

public class MergeSortAlgorithm {
	
	private static void merge(int[] arr, int start, int mid, int end) {
		//length of leftarray
		int n1=mid-start+1;
		//length rightarray
		int n2=end-mid;
		int[] leftarray=new int[n1];
		int[] rightarray=new int[n2];
		//copy arrays
		for(int i=0;i<n1;i++) {
			leftarray[i]=arr[start+i];
		}
		for(int i=0;i<n2;i++) {
			rightarray[i]=arr[mid+1+i];
		}
		int i=0;
		int j=0;
		int k=start;
		//copy smaller value either from leftarray or rightarray into arr
		while(i<n1 && j<n2) {
			if(leftarray[i]<rightarray[j]) {
				arr[k]=leftarray[i];
				i++;
				k++;
			}else {
				arr[k]=rightarray[j];
				j++;
				k++;
			}
		}
		//copy remaining part of leftarray into arr
		while(i<n1) {
			arr[k]=leftarray[i];
			i++;
			k++;
		}
		//copy remaining part of leftarray into arr
		while(j<n2) {
			arr[k]=rightarray[j];
			j++;
			k++;
		}
		System.out.println(start+","+mid+","+end);
		System.out.println(Arrays.toString(leftarray));
		System.out.println(Arrays.toString(rightarray));
		System.out.println("------------------------------------");
		
	}
   public static void mergeSortAscending(int[] arr,int start, int end) {
	   if(start<end) {
		   //calculate mid
		   int mid=(start+end)/2;
		   //left tree to sort
		   mergeSortAscending(arr,start,mid);
		   //right tree sorting
		   mergeSortAscending(arr, mid+1, end);
		   //merge the arrays
		   merge(arr,start,mid,end);
	   }
   }


}
