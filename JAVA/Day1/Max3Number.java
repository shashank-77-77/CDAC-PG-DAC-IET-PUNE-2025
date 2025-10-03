import java.util.Scanner;
class Max3Number
{
	public static void main(String [] args)
	{
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter First Number");
		int num1=s1.nextInt();

		System.out.println("Enter Second Number");
		int num2=s1.nextInt();
		
		System.out.println("Enter Third Number");
		int num3=s1.nextInt();

		if((num1 > num2) && (num1 > num3))
		{
			System.out.println("First number is greater  :"+ num1);
		}
		else if((num2 > num1) && (num2 > num3))
		{
			System.out.println("Second number is greater  :"+ num2);
		}
		else
		{
			System.out.println("Third number is greater  :"+ num3);
		}
		s1.close();

	}
}
