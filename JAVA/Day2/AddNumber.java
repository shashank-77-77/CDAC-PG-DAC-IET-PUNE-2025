import java.util.Scanner;
public class TestArray1
{
	public static void acceptData(int []arr)
	{
		Scanner sc =new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
	}
	
	public static int AddNumber(int [] arr)
	{
	 	int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		return sum;
	}

	public static void displayData(int [] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(i + " : " + arr[i]);
		}
	}
	public static void main(String args[])
	{
		
		int [] arr=new int[10];
		accpetData(arr);
		int sum=AddNumber(arr);
		System.out.println("Addition : "+sum);
		displayData(arr);		
		
	}


}
