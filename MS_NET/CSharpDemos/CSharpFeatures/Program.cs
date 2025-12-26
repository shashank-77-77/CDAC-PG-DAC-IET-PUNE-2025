using System;

namespace CSharpFeatures
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region Partial Class
            //CMath cmath = new CMath();
            //Console.WriteLine($"Add result = {cmath.Add(58, 18)}");
            //Console.WriteLine($"Mult result = {cmath.Multiply(58, 14)}"); 
            #endregion

            #region Nullable Types [ ? = Nullable operator]

            //string name = null;
            ////int deptID = null; 
            //// int? deptID = null; 
            //int? deptID = 545465;
            //if (deptID.HasValue)
            //{
            //    Console.WriteLine(deptID.Value);
            //}
            //else
            //{
            //    Console.WriteLine("deptID = null");
            //}
            //DateTime? dt = null;

            ////Nullable<int> dept = null;
            //Nullable<int> dept = 1234; 
            ////if(deptID != null)
            //if (dept.HasValue)
            //{
            //    Console.WriteLine($"Dept is not null and is = {dept.Value}");
            //}
            //else
            //{
            //    Console.WriteLine("Dept = null");
            //}
            #endregion

            #region Object Initializer :{}

            //Demo demo = new Demo() { _id = 100 };
            //Console.WriteLine(demo._id);

            //Demo demo1 = new Demo() { _name = "Shashank Mankar", _id = 540 };
            //Console.WriteLine(demo1._name + " " + demo1._id);

            //Console.WriteLine("Enter name:");
            //string nm = Console.ReadLine();
            //Console.WriteLine("Enter description:");
            //string des = Console.ReadLine();

            //Demo demo2 = new Demo() { _name = nm, _description = des };

            //Console.WriteLine($"Name = {demo2._name}, Description= {demo2._description}");

            #endregion

            #region Collection Initializer
            //int[] arr = new int[3];
            //arr[0] = 1;
            //arr[1] = 2;
            //arr[2] = 3;

            //int[] arr = new int[] { 1, 2, 3 };
            //foreach (int ele in arr)
            //{
            //    Console.WriteLine(ele);
            //}
            //string[] names = new string[] { "Shashank", "Soham", "Pratik", "Rohit Sharma" };
            //foreach (string ele in names)
            //{
            //    Console.WriteLine(ele); 
            //}

            //// Collection Initializer Syntax combined with Object Initializer Syntax
            //List<Demo> listDemoObjects = new List<Demo>() { 
            //    new Demo(){ _id = 1, _name= "Shashank Mankar", _description="IT Engineer"},
            //     new Demo(){ _id = 2, _name= "Soham Shelar", _description="CS Engineer"},
            //};

            //foreach (Demo dm in listDemoObjects)
            //{
            //    Console.WriteLine($"Id= {dm._id}, Name = {dm._name}, Description = {dm._description}");
            //}

            #endregion

            #region Auto - properties

            //Emp emp = new Emp() { EId = 101 };

            //Emp emp1 = new Emp()
            //{
            //    EId = 101,
            //    EName = "Shashank Mankar",
            //    isActive = true,
            //    Salary = 50000,
            //    DOJ = DateTime.Now,
            //    Projects = new List<string>() { "VAssistant", "Social Media Web App", "Search Engine Optimization" }
            //};
            //Console.WriteLine($"DOJ = {emp1.DOJ.ToString()}");
            //foreach (string str in emp1.Projects)
            //{
            //    Console.WriteLine(str);
            //}

            #endregion

            #region Implicit Type

            ////Test obj = new Test();
            ////Emp emp = obj.GetSomething(2) as Emp;

            ////int value = Convert.ToInt32(obj.GetSomething(1));

            ////object num = obj.GetSomething(null);
            ////if (num == null)
            ////{ }


            //var i = 100;
            //var str = "Hello";

            //var emp = new Emp();

            ////var v1; 
            ////object obj;
            ////int j;

            //Test obj1 = new Test();
            //Console.WriteLine("Enter choice");
            //int ch = Convert.ToInt32(Console.ReadLine());
            //var result = obj1.GetSomething(ch);


            #endregion

            #region Anonymous Types

           // //List<Holder> dbRecordsHolder = new List<Holder>() { 
           // //    new Holder(){ Id = db, Name= db,   Address= db }
           // //};

           // //Emp emp = new Emp() { EId = 1, EName = "Shashank Mankar"};
           // //var emp2 = new Emp() { EId = 2, EName = "soham shelar" };
           // //Console.WriteLine(emp2.GetType().ToString());
           // //var emp3 = new Holder() { Id = 101, Name = "pratik", Address = "sadashiv peth" };
           // //Console.WriteLine(emp3.GetType().ToString());

           // //var emp4 = new Holder() { Id = 101, Address = "sadashiv peth", Name = "pratik" };
           // //Console.WriteLine(emp4.GetType().ToString());


           // var v1 = new { Id = 101, Name = "shashank", Address = "nagpur" };
           // Console.WriteLine(v1.GetType().ToString());

           // var v2 = new { Id = 102, Name = "Soham", Address = "Shivaji Nagar" };
           // Console.WriteLine(v2.GetType().ToString());

           // var v3 = new { Id = 102, Address = "Shivaji Nagar", Name = "soham" };
           // Console.WriteLine(v3.GetType().ToString());

           // var v4 = new { Id = 102, Address = true, Name = "soham" };
           // Console.WriteLine(v4.GetType().ToString());

           //.
           // //v4.Address = "Pune"; 
           // Console.WriteLine(v4.Address);

           // Console.WriteLine("Enter value for Id");
           // int id = Convert.ToInt32(Console.ReadLine());
           // Console.WriteLine("Enter value for name");
           // string nm = Console.ReadLine();

           // var v5 = new { CId = id, CName = nm };
           // Console.WriteLine($"You Entered : CId= {v5.CId}, Name= {v5.CName}");
            #endregion

        }
    }

    public class Holder
    {
        public int? Id { get; set; }
        public string? Name { get; set; }
        public string? Address { get; set; }
    }
    public class Test
    {
        //public void Demo(var ch)
        //{ 
        //}
        public object GetSomething(Nullable<int> choice)
        {
            if (choice == 1)
            {
                return 100;
            }
            else if (choice == 2)
            {
                return new Emp() { EId = 1, EName = "Timothy", isActive = false };
            }
            else
            {
                return null;
            }
        }
    }
    public class Emp
    {
        //private int _Id;

        //public int EId
        //{
        //    get { return _Id; }
        //    set { _Id = value; }
        //}
      

        public int EId { get; set; }
        public string EName { get; set; }
        public bool isActive { get; set; }
        public double Salary { get; set; }
        public DateTime DOJ { get; set; }
        public List<string> Projects { get; set; }
        public Demo demo { get; set; }

    }
    public class Demo
    {
        public int _id;
        public string _name;
        public string _description;

        #region Mannually ctor writing code based on combinations of private fields initialization.
        //public Demo()
        //{

        //}
        //public Demo(int id)
        //{
        //    _id = id;
        //}
        //public Demo(string nm)
        //{
        //    _name = nm;
        //}
        //public Demo(int id, string nm)
        //{
        //    _id = id;
        //    _name = nm;
        //}
        //public Demo(int id, string nm, string des)
        //{
        //    _id = id;
        //    _name = nm;
        //    _description = des;
        //} 
        #endregion
    }
}
