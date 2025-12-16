using One; // using statement to include the One namespace
using System; // using statement to include the System namespace
namespace _05Demo_OOP_Basics
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region Fully Qualified Name
            //System.Int32 x = 100;
            //System.Int32 y = 200;
            //Int32 x = 100;
            //Int32 y = 200;
            //int x = 100;
            //int y = 200; 
            #endregion

            //One.MyClass obj = new One.MyClass();
            MyClass obj = new MyClass();
            obj.GetMessage();
        }
    }
}
