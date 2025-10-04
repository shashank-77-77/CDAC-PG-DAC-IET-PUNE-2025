import java.util.Scanner;

public class ArrayService {
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
			System.out.print(i+": "+arr[i]+",  ");
		}
		System.out.println("-----------------------");
		
	}

	//add all values of array and retun sum of numbers
	public static int adddata(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		return sum;
	}
	public static int[] findAllOccurences(int[] arr, int num) {
		int[] temp=new int[arr.length];
		for(int i=0;i<temp.length;i++) {
			temp[i]=-1;
		}
		int cnt=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				temp[cnt]=i;
				cnt++;
			}
		}
		if(cnt>0) {
			return temp;
		}
		return null;
	}
	public static int findNthMax(int[] arr, int n) {
		for(int i=0;i<n;i++) {
			int pos=findMaxpos(arr,i);
			//swap(i,pos)
			int temp=arr[i]; ///[7,5,3,2,2]
			arr[i]=arr[pos];
			arr[pos]=temp;
			//displayData(arr);
		}
		return arr[n-1];
	}
	private static int findMaxpos(int[] arr, int start) {
		int pos=start;
		int max=arr[pos];
		for(int i=start+1;i<arr.length;i++) {
			if(max<arr[i]) {
				pos=i;
				max=arr[i];
			}
		}
		return pos;
	}
	//find nth min
	public static int findNthMin(int[] arr, int n) {
		for(int i=0;i<n;i++) {
			//find min of array starting from i till end
			int pos=findMinPos(arr,i);
			//swap(i,pos)
			int temp=arr[i]; ///[7,5,3,2,2]
			arr[i]=arr[pos];
			arr[pos]=temp;
			//displayData(arr);
		}
		return arr[n-1];
	}
	public static int findMinPos(int[] arr, int start) {
		int pos=start;
		int min=arr[pos];
		for(int i=start+1;i<arr.length;i++) {
			if(min>arr[i]) {
				pos=i;
				min=arr[i];
			}
		}
		return pos;
	}
	

}
