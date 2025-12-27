namespace _18Demo_Delegates
{
    // A delegate is a Type Safe Function Pointer
    // - Event Handlers

    // Syntax : 
    // (accessModifier) delegate (Return-Type of Method) (Delegate NAme)(Parameter-Type(s));
    public delegate void MyDelegate();
    public delegate void MyDelegate2(string str);

    public delegate int MyAddDelegate(int p, int q);
    public delegate int MySquareDelegate(int x);
    internal class Program
    {
        static void Main(string[] args)
        {
            #region Demo 00 : Delagate and Old syntax for Method calls 
            // First Way to call method:
            //SayHi();
            // Second Way to call method:
            //MyClass myClass = new MyClass();
            //myClass.SayHello();

            // Third Way to call method via delegate:
            //MyDelegate del1 = new MyDelegate(Program.SayHi);
            //del1.Invoke();
            //MyClass myClass2 = new MyClass();
            //MyDelegate del2 = new MyDelegate(myClass2.SayHello);
            //del2.Invoke();

            //// Delegate with Parameter:
            //MyDelegate2 del3 = new MyDelegate2(myClass2.Greet);
            //del3.Invoke("Hugh Jackman");

            //MyDelegate2 del4 = new MyDelegate2(Program.SaySomething);
            ////del4.Invoke("Mando");
            //del4("Mando"); 
            #endregion

            CMath cMath = new CMath();
            MyAddDelegate addDel = new MyAddDelegate(cMath.Add);

            Console.WriteLine("Enter first number: ");
            int num1 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Enter second number: ");
            int num2 = Convert.ToInt32(Console.ReadLine());

            int addResult = addDel(num1, num2);

            MySquareDelegate squareDel = new MySquareDelegate(cMath.Square);
            int squareResult = squareDel.Invoke(num1);

            Console.WriteLine($"Add = {addResult}, Square = {squareResult}");
        }
        static void SayHi()
        {
            Console.WriteLine("Hi");
        }
        static void SaySomething(string name)
        {
            Console.WriteLine($"Hi {name}");
        }
    }
    public class CMath
    {
        public int Add(int x, int y)
        {
             return x + y;
        }
        public int Square(int x)
        {
            return x * x;
        }
    }
    public class MyClass
    {
        public void SayHello()
        {
            Console.WriteLine("Hello");
        }
        public void Greet(string name)
        {
            Console.WriteLine($"Hello {name}!!");
        }
    }
}
