namespace _48Demo_GC
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //MyClass obj = new MyClass();
            //obj.SayHi();
            //obj.Dispose();

            //// At the end of using block CLR calls Dispose() method explicitly
            //using (MyClass obj2 =new MyClass())
            //{ 
            //    obj2.SayHi();
            //}

            //GC.Collect(2);
            //Console.WriteLine(GC.MaxGeneration);

            //MyClass obj3=new MyClass();
            //Console.WriteLine(GC.GetGeneration(obj3));

            //GC.WaitForPendingFinalizers();
        }
    }
    public class MyClass: IDisposable
    {
        public void Dispose()
        {
            Console.WriteLine("Dispose method gets called...");
            GC.SuppressFinalize(this);
        }

        public void SayHi()
        {
            Console.WriteLine("Hi");
        }
        //~MyClass()
        //{
        //    Console.WriteLine("Destructor called.. ");
        //}
    }
}
