
public class Array2DServices 
{
	public static void displayData(int arr[][])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}
	}

	public static int arrayAdd(int[][] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				sum+=arr[i][j];
			}
		}
		return sum;
	}

	public static int[] rowAdd(int[][] arr) {
		int [] temp=new int[arr[0].length];
		int cnt=0;
		for(int i=0;i<arr.length;i++)
		{
			int sum=0;
			for(int j=0;j<arr[i].length;j++)
			{
				sum +=arr[i][j];
			}
			temp[cnt]=sum;
			cnt++;
		}
		return temp;
	}

	public static int[] colWiseAdd(int[][] arr) {
		int temp [] =new int[arr[0].length];
		for(int i=0;i<arr[0].length;i++)
		{
			temp[i]=0;
			for(int j=0;j<arr.length;j++)
			{
				temp[i]+=arr[j][i];
			}
		}
		return temp;
	}

	public static int maxArrayNum(int[][] arr) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j] > max)
				{
					max=arr[i][j];
				}
			}
		}
		return max;
	}

	public static int[] findMaxRowwise(int[][] arr) {
		int [] temp=new int[arr[0].length];
		int cnt=0;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j] > max)
				{
					max=arr[i][j];
				}
			}
			temp[cnt]=max;
			cnt++;
		}
		return temp;
	}

	public static int[] findMaxColwise(int[][] arr) {
		int [] temp=new int[arr[0].length];
		int max=Integer.MIN_VALUE;
		int cnt=0;
		for(int i=0;i<arr[0].length;i++)
		{		
			temp[i]=0;
			for(int j=0;j<arr.length;j++)
			{
				temp[i]=arr[j][i];
				
				if(arr[i][j]> max)
				{
					max=arr[i][j];
				}
				
			}
			temp[cnt]=max;
			cnt++;
			
		}
		return temp;
	}
	
	
}
