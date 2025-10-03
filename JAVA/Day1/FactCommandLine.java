class FactCommandLine
{
	public int Fact(int num)
	{
		
		if(num<=1)
		{
			System.out.println("Error");
			return 1;	
		}
		else
		{
			int f=1;
			for(int i=1;i<num;i++)
			{
				f=f*i;
			}
			return f;
		}
	}
	public static void main(String args[])
	{
		if(args.length <= 0)
		{
			System.out.println("Error");
		}
		else
		{
			int n=Integer.parseInt(args[0]);
			FactCommandLine f1=new FactCommandLine();
			int fa=f1.Fact(n);
			System.out.println("Fact is : "+fa);
			
		}

	}

}

