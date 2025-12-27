using System;
using System.ComponentModel.DataAnnotations;

namespace LINQ4
{
    internal class Program
    {
        static void Main(string[] args)
        {
            List<Emp> elist = new List<Emp>()
            {
                new Emp(){Id=1, Name="Shashank", Address="Nagpur"},
                new Emp(){Id=2, Name="Soham", Address="Satara"},
                new Emp(){Id=3, Name="Yuvraj", Address="Pune"},
                new Emp(){Id=4, Name="Pratik", Address="Nagpur"},
                new Emp(){Id=5, Name="Rohit", Address="Pune"}
            };

            #region Lazy Loading of LINQ
            //Console.WriteLine("Enter city Start Character");
            //string? city = Console.ReadLine().ToLower();

            //var result=from emp in elist where emp.Address.ToLower().StartsWith(city) select emp;

            //elist.Add(new Emp() { Id = 12, Name = "Sidd", Address = "Pune" });

            //foreach (Emp emp in result) 
            //{
            //    emp.GetDetails(); 
            //} 
            #endregion

            #region LINQ with .ToList() Extension method
            //Console.WriteLine("Enter city Start Character");
            //string? city = Console.ReadLine().ToLower();

            //var result = (from emp in elist where emp.Address.ToLower().StartsWith(city) select emp).ToList();

            //elist.Add(new Emp() { Id = 12, Name = "Sham", Address = "Pune" });

            //foreach (Emp emp in result)
            //{
            //    emp.GetDetails();
            //} 
            #endregion

            #region LINQ with Tuple syntax
            //Console.WriteLine("Enter city Start character :");
            //string? city = Console.ReadLine().ToLower();

            //var result=(from emp in elist where emp.Address.ToLower().StartsWith(city) select emp).ToList();

            //foreach(var element in result)
            //{
            //    Console.WriteLine($"{element.Name} {element.Address}");
            //} 
            #endregion


            #region  LINQ with Holder class
            //Console.WriteLine("Enter city Start character:");
            //string? city = Console.ReadLine().ToLower();


            //var result = (from emp in elist
            //              where emp.Address.ToLower().StartsWith(city)
            //              select new Holder() { Hname = emp.Name, Haddress = emp.Address }).ToList();

            //foreach (var holder in result)
            //{
            //    holder.GetDetails();
            //} 
            #endregion

            Console.WriteLine("Enter city Start character:");
            string? city = Console.ReadLine().ToLower();

            
           var result = (from emp in elist where emp.Address.ToLower().StartsWith(city) select new { id = emp.Id, add = emp.Address }).ToList();

            foreach (var A_Type in result)
            {
                Console.WriteLine($"id= {A_Type.id}, Address= {A_Type.add}");
            }

        }
    }

    public class Holder
    {
        public int Hid { get; set; }

        public string Hname { get; set; }

        public string Haddress { get; set; }

        public void GetDetails()
        {
            Console.WriteLine($"Id: {this.Hid}, Name: {this.Hname}, Address: {this.Haddress} ");
        }
    }

    public class Emp
    {
        public int Id { get; set; }

        public string Name { get; set; }

        public string Address { get; set; }

        public void GetDetails()
        {
            Console.WriteLine($"Id:{this.Id},Name:{this.Name},Address: {this.Address}");
        }
    }
}
