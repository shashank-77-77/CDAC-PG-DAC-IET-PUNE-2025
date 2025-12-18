namespace _15Demo_CMathLib
{
    public class CMath
    {
        // Public : available/ accessible within assembly and outside the assembly
        public void Add(int x, int y)
        {
            Console.WriteLine($"Add = {x +y}");
        }

        // Private : accessible only with the same class/ module
        private void Sub(int x, int y)
        {
            Console.WriteLine($"Sub = {x - y}");
        }

        // Protected -  Available with the assembly and outsid ethe assembly: if : accesible with the hierarchy of inheritance/ derived classess: 
        protected void Mult(int x, int y)
        {
            Console.WriteLine($"Mult = {x * y}");
        }

        //Internal: only available with the same assembly.
        internal void Div(int x, int y)
        {
            Console.WriteLine($"Div = {x / y}");
        }

        //Protected - Internal: only available with the same assembly and within hierarchey
        protected internal void Square(int x)
        {
            Console.WriteLine($"Square = {x * x}");
        }
    }

    public class AdvMath : CMath
    {
        public void Adv_WrapperMethod()
        {
            base.Div(50, 5);
            base.Mult(5, 5);
            base.Square(3);
        }
    }
}
