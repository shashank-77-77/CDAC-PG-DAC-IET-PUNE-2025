namespace _07Demo_Inheritance
{
    public class CMath
    {
        public int Add(int a, int b)
        {
            return a + b;
        }
        // Method overloading within same class
        public void Add(int a, int b, int c)
        {
            Console.WriteLine(a + b + c);
            //return a + b + c;
        }
        public void Sub(int a, int b)
        {
            Console.WriteLine("CMath Sub: {0}", (a - b));
        }
        public virtual void Mult(int a, int b)
        {
            Console.WriteLine("CMath Mult: {0}", (a * b));
        }
    }
    public class AdvancedMath : CMath
    {
        public override void Mult(int a, int b)
        {
            Console.WriteLine("Adv Math Mult: {0}", (a * b)* 100);
        }

        // Shadowing the base class method
        public new void Sub(int a, int b)
        {
            Console.WriteLine("Adv Math Sub: {0}" ,(a - b) * 2);
        }

        public void Add(int a, int b)
        {
            Console.WriteLine("Adv Math Add: {0}", (a + b) * 100);
        }

        // Method overloading within across the inherited class
        public int Add(int a, int b, int p, int q)
        {
            return a + b + p + q;
        }
    }
}
