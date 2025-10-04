import java.util.Scanner;
public class Test2dArray {

	public static void main(String[] args) {
		int [][] arr= new int[3][];
		ArrayService.acceptData(arr);
		ArrayService.displayData(arr);
		int choice=0;
		do {
		Scanner sc=new Scanner(System.in);
		System.out.println("1. find max of all data\n2. find max rowwise");
		System.out.println("3. find max column wise\n4. find addition rowwise");
        System.out.println("5. find addition columnwise\n6.exit");
        
        System.out.println("Enter choice");
         choice= sc.nextInt();
      
        	switch(choice)
        	{
        	case 1:
        		int max=ArrayService.maxAllData(arr);
        		System.out.println("Maximum number is :  "+ max);
        		break;
        		
        	case 2:
        		int [] arrnew=ArrayService.maxRowwise(arr);
        		for(int val : arrnew)
        		{
        			System.out.println("Max : "+ val);
        		}
        		break;
        		
        	case 3:
        		arrnew=ArrayService.maxColwise(arr);
        		for(int v:arrnew)
        		{
        			System.out.println(v);
        		}
        		break;
        		
        	case 4:
        		arrnew=ArrayService.addRowwise(arr);
        		
        		break;
        	
        	case 5:
        		arrnew=ArrayService.addColwise(arr);
        		for(int v:arrnew)
        		{
        			System.out.println("Row:"+v);
        		}
        		break;
        	
        	case 6:
        	 	System.out.println("Thank you for visiting......");
            	sc.close();
            	break;
            default:
            	System.out.println("wrong choice");
            		
        	}
		}while(choice != 6);
        
        

	}

}
