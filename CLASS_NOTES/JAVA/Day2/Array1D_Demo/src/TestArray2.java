import java.util.Scanner;

public class TestArray2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[10];
		ArrayService.acceptData(arr);
		ArrayService.displayData(arr);
		int choice;
		do {
		System.out.println("1. Search a number\n2. find max\n3. find min");
		System.out.println("4. add all numbers\n5. find all occurances\n6. find nth maximum");
		System.out.println("7. find nth minimum\n8.exit\n choice :");
		choice=sc.nextInt();
		switch(choice){
		case 1:
			System.out.println("enetr data to search");
			int num=sc.nextInt();
			int pos=ArrayService.searchByValue(arr, num);
			if(pos!=-1) {
				System.out.println(num+" found at position: "+pos);
			}else {
				System.out.println("not found");
			}
			break;
		case 2:
			 int max=ArrayService.findMax(arr);
			 System.out.println("Maximum number : "+max);
			 
			break;
		case 3:
			 int min=ArrayService.findMin(arr);
			 System.out.println("Minimum number : "+min);
			 
			break;
		case 4:
			 int sum=ArrayService.adddata(arr);
			 System.out.println("Maximum number : "+sum);
			 break;
		case 5:
			System.out.println("enter data to search");
			num=sc.nextInt();
			int[] arrpos=ArrayService.findAllOccurences(arr,num);
			if(arrpos!=null) {
				System.out.println("all positions are : ");
				ArrayService.displayData(arrpos);
			}else {
				System.out.println("not found");
			}
			break;
		case 6:
			System.out.println("enter n");
			int n=sc.nextInt();
			int maxnum=ArrayService.findNthMax(arr,n);
			System.out.println(n+" Maximum value :  "+maxnum);
			break;
		case 7:
			System.out.println("enter n");
			n=sc.nextInt();
			int minnum=ArrayService.findNthMin(arr,n);
			System.out.println(n+" Maximum value :  "+minnum);
			break;
		case 8:
			System.out.println("thank you for visiting....");
			//System.gc();
			//System.exit(0);
		default:
			System.out.println("wrong choice");
			
		}
		}while(choice!=8);
		
	}
}
