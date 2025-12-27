using System.ComponentModel.DataAnnotations;

namespace LINQ3
{
    internal class Program
    {
        static void Main(string[] args)
        {
            List<Emp> elist = new List<Emp>()
            {
                new Emp(){id=1, name="Shashank", address="Nagpur"},
                new Emp(){id=2, name="Soham", address="Satara"},
                new Emp(){id=3, name="Yuvraj", address="Pune"},
                new Emp(){id=4, name="Pratik", address="Nagpur"},
                new Emp(){id=5, name="Rohit", address="Pune"}
            };
            Console.WriteLine("Enter first character of city name :");
            string? ch = Console.ReadLine().ToLower();
            #region CSharp Syntax
            //var filteredOnCity = new List<Emp>();

            //foreach (Emp emp in elist)
            //{
            //    if (emp.address.ToLower().StartsWith(ch))
            //    {
            //        filteredOnCity.Add(emp);
            //    }
            //} 
            #endregion

            #region LINQ : Language Integrated Query Syntax
            //var result = (from emp in elist select emp.name);

            ////IQueryable<T> collection 
            //foreach (string nm in result)
            //{
            //    Console.WriteLine(nm);
            //} 
            #endregion


            var filteredEmpCollectionBasedOnCity = (from emp in elist
                                                    where emp.address.ToLower().StartsWith(ch)
                                                    select emp);

            foreach (Emp emp in filteredEmpCollectionBasedOnCity)
            {
                Console.WriteLine($"Id: {emp.id}, Name: {emp.name}, Address: {emp.address}");
            }
        }
    }

    public class Emp
    {
        public int id { get; set; }
        public string name { get; set; }


        public string address { get; set; }
    }
}
