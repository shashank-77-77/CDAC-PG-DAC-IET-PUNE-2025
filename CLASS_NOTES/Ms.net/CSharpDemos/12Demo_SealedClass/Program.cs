namespace _12Demo_SealedClass
{
    internal class Program
    {
        static void Main(string[] args)
        {
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
    public class AdvanceMath //: CMath 
    {
        //public int WrapperAdd(int x, int y)
        //{ 
        //    CMath cMath = new CMath();
        //    return cMath.Add(x, y);
        //    //return base.Add(x, y);
        //}
        public virtual int Square(int x)
        {
            return x * x;
        }
    }

    public class MyMath: AdvanceMath
    {
        public virtual void SayHi()
        {
            Console.WriteLine("Hi there!");
        }
        public sealed override int Square(int x)
        {
            return x * x * 100;
        }
    }
    public class MyMath2 : MyMath
    {
        public override void SayHi()
        {
            Console.WriteLine("Hello Hugh Jackman!");
        }
        //public override int Square(int x)
        //{
        //    return x * x * 1000;
        //}
    }
}
