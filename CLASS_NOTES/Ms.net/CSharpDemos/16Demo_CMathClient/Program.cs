using _15Demo_CMathLib;

namespace _16Demo_CMathClient
{
    internal class Program
    {
        static void Main(string[] args)
        {
            CMath cMath = new CMath();
            cMath.Add(10, 20);
            MyMath myMath = new MyMath();
            myMath.WrapperMethod();

            AdvMath advMath = new AdvMath();
            advMath.Adv_WrapperMethod();
        }
    }
    public class MyMath : CMath
    {
        public void WrapperMethod()
        {
            base.Mult(2,2);
            base.Square(2);
        }
        public void Mult(int p, int q)
        {
            base.Mult(p, q);
        }
    }
}
