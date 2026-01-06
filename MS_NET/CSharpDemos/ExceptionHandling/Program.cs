namespace ExceptionHandling
{
    internal class Program
    {
        static void Main(string[] args)
        {
            try
            {
                Console.WriteLine("Enter first No :");
                int n1 = Convert.ToInt32(Console.ReadLine());

                Console.WriteLine("Enter second no :");
                int n2 = Convert.ToInt32(Console.ReadLine());

                if (n2 == 0)
                {
                    throw new MyCustomException("do not enter second number zero");

                }
                int divResult = n1 / n2;
                Console.WriteLine($"Div Result: = {divResult}");
            }
            catch (MyCustomException obj)
            {
                Console.WriteLine(obj.Message);
            }
        }
    }
    public class MyCustomException : Exception
    {
        public string MyMessage { get; set; }

        public MyCustomException(string msg)
        {
            MyMessage = msg;
        }
    }
}
