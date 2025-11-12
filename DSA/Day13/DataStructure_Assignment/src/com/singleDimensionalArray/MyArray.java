package com.singleDimensionalArray;

public class MyArray {

	
	public int addArrayDigit(int [] arr)
	{
	int sum=0;
	for(int i =0;i<arr.length;i++)
	{
		
		sum=sum+arr[i];
		System.out.println("Sum of Digits" + sum);
	}
	return sum;
	}
	
	public static int sumOfDigits(int num) 
	{
	        num = Math.abs(num);
	        int sum = 0;
	        while (num > 0) {
	            sum += num % 10;
	            num /= 10;
	        }
	        return sum;
	    }
	
	public int[] PrimeFact(int[] arr) {
	    int[] temp = new int[arr.length];
	    for (int i = 0; i < arr.length; i++) {
	        if (isPrime(arr[i])) {
	            temp[i] = factorial(arr[i]);
	            System.out.println("Prime: " + arr[i] + ", Factorial: " + temp[i]);
	        } else {
	            temp[i] = 0; 
	        }
	    }
	    return temp;
	}

	public boolean isPrime(int num) {
	    if (num <= 1) return false;
	    for (int j = 2; j <= Math.sqrt(num); j++) {
	        if (num % j == 0) return false;
	    }
	    return true;
	}

	public int factorial(int num) {
	    int fact = 1;
	    for (int i = 2; i <= num; i++) {
	        fact *= i;
	    }
	    return fact;
	}

	
	public int MaxPrime(int [] arr)
	{
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] % 2 != 0)
			{
				if(max<arr[i])
				{
					max=arr[i];
				}
			}
		}
		System.out.println("Max prime number is " + max);
		return max;
	}
	
	public int [] CopyArray(int [] arr)
	{
		int [] temp =new int[arr.length];
		int rev=0,rem=0;
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] % 2 !=0 && arr[i]>5)
			{
				rem=arr[i]%10;
				rev=(rev * 10) + rem;
				arr[i]=arr[i]/10;
				temp[i]=rev;
			}else
			{
				temp[i]=arr[i];
			}
			System.out.println(temp[i]);
		}
		
		return temp;
	}
	
	
}

