import java.util.Scanner;
public class Test2DArray {

	public static void main(String[] args) {
		int arr[][] = {{1,2,3},{4,5,6},{7,8,5}};
		int arr1[][]= {{4,3,2},{6,7,5},{8,7,9}};
		
		Scanner sc= new Scanner(System.in);
		int choice;
		Array2DServices.displayData(arr);
		System.out.println("========");
		Array2DServices.displayData(arr1);
		
		System.out.println("----------------------------------");
		
		System.out.println("1.Add all Numbers :");
		System.out.println("2.Add RowWise Addition :");
		System.out.println("3.Add ColmunWise Addition :");
		System.out.println("4.Find Maximum Of All Numbers :");
		System.out.println("5.Find Maximum Rowwise :");
		System.out.println("6.Find  Maximum Columnwise :");
		System.out.println("7.Addition of 2 Array :");
		System.out.println("8.Array Multiplication :");
		System.out.println("9.Find Transpose Of Array :");
		System.out.println("10.Check Identity Matrix :");
		System.out.println("11.Rotate Matrix Rows :");
		System.out.println("12.Rotate Matrix Columns :");
		System.out.println("13.Convert To 1D Array :");
		System.out.println("14.Exit :\n");
		System.out.println("Enter your choice : \n");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			int ans=Array2DServices.arrayAdd(arr);
			System.out.println("Adition of all numbers : " + ans);
			break;
			
		case 2:
			int [] arrnew =Array2DServices.rowAdd(arr);
			for(int val :arrnew)
			{
				System.out.println(val);
			}
			break;
		
		case 3:
			arrnew=Array2DServices.colWiseAdd(arr);
			for(int val:arrnew)
			{
				System.out.println(val);
			}
			break;
		
		case 4:
			int max=Array2DServices.maxArrayNum(arr);
			System.out.println("Max Number := " + max);
			break;
			
		case 5:
			 arrnew=Array2DServices.findMaxRowwise(arr);
			 for(int val:arrnew)
			 {
				 System.out.println(val);
			 }
			 break;
		
		case 6:
			arrnew=Array2DServices.findMaxColwise(arr);
			for(int val:arrnew)
			{
				System.out.println(val);
			}
			break;
		
		case 7:
			int [][] addition=Array2DServices.addArray(arr,arr1);
			Array2DServices.displayData(addition);
			break;
			
		case 8:
			int [][] multi=Array2DServices.multiArray(arr,arr1);
			Array2DServices.displayData(multi);
			break;
		 
		case 9:
			int [][] trans=Array2DServices.transArray(arr);
			Array2DServices.displayData(trans);
			break;
			
		case 10:
			boolean check=Array2DServices.identityCheck(arr);
			if(check)
			{
				System.out.println("It is Identity Matrix");
			}
			else
			{
				System.out.println("It's not identity matrix");
			}
			break;
		
		case 11:
			int [][] newarr=Array2DServices.rotateRowwise(arr);
			Array2DServices.displayData(newarr);
			break;
		
		case 12:
			newarr=Array2DServices.rotateColwise(arr);
			Array2DServices.displayData(newarr);
			break;
		
		case 13:
			 arrnew=Array2DServices.convert1DArray(arr);
			 for(int val : arrnew)
			 {
				 System.out.print(val + " , ");
			 }
			 break;
			
			
			
		
			
			
		
		}

	}

}
