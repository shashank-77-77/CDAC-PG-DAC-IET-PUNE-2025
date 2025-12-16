using System.ComponentModel;
using System.Security.Cryptography.X509Certificates;

namespace OverLoading
{
    internal class Program
    {
        public int  add(int a ,int b)
        {
            return a + b;
        }

        public int add(int a,int b,int c)
        {
            return a + b + c;
        }
        static void Main(string[] args)
        {
            Program p1 = new Program();
            Console.WriteLine(p1.add(20, 10));
            Console.WriteLine(p1.add(10, 20, 30));

        }
    }
}
