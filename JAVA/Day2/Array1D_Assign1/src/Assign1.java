import java.util.Scanner;

	public class Assign1 {
	public static void acceptData(int [] arr)
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter array elements");
		for(int i=0 ; i<arr.length ; i++)
		{
			arr[i] = sc.nextInt();
		}
	}
	
	public static boolean IsPrime(int n)
	{
		int arrnew[]=new int[arr.length];
		for(int i=2 ; i<n ; i++)
		{
			
			if(n % i ==  0)
			{
				return false;
			}
			
		}
		return true;
	}
	
	public static int findOddNumber(int arr[])
	{
		int sum =0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] % 2 != 0)
			{
				sum=sum+arr[i];
				System.out.println(arr[i]);
			}
		}
		return sum;
	}
	
	public static int findFactNum(int arr[])
	{
		int fact=1;
		for(int i =2;i<arr.length;i++)
		{
			if(arr[i]<7)
			{
				fact = fact * arr[i];
			}
		}
		return fact;
	}

	public static void main(String[] args)
	{
		int [] arr = new int [5];
		acceptData(arr);
		int result=findOddNumber(arr);
		System.out.println("Addition of odd numbers :" + result);
		int fact=findFactNum(arr);
		System.out.println("Factorial number is "+fact);
		
		
	}

}
