package com.test;
import com.search.*;
public class ServiceTest {

	public static void main(String[] args) {
		int[] arr= {12,13,16,23,27,45,56,58,62,65,70};
		int position=SearchService.binarySearchnonRecurssive(arr,70);
		if(position!=-1) {
			System.out.println("binary search number found at position : "+position);
		}else {
			System.out.println("number not found");
		}
		
		position=SearchService.binarySearchRecurssive(arr,56,0,10);
		if(position != -1)
		{
			System.out.println("number found at position :" + position);
		}
		else
		{
			System.out.println("Number not  found");
		}
		
		position=SearchService.sequentialSearch(arr,16);
		if(position!=-1) {
			System.out.println("Sequential Search number found at position : "+position);
		}else {
			System.out.println("not found");
		}
	}
	

}
