using ConnectedADO.DAL;
using ConnectedADO.Models;
using System.ComponentModel.DataAnnotations;

namespace ConnectedADO
{
    internal class Program
    {
        static void Main(string[] args)
        {
            DbContext dbContext = new DbContext();

            int noOfRowsAffected = 0;
            while (true) 
            {
                Console.WriteLine("1.Select, 2.Select By Id, 3.Insert, 4.Update,5.Delete");
                int opchoice=Convert.ToInt32(Console.ReadLine());

                switch (opchoice) 
                {
                    case 1:
                        var records = dbContext.GetEmpRecords();
                        foreach (var emp in records)
                        {
                            Console.WriteLine($"Id:{emp.id},Name:{emp.name},Address:{emp.address}");
                        }
                        break;

                    case 2:
                        Console.WriteLine("Enter Id of emp to be searched");
                        int idToSearch=Convert.ToInt32(Console.ReadLine()) ;

                        var searched=dbContext.GetById(idToSearch);
                        if (searched != null)
                        {
                            Emp empfound = searched.FirstOrDefault();
                            if (empfound != null) 
                            {
                                Console.WriteLine($"Id: {empfound.id} ,Name :{empfound.name},Address : {empfound.address}");
                            }
                            else
                            {
                                Console.WriteLine($"No Employee Found by id :{idToSearch}");
                            }

                        }
                        else
                        {
                            Console.WriteLine($"Emp by id = {idToSearch} Not found / Error");
                        }
                        break;

                    case 3:
                        Emp empToBeInsert = new Emp();

                        Console.WriteLine("Enter name of Emp");
                        empToBeInsert.name=Console.ReadLine();

                        Console.WriteLine("Enter address of Emp");
                        empToBeInsert.address=Console.ReadLine();

                        noOfRowsAffected=dbContext.InsertEmp(empToBeInsert);
                        if(noOfRowsAffected >0)
                        {
                            Console.WriteLine("Record inserted successfully");
                        }
                        else
                        {
                            Console.WriteLine("Error to insert Query");
                        }

                            break;

                    case 4:
                        Emp empToUpdate=new Emp();

                        Console.WriteLine("Enter Id of Employee to update");
                        empToUpdate.id=Convert.ToInt32(Console.ReadLine()) ;
                        Console.WriteLine("Enter name to update");
                        empToUpdate.name=Console.ReadLine();

                        Console.WriteLine("Enter address to update");
                        empToUpdate.address=Console.ReadLine();

                        noOfRowsAffected= dbContext.UpdateEmp(empToUpdate.id,empToUpdate);
                        if (noOfRowsAffected > 0) 
                        {
                            Console.WriteLine("Employee Updated Successfully");
                        }
                        else
                        {
                            Console.WriteLine("Error in update Query");
                        }
                            break;
                    case 5:
                        Console.WriteLine("Enter Id of Emp to be deleted");
                        int idToBeDeleted = Convert.ToInt32(Console.ReadLine());

                        noOfRowsAffected = dbContext.DeleteEmpRecord(idToBeDeleted);
                        if (noOfRowsAffected> 0)
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
