package com.sorting;

import java.util.Arrays;
import java.util.Scanner;

import com.beans.Employee;

public class EmployeeBubbleSort {
	public static void EmpBubble(Employee [] arr)
	{
		int n=15;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j].getSal()>arr[j+1].getSal())
				{
					Employee temp= arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			System.out.println(Arrays.toString(arr));
			System.out.println("-------------------------------------------");
		}
		
		
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter employee details");
			int empid=sc.nextInt();
			String ename=sc.next();
			double sal=sc.nextDouble();
			Employee newEmp= new Employee(empid,ename,sal);
			
			
			int j =n-1;
			while(j>=0 && arr[j].getSal()>newEmp.getSal())
			{
				arr[j+1]=arr[j];
				j--;
			}
			
				arr[j+1]=newEmp;
				n--;
				
				System.out.println(Arrays.toString(arr));
		}
		
		
		sc.close();
	}
	
}
