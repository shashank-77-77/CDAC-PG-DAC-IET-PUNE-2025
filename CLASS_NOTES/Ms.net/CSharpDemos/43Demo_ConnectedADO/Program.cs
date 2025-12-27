using _43Demo_ConnectedADO.DAL;
using _43Demo_ConnectedADO.Models;

namespace _43Demo_ConnectedADO
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // UI
            // Buissness Presentation Layer
            // Views
            IETDbContext dbContext = new IETDbContext();
            int noOFRowsAffected = 0;
            while (true) 
            {
                Console.WriteLine("Enter Db Operation Choice: 1. SELECT, 2. Select by ID, 3.INSERT, 4. UPDATE, 5. DELETE");
                int opChoice = Convert.ToInt32(Console.ReadLine());

                switch (opChoice)
                {
                    case 1:
                        var records = dbContext.GetEmpRecords();
                        foreach (var emp in records)
                        {
                            Console.WriteLine($"Id: {emp.EId}, Name: {emp.EName}, Address: {emp.EAddress}");
                        }
                        break;
                    case 2:
                        Console.WriteLine("Enter id of Emp to be searched:");
                        int idToBeSearched = Convert.ToInt32(Console.ReadLine());

                        var searchedEmps = dbContext.GetEmpRecordsById(idToBeSearched);
                        if (searchedEmps != null)
                        {
                            Emp empFound =searchedEmps.FirstOrDefault();

                            if (empFound != null)
                            {
                                Console.WriteLine($"Id: {empFound.EId}, Name: {empFound.EName}, Address: {empFound.EAddress}");
                            }
                            else
                            {
                                Console.WriteLine($"No Emp found by id : {idToBeSearched}");
                            }
                        }
                        else 
                        {
                            Console.WriteLine($"Emp by id = {idToBeSearched} Not found / Error");
                        }
                            break;
                        case 3:
                        Emp empToBeInserted = new Emp();

                        Console.WriteLine("Enter Name of Emp");
                        empToBeInserted.EName = Console.ReadLine();
                        Console.WriteLine("Enter NAddress of Emp");
                        empToBeInserted.EAddress = Console.ReadLine();

                        noOFRowsAffected = dbContext.InsertEmpRecord( empToBeInserted );
                        if (noOFRowsAffected > 0)
                        {
                            Console.WriteLine("Record inserted successfully!");
                        }
                        else
                        {
                            Console.WriteLine("Error with insert query!");
                        }

                            break;
                    case 4:
                        Emp empToBeUpdated = new Emp();
                        Console.WriteLine("Enter Id of Emp to be updated");
                        empToBeUpdated.EId = Convert.ToInt32(Console.ReadLine());
                        Console.WriteLine("Enter Name of Emp to be updated");
                        empToBeUpdated.EName = Console.ReadLine();
                        Console.WriteLine("Enter NAddress of Emp  to be updated");
                        empToBeUpdated.EAddress = Console.ReadLine();

                        noOFRowsAffected = dbContext.UpdateEmpRecord(empToBeUpdated.EId,empToBeUpdated);
                        if (noOFRowsAffected > 0)
                        {
                            Console.WriteLine("Record updated successfully!");
                        }
                        else
                        {
                            Console.WriteLine("Error with update query!");
                        }

                        break;
                    case 5:
                        Console.WriteLine("Enter Id of Emp to be deleted");
                        int idToBeDeleted = Convert.ToInt32(Console.ReadLine());

                        noOFRowsAffected = dbContext.DeleteEmpRecord(idToBeDeleted);
                        if (noOFRowsAffected > 0)
                        {
                            Console.WriteLine("Record deleted successfully!");
                        }
                        else
                        {
                            Console.WriteLine("Error with delete query!");
                        }

                        break;
                    default:
                        Console.WriteLine("Invalid Choice.");
                        break;
                }

                Console.WriteLine("Do you want continue? y/n");
                string ynChoice = Console.ReadLine();
                if (ynChoice == "n")
                {
                    break;
                }
            }
        }
    }
}
