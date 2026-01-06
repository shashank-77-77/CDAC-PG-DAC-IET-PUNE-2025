using _46Demo_EntityFramewrok.DAL;
using _46Demo_EntityFramewrok.Models;

namespace _46Demo_EntityFramewrok
{
    internal class Program
    {
        static void Main(string[] args)
        {
            IETDbContext _DbContext = new IETDbContext();

            while (true) 
            {
                Console.WriteLine("Enter your Db Operation Choice:");
                Console.WriteLine("1. Select, 2. Insert, 3. Update, 4. Delete");
                int opChoice = Convert.ToInt32(Console.ReadLine());
                switch (opChoice)
                {
                    case 1:
                        // EF will fire SELECT * FROM Emp to initialize emps collection of IETDbContext class
                        List<Emp> allEmps = _DbContext.emps.ToList();

                        foreach (var emp in allEmps)
                        {
                            Console.WriteLine($"Id: {emp.Id}, Name: {emp.Name}, Address: {emp.Address}");
                        }
                        break;
                    case 2:
                        Emp newEmp = new Emp();

                        Console.WriteLine("Enter name: ");
                        newEmp.Name = Console.ReadLine();
                        Console.WriteLine("Enter Address");
                        newEmp.Address = Console.ReadLine();

                        _DbContext.emps.Add(newEmp);
                        _DbContext.SaveChanges(); //Generate and Fire Insert Query on DB
                        break;
                    case 3:
                        Console.WriteLine("Enter Emp Id To be updated");
                        int idToBeUpdated = Convert.ToInt32(Console.ReadLine());

                        Emp empToBeUpdated =_DbContext.emps.Find(idToBeUpdated);

                        Console.WriteLine("Enter updated name: ");
                        empToBeUpdated.Name = Console.ReadLine();
                        Console.WriteLine("Enter updated Address");
                        empToBeUpdated.Address = Console.ReadLine();

                        _DbContext.SaveChanges(); // Update Query
                        break;
                    case 4:
                        Console.WriteLine("Enter Emp Id To be deleted");
                        int idToBeUDeleted = Convert.ToInt32(Console.ReadLine());
                        Emp empToBeDeleted =_DbContext.emps.Find(idToBeUDeleted);

                        _DbContext.emps.Remove(empToBeDeleted);
                        _DbContext.SaveChanges(); // Delete Query
                        break;
                    default:
                        Console.WriteLine("Invalid Operation Choice");
                        break;
                }
                Console.WriteLine("Do you wish to continue? y/n:");
                string ynChoice = Console.ReadLine();
                if(ynChoice == "n")
                    break;
            }
        }
    }
}
