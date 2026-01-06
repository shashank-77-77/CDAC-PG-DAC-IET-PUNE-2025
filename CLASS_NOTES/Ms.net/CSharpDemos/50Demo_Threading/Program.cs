using System.Diagnostics;
using static System.Runtime.InteropServices.JavaScript.JSType;

namespace _50Demo_Threading
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region Nomal Method Call : Time taken = 10607727 
            //Time taken = 10607727            
            //Stopwatch watch = new Stopwatch();
            //watch.Start();
            //for (int i = 0; i < 10; i++)
            //{
            //    DoSomeThingComplex();
            //}
            //watch.Stop();
            //Console.WriteLine("Time taken = {0}", watch.ElapsedTicks); 
            #endregion

            #region Thread : Time taken = 3343747
            //Time taken = 3343747

            //Stopwatch watch = new Stopwatch();
            //watch.Start();
            //for (int i = 0; i < 10; i++)
            //{
            //    Thread t1 = new Thread(new ThreadStart(DoSomeThingComplex));
            //    t1.Start();
            //    //Console.WriteLine("Current Thread ID:{0}",Thread.CurrentThread.ManagedThreadId);
            //}
            //watch.Stop();
            //Console.WriteLine("Time taken = {0}", watch.ElapsedTicks);
            #endregion
          #region Explicit Parallel Programming - Multiple Tasks : Time taken = 132554
            //Time taken = 132554
            //Stopwatch watch = new Stopwatch();
            //watch.Start();
            //for (int i = 0; i < 10; i++)
            //{
            //    Task t1 = new Task(new Action(DoSomeThingComplex));

            //    t1.Start();
            //    Console.WriteLine("Current Task ID:{0}", t1.Id.ToString());
            //}
            //watch.Stop();
            //Console.WriteLine("Time taken = {0}", watch.ElapsedTicks);
            #endregion
            #region Parallel.Foreach - Implicit Parallel Prog.
            ////TPl - Task Parallel Library
            ////Time taken = 775247
            //int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
            //Stopwatch watch = new Stopwatch();
            //watch.Start();
            ////foreach (var item in arr)
            ////{
            ////    //Time taken = 123939
            ////    Console.WriteLine($"Number : {item}, Thread Id: {Thread.CurrentThread.ManagedThreadId}");
            ////}
            //Parallel.ForEach(arr, (number) =>
            //{
            //    Console.WriteLine($"Number : {number}, Task Id: {Task.CurrentId}, Thread Id: {Thread.CurrentThread.ManagedThreadId}");
            //});
            //watch.Stop();
            //Console.WriteLine("Time taken = {0}", watch.ElapsedTicks);
            #endregion

            #region Parallel LINQ

            //List<Emp> allEmployees = new List<Emp>() {
            // new Emp(){ ID =11,Name ="Jignesh", Address ="Patna"},
            // new Emp(){ ID =12,Name ="Prathamesh", Address ="Nashik"},
            // new Emp(){ ID =13,Name ="Devendra", Address ="Nagpur"},
            // new Emp(){ ID =14,Name ="Kalpesh", Address ="Kerla"},
            // new Emp(){ ID =15,Name ="kushendra", Address ="Indore"}
            //};

            //var result = (from emp in allEmployees.AsParallel()
            //              where emp.Address.StartsWith("N")
            //              select emp).ToList();

            //foreach (var emp in result)
            //{
            //    Console.WriteLine($"Name: {emp.Name}, Address: {emp.Address}");
            //}
            #endregion

        }
        public static void DoSomeThingComplex()
        {
            for (int i = 0; i < 100000; i++)
            {
                for (int j = 0; j < 1000; j++)
                {
                    //Nothing here..
                }
            }
        }
    }
    public class Emp
    {
        public int ID { get; set; }
        public string Name { get; set; }
        public string Address { get; set; }
    }
}
