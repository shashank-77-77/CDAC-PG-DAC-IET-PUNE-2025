import java.util.Scanner;

public class TestArray1 {
	public static void acceptData(int[] arr) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter data");
			arr[i]=sc.nextInt();
		}
		
	}
	//return smallest number from array
	public static int findMin(int[] arr) {
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		return min;
	}
	
	//return largest number from array
	public static int findMax(int[] arr) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr size of array");
		int size=sc.nextInt();
		int[] arr=new int[size];  
		//acceptdata
		acceptData(arr);
		//add all numbers
        int sum=adddata(arr); 
		//display ans;
        System.out.println("Addition : "+sum);
        displayData(arr);
        System.out.println("enter data for search");
        int f=sc.nextInt();
        int pos=searchByValue(arr,f);
        if(pos!=-1) {
        	System.out.println(f+" Found at position : "+pos);
        }else {
        	System.out.println(f+ "not found");
        }
        sc.close();
	}

	 //sequential search data in an array 
	 public static int searchByValue(int[] arr, int f) {
		for(int i=0;i<arr.length;i++) {
			if(f==arr[i]) {
				return i;
			}
		}
		return -1;
	}
	//display all values from array
	public static void displayData(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(i+": "+arr[i]);
		}
		
	}

	//add all values of array and retun sum of numbers
	private static int adddata(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		return sum;
	}

}
