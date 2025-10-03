import java.util.Scanner;
class TableCommandLine
{
	public static void PrintTable(int n)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(n +" * "+ i +" = " + (n * i));
		}		
	}
	public static void main(String [] args)
	{
		if(args.length<0)
		{
			System.out.println("Error");
		}
		else
		{
			int num=Integer.parseInt(args[0]);
			PrintTable(num);
		}
 	}
}
		