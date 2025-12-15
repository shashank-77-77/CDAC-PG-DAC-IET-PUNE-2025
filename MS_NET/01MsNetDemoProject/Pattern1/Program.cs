namespace Pattern1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int n = 4;

            for (int i = 1; i <= n; i++)
            {
                for (int s = 1; s <= n - i; s++)
                {
                    Console.Write(" ");
                }

                
                Console.Write("*");
                for (int j = 2; j < 2 * i - 1; j++)  
                {
                    Console.Write(" ");
                }
                if (2 * i - 1 > 1)  
                {
                    Console.Write("*");
                }
                Console.WriteLine();
            }


            for (int i = n - 1; i >= 1; i--)
            {

                for (int s = 1; s <= n - i; s++)
                {
                    Console.Write(" ");
                }


                Console.Write("*");
                for (int s1 = 2; s1 < 2 * i - 1; s1++)
                {
                    Console.Write(" ");
                }
                if (2 * i - 1 > 1)
                {
                    Console.Write("*");
                }
                Console.WriteLine();
            }
        }
    }
}


