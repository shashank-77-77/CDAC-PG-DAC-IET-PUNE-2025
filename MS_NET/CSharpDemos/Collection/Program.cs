using System.Collections;

namespace Collection
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region int[]
            //int[] arr = new int[5];
            //arr[0] = 1;
            //arr[1] = 2;

            //arr[2] = 3;
            //arr[3] = 4;
            //arr[4] = 5;

            //for (int i = 0; i < arr.Length; i++)
            //{
            //    Console.WriteLine(arr[i]);
            //} 
            #endregion

            #region string[]

            //string[] name = new string[3];
            //name[0] = "Soham";
            //name[1] = "Shashank";
            //name[2] = "YuRohit";

            //for (int i = 0; i < name.Length; i++)
            //{
            //    Console.WriteLine(name[i]);
            //} 
            #endregion

            Emp emp1 = new Emp();
             emp1.EmpId = 1;
            emp1.Ename = "Soham";
            emp1.EAddress = "Satara";

            Emp emp2 = new Emp();
            emp2.EmpId = 12;
            emp2.Ename = "Shashank";
            emp2.EAddress = "Nagpur";

            Emp emp3 = new Emp();
            emp3.EmpId = 13;
            emp3.Ename = "Dupal";
            emp3.EAddress = "Dhule";


            Book book = new Book();
            book.BookName = "My Fault";
            book.Author = "J.S Thomsan";


            #region Emp[]
            //Emp[] emps = new Emp[3];
            //emps[0] = emp1;
            //emps[1] = emp2;
            //emps[2] = emp3;

            //for (int i = 0; i < emps.Length; i++)
            //{
            //    Console.WriteLine($"ID : {emps[i].EmpId},Name : {emps[i].Ename},Emp Address : {emps[i].EAddress}");
            //} 
            #endregion

            #region Object[]


            //Object[] objs = new Object[5];
            //objs[0] = 111;
            //objs[1] = "Undifiend";
            //objs[2] = emp2;
            //objs[3] = book;
            //objs[4] = 17.44;


            //#region old Syntax
            ////for (int i = 0; i < objs.Length; i++)
            ////{
            ////    object element = objs[i];
            ////    Type type = element.GetType();

            ////    if (type.ToString() == "System.Int32")
            ////    {
            ////        int j = Convert.ToInt32(element);
            ////        Console.WriteLine($"Value = {j}, Type = {type.ToString()}");
            ////    }
            ////    if (type.ToString() == "System.String")
            ////    {
            ////        string str = Convert.ToString(element);
            ////        Console.WriteLine($"Value = {str}, Type = {type.ToString()}");
            ////    }
            ////    if (type.ToString() == "_22Demo_Collection.Book")
            ////    {
            ////        Book book1 = (Book)element;
            ////        Console.WriteLine($"Value = {book1.BookName}, Type = {type.ToString()}");
            ////    }
            ////} 
            //#endregion

            //for (int i = 0; i < objs.Length; i++)
            //{
            //    object element = objs[i];
            //    if (element is int)
            //    {
            //        int j = Convert.ToInt32(element);
            //        Console.WriteLine($"Value = {j}, Type ={element.GetType().ToString()}");
            //    }
            //    if (element is string)
            //    {
            //        string str = element.ToString();
            //        Console.WriteLine($"Value = {str}, Type ={element.GetType().ToString()}");
            //    }
            //    if (element is double)
            //    {
            //        double d = Convert.ToDouble(element);
            //        Console.WriteLine($"Value = {d}, Type ={element.GetType().ToString()}");
            //    }
            //    if (element is Emp)
            //    {
            //        Emp emp = element as Emp;
            //        Console.WriteLine($"Value = {emp.EmpId} {emp.Ename} {emp.EAddress}, Type ={element.GetType().ToString()}");
            //    }
            //    if (element is Book)
            //    {
            //        Book book2 = element as Book;
            //        Console.WriteLine($"Value = {book2.BookName} {book2.Author}, Type ={element.GetType().ToString()}");
            //    }
            //} 
            #endregion

            #region ArrayList
            //ArrayList arr = new ArrayList();
            //arr.Add(110);
            //arr.Add("NotDefined");
            //arr.Add(emp2);
            //arr.Add(book);
            //arr.Add(20.54);

            //for (int i = 0; i < arr.Count; i++)
            //{
            //    object element = arr[i];
            //    if (element is int)
            //    {
            //        int j = Convert.ToInt32(element);
            //        Console.WriteLine($"Value = {j}, Type ={element.GetType().ToString()}");
            //    }
            //    if (element is string)
            //    {
            //        string str = element.ToString();
            //        Console.WriteLine($"Value = {str}, Type ={element.GetType().ToString()}");
            //    }
            //    if (element is double)
            //    {
            //        double d = Convert.ToDouble(element);
            //        Console.WriteLine($"Value = {d}, Type ={element.GetType().ToString()}");
            //    }
            //    if (element is Emp)
            //    {
            //        Emp emp = element as Emp;
            //        Console.WriteLine($"Value = {emp.EmpId} {emp.Ename} {emp.EAddress}, Type ={element.GetType().ToString()}");
            //    }
            //    if (element is Book)
            //    {
            //        Book book2 = element as Book;
            //        Console.WriteLine($"Value = {book2.BookName} {book2.Author}, Type ={element.GetType().ToString()}");
            //    }
            //} 
            #endregion

            #region Hashtable 
            //Hashtable ht = new Hashtable();
            //ht.Add(1, 104);
            //ht.Add("A", "Anaconda");
            //ht.Add(2, 28.35);
            //ht.Add(3, emp2);

            ////for (int i = 0; i < ht.Count; i++)
            ////foreach (object key in ht.Keys)
            ////{
            ////    Console.WriteLine(key);
            ////}
            ////foreach (object value in ht.Values)
            ////{
            ////    Console.WriteLine(value);
            ////}
            //foreach (object key in ht.Keys)
            //{
            //    Console.WriteLine($"Key = {key}, Value = {ht[key]}");
            //}
            #endregion

            #region List
            //List<int> numbers = new List<int>();
            //numbers.Add(54);
            //numbers.Add(25);
            //numbers.Add(82);

            //for (int i = 0; i < numbers.Count; i++)
            //{
            //    Console.WriteLine(numbers[i]);
            //} 
            #endregion

            #region Tuples
            //var empDetails = Display(101, "shashank ", "nagpur");
            //Console.WriteLine($"Id={empDetails.Id},Name={empDetails.Name},Address={empDetails.Address}"); 
            #endregion
        }


        #region Tuples method
        //static (int Id, string Name, string Address) Display(int id, string name, string address)
        //{
        //    int Id = id;
        //    string Name = name;
        //    string Address = address;
        //    return (Id, Name, Address);
        //} 
        #endregion
    }

    public class Book
    {
        private string _Author;

        public string Author
        {
            get { return _Author; }
            set { _Author = value; }
        }

        private string _BookName;

        public string BookName
        {
            get { return _BookName; }
            set { _BookName = value; }
        }
    }
    public class Emp 
    {
        private int _EmpId;
        private string _EName;
        private string _EAddress;

        public string EAddress
        {
            get { return _EAddress; }
            set { _EAddress = value; }
        }


        public string Ename
        {
            get { return _EName; }
            set { _EName = value; }
        }


        public int EmpId
        {
            get { return _EmpId; }
            set { _EmpId = value; }
        }

    }
    
}
