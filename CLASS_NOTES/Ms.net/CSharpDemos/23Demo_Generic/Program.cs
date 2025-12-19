using System;
namespace _23Demo_Generic
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region Without Template Swap Method Code 
            //int a = 12;
            //int b = 7;
            //CMath cmath = new CMath();
            //Console.WriteLine($"Before Swapping A={a}, B={b}");
            //cmath.Swap(ref a,ref b);
            //Console.WriteLine($"After Swapping A={a}, B={b}");

            //string s1= "Hello";
            //string s2 = "Bye";
            //Console.WriteLine($"Before Swapping S1={s1}, S2={s2}");
            //cmath.Swap(ref s1, ref s2);
            //Console.WriteLine($"After Swapping S1={s1}, S2={s2}"); 
            #endregion

            #region With Template Swap MEthod Code
            //int a = 12;
            //int b = 7;
            //CMath cmath = new CMath();
            //Console.WriteLine($"Before Swapping A={a}, B={b}");
            //cmath.Swap<int>(ref a, ref b);
            //Console.WriteLine($"After Swapping A={a}, B={b}");

            //string s1 = "Hello";
            //string s2 = "Bye";
            //Console.WriteLine($"Before Swapping S1={s1}, S2={s2}");
            //cmath.Swap<string>(ref s1, ref s2);
            //Console.WriteLine($"After Swapping S1={s1}, S2={s2}");
            #endregion

            #region Generic Overloadded Demo MEthods 

            //CMath cmath = new CMath();
            //double result = cmath.Demo<int, string, double, bool>(100, "Hugh JAckman", 23.33, true);
            //Console.WriteLine(result);

            //char result1 = cmath.Demo<int, string, double, bool, char>(200, "Chris Hemsworth", 45.55, false,'A');
            //Console.WriteLine(result1);
            #endregion

            #region Dynamic Type

            //CMath cmath = new CMath();
            //Console.WriteLine(cmath.Add<int>(2, 4));
            //Console.WriteLine(cmath.Add<string>("2", "4"));
            //Console.WriteLine(cmath.Add<double>(22.22, 22.22));
            #endregion

            #region out Parameter
            //double area, circumference = 0;
            //double radius = 5;
            //CMath cmath = new CMath();
            //cmath.CalculateCircleArea(radius,out area, out circumference);
            //Console.WriteLine($"Circle : Area = {area}, Circumference = {circumference}");
            #endregion

            #region Generic Class With Generic and Non- Generic MEthods
            //MyClass<string> myClass = new MyClass<string>();
            //myClass.SayHi("Hugh Jackman");
            //Console.WriteLine(myClass.DoubleTheNumber(2)); 
            #endregion

            #region Params Keyword
            //int[] numbers = new int[3];
            //numbers[0] = 10;
            //numbers[1] = 20;
            //numbers[2] = 30;

            //Demo demo = new Demo();
            //demo.Add(numbers);

            //demo.PlayerNames(100,"Ronaldo", "Messi");
            //demo.PlayerNames(200,"Ronaldo", "Messi", "Mbappe", "Neymar");
            #endregion
        }
    }

    public class Demo
    {
        public void Add(int[] arr)
        {
            int sum = 0;
            for (int i = 0; i < arr.Length; i++)
            {
                sum = sum + arr[i];
            }
            Console.WriteLine(sum);
        }

        public void PlayerNames(int x, params string[] nms)
        {
            string output = "Player Names: ";
            for (int i = 0; i < nms.Length; i++)
            {
                output += nms[i] + " ";
            }
            Console.WriteLine(output);
            Console.WriteLine(x);
        }

        //public void PlayerNames(string p1, string p2)
        //{
        //    string output = string.Format("Player 1: {0}, Player 2: {1}", p1, p2);
        //    Console.WriteLine(output);
        //    Console.WriteLine("Player 1: {0}, Player 2: {1}", p1, p2);
        //}
    }
    // Genric Class with Generic and Non-Generic Methods
    public class MyClass<T>
    { 
        public void SayHi(T para)
        {
            Console.WriteLine($"Hello {para}");
        }
        public int DoubleTheNumber(int x)
        { 
            return x * 2;
        }
    }
    public class CMath
    {
        // Generic Method of Type<T>
        public void Swap<T>(ref T x,ref T y) 
        {
            T temp = x;
            x = y;
            y = temp;

            //Console.WriteLine($"After Swapping A={x}, B={y}");
        }
        //public void Swap(ref string x, ref string y)
        //{
        //    string temp = x;
        //    x = y;
        //    y = temp;
        //}

        public R Demo<P,Q,R,S>(P x, Q y, R a, S b)
        {
            return a;
        }

        public T5 Demo<T1, T2, T3, T4, T5>(T1 p1, T2 p2, T3 p3, T4 t4, T5 p5)
        {
            return p5;
        }

        public T Add<T>(T x, T y)
        {
            dynamic para1 = x;
            dynamic para2 = y;
            dynamic sum = para1 + para2; // This line may cause a runtime exception handled by CLR
            return sum;
        }

        public void CalculateCircleArea(double radius,out double area,out double circumference)
        {
             area = 3.14 * radius * radius;
             circumference = 2 * 3.14 * radius;
        }
    }
}
