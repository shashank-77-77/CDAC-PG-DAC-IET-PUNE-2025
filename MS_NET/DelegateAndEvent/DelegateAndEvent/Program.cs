using System.Security.AccessControl;

namespace DelegateAndEvent
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Employee employee = new Employee();

            employee.EId = 83;
            int id = employee.EId;
            Console.WriteLine($"Employee ID = {id}");

            employee.FirstName = "Soham";
            string fname = employee.FirstName;
            Console.WriteLine($"First Name ={fname}");

            employee.LastName = "Shelar";
            string lname = employee.LastName;
            Console.WriteLine($"Last Name ={lname}");

            employee.Age = 10;
            int age = employee.Age;
            Console.WriteLine($"Age ={age}");

            employee.Email ="Sohm01@gmail.com";
            string email = employee.Email;
            Console.WriteLine($"Email = {email}"); 
        }
    }

    public class Employee
    {
        private int _EId;
        private string _FirstName;
        private string _LastName;
        private int _Age;
        private string _Email;


        public int EId
        {
            get
            {
                return _EId;
            }

            set
            {
                _EId = value;
            }
        }

        public string FirstName
        {
            get
            {
                return _FirstName;
            }
            set
            {
               _FirstName = value;
            }
        }

        public string LastName 
        {
            get 
            { 
                return _LastName;
            } 
            set  
            { 
                _LastName = value;
            }
        } 
        
        public int Age 
        {
            get
            {
                return _Age;
            }
            set
            {
                _Age = value;
            }
        }
        public string Email
        {
            get
            {
                return _Email;
            }
            set
            {
                _Email = value;
            }  

        }

    }
}
