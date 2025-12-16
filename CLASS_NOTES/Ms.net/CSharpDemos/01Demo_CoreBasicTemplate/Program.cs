namespace _01Demo_CoreBasicTemplate
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");
            MyClass myClass = new MyClass();
            myClass.SayHi();
        }
    }

    public class MyClass
    {
        public void SayHi()
        {
            Console.WriteLine("Hi from MyClass!");
        }
    }
}
