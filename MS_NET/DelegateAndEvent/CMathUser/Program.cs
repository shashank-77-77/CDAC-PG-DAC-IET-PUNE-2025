using CMathLibDemo;

namespace CMathUser
{
    internal class Program
    {
        static void Main(string[] args)
        {
            CMath cMath = new CMath();
            cMath.Add(10, 20);
            MyMath myMath = new MyMath();
            myMath.WrapperMethod();

            Advmath1 advMath = new Advmath1();
            advMath.Adv_WrapperMethod();
        }


    }
    public class MyMath : CMath
    {
        public void WrapperMethod()
        {
            base.Mult(2, 2);
            base.Square(2);
        }
        public void Mult(int p, int q)
        {
            base.Mult(p, q);
        }
    }
}
