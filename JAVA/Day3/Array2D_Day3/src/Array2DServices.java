
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

	public static int[][] addArray(int[][] arr, int[][] arr1) {
		int [][] temp = new int[arr.length][arr1[0].length];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0 ;j<arr[i].length;j++)
			{
				temp[i][j]=arr[i][j] + arr1[i][j];
			}
		}
		return temp;
	}

	public static int[][] multiArray(int[][] arr, int[][] arr1) {
		int temp [][] =new int[arr.length][arr1[0].length];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				for(int k=0;k<arr[0].length;k++)
				{
					temp[i][j] +=arr[i][k] * arr1[k][j];
				}
			}
		}
		return temp;
	}

	public static int[][] transArray(int[][] arr) {
		int [][] temp =new int[arr.length][arr[0].length];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				temp[i][j]=arr[j][i];
			}
		}
		return temp;
	}

	public static boolean identityCheck(int[][] arr) {
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				if((i == j) && (arr[i][j] != 1))
				{
					return false;
				}
				else if((i != j) && (arr[i][j] != 0))
				{
					return false;
				}
			}
		}
		return true;
	}

	public static int[][] rotateRowwise(int[][] arr) 
	{
		int [][]temp = new int [arr.length][arr[0].length];
		for(int i =0 ; i<arr.length;i++)
		{
			for(int j=0 ;j<arr[0].length;j++)
			{
				temp[i][j] = arr[i][j];
			}
		}
		
		int [] temp1 = temp[0];
		
		for(int i=0;i<temp.length-1;i++)
		{
			temp[i]=temp[i+1];
		}
		
		temp[arr.length-1] = temp1;
		
		return temp;
	}

	public static int[][] rotateColwise(int[][] arr) 
		{
		int [] [] temp  = new int [arr.length][arr[0].length];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				temp[i][j]=arr[i][j];
			}
		}
			int [] temp1= new int[temp.length];
			for(int i=0;i<temp1.length;i++)
			{
				temp1[i] = temp[i][arr[0].length-1];
			}
			
			for(int i=0 ; i<temp.length;i++)
			{
				for(int j=temp.length-2;j>=0;j--)
				{
					temp[i][j+1]=temp[i][j];
				}
			}
			for(int i=0;i<temp.length;i++)
			{
				temp[i][0]=temp1[i];
			}
		return temp;
		}

	public static int[] convert1DArray(int[][] arr) {
		int [] temp=new int [arr.length * arr[0].length];
		int cnt=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				temp[cnt]=arr[i][j];
				cnt++;
			}
		}
		return temp;
	}
	
	
}
