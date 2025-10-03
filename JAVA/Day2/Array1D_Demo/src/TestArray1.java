import java.util.Scanner;

public class TestArray1 {
	//Accept array elements
	public static void acceptData(int [] arr)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
				
	}
	//Addition of all number of array
	public static int AddNumber(int [] arr)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		return sum;
	}
	// Display Array Elements
	public static void displayData(int [] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println( i + " : " + arr[i]);
		}
	}
	//Find Minimum numbers
	public static int FindMin(int [] arr)
	{
		int min = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] < min)
			{
			min=arr[i];
			}
		}
		return min;
	}
	//Find Maximum numbers
	
	public static int FindMax(int [] arr)
	{
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] > max)
			{
			max=arr[i];
			}
		}
		return max;
	}
	//find all occurence of array
	public static int [] findAllOccurance(int [] arr,int num)
	{
		int arrpos[] =new int[arr.length];
		int cnt=0;
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i] == num)
			{
				arrpos[cnt] = i;
				cnt++;
			}
		}
		
		return arrpos;
	}
	
	//Find Nth Max number 
	public static int findNthMin(int [] arr, int num)
	{
		for(int i=0;i<arr.length;i++)
		{
			int pos=FindMinPos(arr,num);
			int temp=arr[i];
			arr[i]=arr[pos];
			arr[pos]=temp;
		}
		
		return arr[num - 1];
	}
	

	private static int FindMinPos(int[] arr, int start) {
		int pos=start;
		int min =arr[pos];
		for(int i=start+1 ;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				pos=i;
				min=arr[i];
			}
		}
		
		return pos;
	}
	public static void main(String[] args) {
		int [] arr=new int[5];
		acceptData(arr);
		int sum=AddNumber(arr);
		System.out.println("Addition :" + sum );
		displayData(arr);
		int min =FindMin(arr);
		System.out.println("Min number is  : "+ min);
		int max =FindMax(arr);
		System.out.println("Max number is  : "+ max);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for Occurance");
		int num=sc.nextInt();
		int result [] = findAllOccurance(arr, num);
		for(int i =0 ;i<result.length;i++)
		{
		System.out.println(result[i]);
		}
		System.out.println("Enter number to search");
		num=sc.nextInt();
		int min1=findNthMin(arr, num);
		System.out.println("Minimum number pos" + min);
		
		sc.close();

	}
	

}
