namespace SwitchCase

{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter number 1");
            int a =Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("Enter number 2");
            int b=Convert.ToInt32(Console.ReadLine());


            
            int choice;
             do
            {
                Console.WriteLine("1.Addition , 2. Sub ,3. Multi,4. Division, 5. Exit");
                Console.WriteLine("Enter your Choice");
                choice = Convert.ToInt32(Console.ReadLine());

                switch (choice)
                {
                    case 1:
                        int c = a + b;
                        Console.WriteLine("Addition is " + c);
                        break;
                    case 2:
                        int d = a - b;
                        Console.WriteLine("Sub is" + d);
                        break;
                    case 3:
                        int e = a * b;
                        Console.WriteLine("mult is" + e);
                        break;
                    case 4:
                        int f = a / b;
                        Console.WriteLine("Division is "+f);
                        break;
                    case 5:
                        Console.WriteLine("Thank you for visiting...");
                        break;
                    default:
                        Console.WriteLine("Invalid input");
                        break;
                }
            }while(choice != 5);
        }

    }
}
