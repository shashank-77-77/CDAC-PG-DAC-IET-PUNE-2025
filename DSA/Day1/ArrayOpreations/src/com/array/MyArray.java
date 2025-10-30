package com.array;

import java.util.Arrays;

public class MyArray {
		private int []arr;
		private int count;
		
	public MyArray()
	{
		arr=new int[10];
		count =0;
	}
	
	public MyArray(int[] arr, int count) {
		super();
		this.arr = arr;
		this.count = count;
	}

	public MyArray(int size)
	{
		arr = new int[size];
		count =0;
	}
	
	public MyArray(int [] arr)
	{
		this.arr=arr;
		count=arr.length;
	}
	
	public int getSize()
	{
		return count;
	}
	
	public int getCapacity()
	{
		return arr.length;
	}
	
	public boolean add(int x)
	{
		if(count < arr.length)
		{
			arr[count]=x;
			count++;
			return true;
		}
		return false;
	}
	
	public boolean addAtGivenPos(int value , int pos)
	{
		if(count < arr.length && pos < count)
		{
			for(int i=count ;i>pos;i--)
			{
				arr[i]=arr[i-1];
			}
			
			arr[pos]=value;
			count ++;
			return true;
		}
		return false;
	}
	
	public int SearchByValue(int value)
	{
		for(int i=0;i<count;i++)
		{
			if(arr[i] == value)
			{
				return i;
			}
		}
		return -1;
	}

	public boolean deleteByPos(int pos)
	{
		if(pos <count)
		{
			for(int i=pos;i<count-1;i++)
			{
				arr[i]=arr[i+1];
				
			}
			arr[count-1]=0;
			count--;
			return true;
		}
		return false;
	}
	
	public boolean deleteByValue(int value)
	{
		int index=SearchByValue(value);
		if(index != -1)
		{
			return deleteByPos(index);
		}
		return false;
	}
	
	public void rotateArray(boolean flag,int num) {
		if(flag) {
			//right rotation
			for(int cnt=0;cnt<num;cnt++) {
				int temp=arr[count-1];
				for(int i=count-1;i>0;i--) {
					arr[i]=arr[i-1];
				}
				arr[0]=temp;
			}
		}else{
			//left rotation
			for(int cnt=0;cnt<num;cnt++) {
				int first=arr[0];
				for(int i=0;i<count-1;i++) {
					arr[i]=arr[i+1];
				}
				arr[count-1]=first;
			}
		}
		
	}
	
	public int[] reverseArray(boolean flag) {
		if(flag) {
			for(int i=0,j=count-1;i<j;i++,j--) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			return arr;
		}else {
			int[] arr1=new int[count];
			for(int i=count-1,j=0;i>=0;i--,j++) {
				arr1[j]=arr[i];
			}
			return arr1;
		}
		
	}
	
	public int findMax() {
		int max=arr[0];
		for(int i=1;i<count;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}
	
	
	public int[] exchangeIndexValue() {
		
		int max=findMax();
		
		int[] arr1=new int[max+1];
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=-1;
		}
		
		for(int i=0;i<count;i++) {
			int index=arr[i];
			int value=i;
			arr1[index]=value;
		}
		return arr1;
	}
	
	public int FindSum()
	{
		int sum=0;
		for(int i=0;i<count;i++)
		{
			sum=sum+arr[i];
			
		}	
		
		return sum;
		
	}
	
	
	@Override
	public String toString() {
		return "MyArray [arr=" + Arrays.toString(arr) + "]";
	}

	

	}
