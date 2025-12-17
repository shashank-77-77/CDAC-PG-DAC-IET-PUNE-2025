namespace SealClass
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Code ........");
        }
    }
    public sealed class CMath
    {
        public int Add(int x, int y)
        {
            return x + y;
        }
        public int Sub(int x, int y)
        {
            return x - y;
        }
    }

    public class AdvanceMath
    {
        public virtual int Square(int x)
        {
            return x * x;
        }
    }

    public class MyMath : AdvanceMath
    {
        public virtual void SayHello()
        {
            Console.WriteLine("Hello Everyone !");
        }
        public sealed override int Square(int x)
        {
            return x * x * 100;
        }
    }

    public class MyMath2 : MyMath
    {
        public override void SayHello()
        {
            Console.WriteLine("Hi Shashank and Soham ");
        }
    }
}
