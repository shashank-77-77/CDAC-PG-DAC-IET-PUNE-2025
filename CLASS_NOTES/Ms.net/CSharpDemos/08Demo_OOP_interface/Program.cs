namespace _08Demo_OOP_interface
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region Implicit implementation of interface IDrink
            //Drink drink = new Drink();
            //drink.GetDrink();
            #endregion

            #region Implict implementation
            //Console.WriteLine("Enter your choice");
            //int ch = Convert.ToInt32(Console.ReadLine());
            //switch (ch)
            //{
            //    case 1:
            //        IDrink coldDrink = new ColdDrink();
            //        coldDrink.GetDrink();
            //        break;
            //    case 2:
            //        IDrink hotDrink = new HotDrink();
            //        hotDrink.GetDrink();
            //        break;
            //    default:
            //        Console.WriteLine("Invalid choice");
            //        break;
            //} 
            #endregion

            #region Explicit implementation

            //Console.WriteLine("Enter your choice 1. IX, 2. IY");
            //int ch = Convert.ToInt32(Console.ReadLine());
            //switch (ch)
            //{
            //    case 1:
            //        IX xObj = new CMath();
            //        Console.WriteLine(xObj.Add(10, 20));
            //        Console.WriteLine(xObj.Sub(20, 10));
            //        break;
            //    case 2:
            //        IY yObj = new CMath();
            //        Console.WriteLine(yObj.Add(10, 20));
            //        Console.WriteLine(yObj.Mult(10, 20));
            //        break;
            //    //case 3:
            //    //    CMath cObj = new CMath();
            //    //    //cObj
            //    //    break;
            //    default:
            //        Console.WriteLine("Invalid choice");
            //        break;
            //}
            #endregion

            MyMath demo = new MyMath();
            demo.Add(10, 20);
            demo.Div(20, 10);
            //demo.Log("This is a log message");
            demo.Mult(10, 20);
        }
        #region implicit implementation
        public interface IDrink
        {
            void GetDrink();
        }
        public class ColdDrink : IDrink
        {
            public void GetDrink()
            {
                Console.WriteLine("Enjoy your Cold Drink!!");
            }
        }
        public class HotDrink : IDrink
        {
            public void GetDrink()
            {
                Console.WriteLine("Enjoy your Hot Drink!!");
            }
        }
        #endregion

        #region Implicit implementation of interface IDrink
        //public interface IDrink 
        //{
        //    void GetDrink();
        //}

        //public class Drink : IDrink
        //{
        //    public void GetDrink()
        //    {
        //        Console.WriteLine("Enjoy your Drink!!");
        //    }
        //} 
        #endregion

        public interface IX 
        {
            int Add(int x, int y);
            int Sub(int x, int y);
        }
        public interface IY
        {
            int Add(int x, int y);
            int Mult(int x, int y);
        }
        public interface IDemo
        {
            int Div(int x, int y);
            void Log(string message);
        }
        public class MyMath : IY, IDemo
        {
            public int Add(int x, int y)
            {
                return x + y;
            }

            public int Div(int x, int y)
            {
                return x / y;
            }

            void IDemo.Log(string message)
            {
                Console.WriteLine("Log msg : {0}",message);
            }

            public int Mult(int x, int y)
            {
                return x * y;
            }
        }
        #region Explicit Way
        //public class CMath : IX, IY
        //{
        //    #region Implicit way
        //    //public int Add(int x, int y)
        //    //{
        //    //    return x + y;
        //    //}

        //    //public int Sub(int x, int y)
        //    //{
        //    //    return x - y;
        //    //}
        //    //public int Mult(int x, int y)
        //    //{
        //    //    return x * y;
        //    //} 
        //    #endregion

        //    #region Explicit way of implementation
        //    //int IX.Add(int x, int y)
        //    //{
        //    //    return x+y;
        //    //}

        //    //int IY.Add(int x, int y)
        //    //{
        //    //    return x + y +1000;
        //    //}

        //    //int IY.Mult(int x, int y)
        //    //{
        //    //    return x * y;
        //    //}

        //    //int IX.Sub(int x, int y)
        //    //{
        //    //    return x - y;
        //    //} 
        //    #endregion
        //} 
        #endregion
    }
}
