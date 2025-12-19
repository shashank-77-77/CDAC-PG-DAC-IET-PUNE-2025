namespace _25Demo_GenericDelegate
{
    public delegate T MyDelegate<T>();
    internal class Program
    {
        static void Main(string[] args)
        {
            //SampleClass sample = new SampleClass();
            //MyDelegate<SampleClass> del = new MyDelegate<SampleClass>(sample.SampleMethod);
        }
    }
    public class SampleClass<T>
    {
        public void SampleMethod()
        {
            Console.WriteLine("Sample Method");
        }
    }
}
