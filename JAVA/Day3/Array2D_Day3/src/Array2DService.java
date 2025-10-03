import java.util.Scanner;

public class Array2DService {

	public static void acceptData(int[][] arr) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
			System.out.println("enter data for row "+i+" column: "+j);
			arr[i][j]=sc.nextInt();
			
			}
		}
		
	}

	public static void displayData(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("---------------------------------");
		
	}

	public static int addAllNumbers(int[][] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				sum+=arr[i][j];
			}
			
		}
		return sum;
		
	}

	public static int[] addRowwise(int[][] arr) {
		int[] temp=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			temp[i]=0;
			for(int j=0;j<arr[i].length;j++) {
				temp[i]+=arr[i][j];
			}
		}
		return temp;
	}

	public static int[] addColumnwise(int[][] arr) {
		int[] temp=new int[arr[0].length];
		for(int i=0;i<arr[0].length;i++) {  
			for(int j=0;j<arr.length;j++) {  
				temp[i]+=arr[j][i];
			}
		}
		return temp;
	}

	public static int[][] add2Darrays(int[][] arr, int[][] arr1) {
		int[][] temp=new int[arr.length][arr[0].length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				temp[i][j]=arr[i][j]+arr1[i][j];
			}
		}
		return temp;
	}

	public static int[][] multiplyArray(int[][] arr, int[][] arr1) {
		if(arr.length==arr1[0].length) {
			int[][] temp=new int[arr.length][arr1[0].length];
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[0].length;j++) {
					for(int k=0;k<arr[0].length;k++) {
						temp[i][j]+=arr[i][k]*arr1[k][j];
					}
				}
			}
			return temp;
		}
		return null;
	}

	public static int[][] findTranspose(int[][] arr) {
		if(arr.length==arr[0].length) {
		int[][] temp=new int[arr.length][arr[0].length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				temp[i][j]=arr[j][i];
			}
		}
		return temp;
		}
		return null;
	}

	public static boolean checkIdentity(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if((i==j) && (arr[i][j]!=1)){
					return false;
				}else if((i!=j)&&(arr[i][j]!=0)){
					return false;
				}
			}
		}
		return true;
	}
    /// rotate rows by 1 in upward direction 
	public static int[][] rotateRow(int[][] arr,int n) {
		//allocate memory for temp
		int[][] temp=new int[arr.length][arr[0].length];
		//copy arr into temp
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				temp[i][j]=arr[i][j];
			}
		}
		//store location of 1st row in temp1
		int[] temp1 = temp[0];
		//evry row will point to next row except last row
		for(int i=0;i<temp.length-1;i++) {
			temp[i]=temp[i+1];
		}
		//last row point to 0 th row
		temp[temp.length-1]=temp1;
		return temp;
			
	}

	public static int[][] rotateColumn(int[][] arr, int n) {
		//allocate memory for temp
		int[][] temp=new int[arr.length][arr[0].length];
		//copy arr into temp
		for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[0].length;j++) {
			temp[i][j]=arr[i][j];
		}
		}
		//copy last column into temp1
		int[] temp1=new int[temp.length];
		for(int i=0;i<temp1.length;i++) {
			temp1[i]=temp[i][temp[0].length-1];
		}
		//shift all columns towards right by 1 column
		//starting from 2nd  last column
		for(int i=0;i<temp.length;i++) {
			for(int j=temp[0].length-2;j>=0;j--) {
				temp[i][j+1]=temp[i][j];
			}
		}
		//copy temp1 into 0th column
		for(int i=0;i<temp.length;i++) {
			temp[i][0]=temp1[i];
		}
		return temp;
				
	}

	public static int[] convertTo1DArray(int[][] arr) {
		int[] temp=new int[arr.length*arr[0].length];
		int cnt=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				temp[cnt]=arr[i][j];
				cnt++;
			}
		}
		return temp;
	}

}
