using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HelloWorldOldVersion
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.Write("hello world \n");

            Console.Write("Enter your name \n");
            String name=Console.ReadLine();

            Console.WriteLine($"Hello ,{name}");
           

            int a = 5;
            Console.Write("Table of " + a);

            for (int i=1;i<=10;i++)
            {
                int c = a * i;
                Console.Write("\n"+c);
            }
        }
    }
}
