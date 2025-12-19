using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CMathLibDemo
{
    public class CMath
    {
        public void Add(int x, int y)
        {
            Console.WriteLine($"Addition = {x + y}");
        }

        private void Sub(int x, int y)
        {
            Console.WriteLine($"Substration = {x - y}");

        }


        protected void Mult(int x, int y)
        {
            Console.WriteLine($"Multiplication = {x * y}");

        }

        internal void Div(int x, int y)
        {
            Console.WriteLine($"Divison = {x / y}");
        }

        protected internal void Square(int x)
        {
            Console.WriteLine($"Square = {x * x}");
        }
    }

    public class Advmath1 : CMath
    {
        public void Adv_WrapperMethod()
        {
            base.Div(80, 2);
            base.Mult(2, 9);
            base.Square(5);
        }
    }
}

