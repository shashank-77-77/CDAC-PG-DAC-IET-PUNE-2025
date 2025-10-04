import java.util.Scanner;
public class ArrayService {
	
	public static void acceptData(int [][] arr)
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter number of column for row " + i);
			int col=sc.nextInt();
			arr[i]=new int[col];
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("Enter value for " + i + " , "+ j );
				arr[i][j]=sc.nextInt();
			}
		}
	}
	
	public static void displayData(int [][] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}


	public static int maxAllData(int[][] arr) {
		int max=arr[0][0];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(max < arr[i][j])
				{
					max=arr[i][j];
				}
			}
		}
		return max;
	}

	public static int[] maxRowwise(int[][] arr) {
		int [] temp=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			int max=Integer.MIN_VALUE;
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j] > max)
				{
					max = arr[i][j];
				}
			}
			temp[i]=max;
		}
		return temp;
	}

	public static int[] maxColwise(int[][] arr) {
		int maxLength=arr[0].length;
			for(int i=1;i<arr.length;i++)
			{
				if(maxLength <arr[i].length)
				{
					maxLength=arr[i].length;
				}
			}
		
		int temp [] =new int [maxLength];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(temp[j] <arr[i][j])
				{
					temp[j]=arr[i][j];
				}
			}
		}
		
		return temp;
	}

	public static int[] addColwise(int[][] arr) {
		int maxLength=arr[0].length;
		for(int i =0;i<arr.length;i++)
		{
			if(maxLength < arr[i].length)
			{
				maxLength=arr[i].length;
			}
		}
		int [] temp =new int[maxLength];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				temp[j]+=arr[i][j];
			}
		}
		return temp;
	}

	public static int[] addRowwise(int[][] arr) {
		int [] temp=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{	
					temp[i] += arr[i][j];	
			}
		}
		return temp;
		
	}
	
	 

}
