import java.util.Scanner;
class Factorial
{
	public static int Fact(int n)
	{
		if(n<=1)
		{
			return 1;
		}
		else
		{
			int f=1;
			
			for(int i=1;i<=n;i++)
			{
				f=f*i;
				
			}
			return f;
		}
	}
	public static void main(String [] args)	
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter number for factorial ");
		int n=s1.nextInt();
		int num=Fact(n);
		System.out.println("Factorial of number is : "+num);

	}

}