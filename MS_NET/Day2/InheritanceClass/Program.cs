using InheritanceClass.Logic;

namespace InheritanceClass
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Person person = new Person();   
            person.fname = "Soham";
            person.lname = "Shelar";
            Console.WriteLine(person);
            Console.WriteLine("Name :{0} {1}",person.fname,person.lname);

            Employee employee = new Employee();
            employee.EmployeeId = 101;
            Console.WriteLine("ID: {2} ,Name : {0} {1}", person.fname, person.lname, employee.EmployeeId);


        }
    }
}
