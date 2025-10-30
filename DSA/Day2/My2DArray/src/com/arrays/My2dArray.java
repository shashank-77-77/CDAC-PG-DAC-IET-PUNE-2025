package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class My2dArray {
	private int [][] arr;

	public My2dArray() {
		arr=new int[3][3];
	}
	
	public My2dArray(int rows,int cols)
	{
		arr=new int[rows][cols];	
	}
	
	public void acceptData()
	{
			Scanner sc=new Scanner (System.in);
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr[i].length;j++)
				{
					System.out.println("Enter value "+ i +","+j);
					arr[i][j]=sc.nextInt();
				}
			}
	}
	
	public void displayData()
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j] +"\t");
			}
			System.out.println();
		}
		System.out.println("----------------------------------");
	}
	
	public int[] findSumRowWise() {
		int[] sumrows=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++) 
			{
			   sumrows[i] += arr[i][j];
			}
		}
		System.out.println(Arrays.toString(sumrows));
		return sumrows;
	}
	
	public int [] findSumColWise()
	{
		int [] sumcols=new int [arr[0].length];
		for(int i=0;i<arr[0].length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				sumcols[i]+=arr[j][i];
			}
		}
		System.out.println(Arrays.toString(sumcols));
		return sumcols;
	}
	
	public void rowRotation(boolean flag ,int num)
	{
		if(flag)
		{
			for(int cnt=0;cnt<num;cnt++)
			{
				int [] temp=arr[0];
				for(int i=0;i<arr.length-1;i++)
				{
					arr[i]=arr[i+1];
				}
				arr[arr.length-1]=temp;
			}
		}
		else
		{
			for(int cnt=0;cnt<num;cnt++)
			{
				int []temp =arr[arr.length-1];
				for(int i=arr.length-1;i>0;i--)
				{
					arr[i]=arr[i-1];
				}
				arr[0]=temp;
			}
		}
	}
	
	public void colRotation(boolean flag ,int num)
	{
		if(flag)
		{
			for(int cnt=0;cnt<num;cnt++)
			{
				int [] temp=new int[arr.length];
				for(int i=0;i<arr.length;i++)
				{
					temp[i]=arr[i][arr[0].length-1];
				}
				
				for(int i=0;i<arr.length;i++)
				{
					for(int j=arr[0].length-2;j>=0;j--)
					{
						arr[i][j+1] = arr[i][j];
					}
				}
				
				for(int i=0 ;i<arr.length;i++)
				{
					arr[i][0]=temp[i];
				}
			}
		}
		else
		{
			for(int cnt =0;cnt<num;cnt++)
			{
				int []temp=new int [arr.length];
				for(int i=0;i<arr.length;i++)
				{
					temp[i]=arr[i][0];
				}
				
				for(int i=0;i<arr.length;i++)
				{
					for(int j=0;j<arr[0].length;j++)
					{
						arr[i][j-1]=arr[i][j];
					}
				}
				
				for(int i=0;i<arr.length;i++)
				{
					arr[i][arr[0].length-1]=temp[i];
				}
			}
		}
	}
	
	


	
	@Override
	public String toString() {
		return "My2dArray [arr=" + Arrays.toString(arr) + "]";
	}

	
}
