using System.Runtime.Serialization;

namespace _47Demo_ExceptionHandling
{
    internal class Program
    {
        static void Main(string[] args)
        {
            
            try
            {
                Console.WriteLine("Enter first No : ");
                int n1 = Convert.ToInt32(Console.ReadLine());
                Console.WriteLine("Enter second No : ");
                int n2 = Convert.ToInt32(Console.ReadLine());
                if (n2 == 0)
                {
                    throw new MyCustomException($"Second number Zero nahi likhana");
                }
                int divResult = n1 / n2;
                Console.WriteLine($"Div Result  = {divResult}");
            }
            catch(MyCustomException obj) 
            {
                Console.WriteLine(obj.MyMessage);
            }
            catch (DivideByZeroException ex)
            {
                Console.WriteLine($"---{ex.Message}");
            }
            catch (Exception ex)
            {
                // CLR creates obj of Exception class at runtime and initialzes message property with Exception Message
                Console.WriteLine(ex.Message);
            }
            finally
            {
                Console.WriteLine("finally block");
            }
        }
    }
    public class MyCustomException : Exception
    {
        //public override string Message => base.Message;
        public string MyMessage { get; set; }
        public MyCustomException(string msg)
        {
            MyMessage = msg;
        }
    } 
}
