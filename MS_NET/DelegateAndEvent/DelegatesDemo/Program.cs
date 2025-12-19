namespace DelegatesDemo
{
    public delegate void MyDelegte();
    public delegate void MyDelegate2(String str);

    public delegate int  MyAddDelegate(int p,int q);
    public delegate int MySquareDelegate(int x);

    internal class Program
    {
        static void Main(string[] args)
        {
         CMath cMath = new CMath();
            MyAddDelegate addDel = new MyAddDelegate(cMath.Add);
            Console.WriteLine("Enter first number");
            int n1=Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Enter Second Number");
            int n2=Convert.ToInt32(Console.ReadLine());

            int addAns = addDel(n1, n2);

            MySquareDelegate mySquareDel = new MySquareDelegate(cMath.square);
            int sqResult=mySquareDel.Invoke(n1);
            Console.WriteLine($"Addition := {addAns} , Square={sqResult}");
        }

        static void SayHi()
        {
            Console.WriteLine("Hiii");
        }

        static void SaySomeThing(string name)
        {
            Console.WriteLine($"Hello {name}");
        }
    }
    public class CMath
    {
        public int Add(int x ,int y) 
        { 
            return x + y; 
        }

        public int square(int x)
        {
            return x * x;
        }

    public class MyClass
        {
            public void sayHello()
            {
                Console.WriteLine("Hello");
            }

            public void Greet(String name)
            {
                Console.WriteLine($"hello {name}!!");

            }
        }

    }
}
