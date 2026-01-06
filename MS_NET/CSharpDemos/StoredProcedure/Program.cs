using Microsoft.Data.SqlClient;

namespace StoredProcedure
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string connectionstring = "Data Source=(LocalDB)\\MSSQLLocalDB;Initial Catalog=Dac83;Integrated Security=True";

            InsertDepartment(connectionstring, "Sales");
            //InsertEmployee(connectionstring, "Soham", 3);
            //InsertEmployee(connectionstring, "Shashank", 1);
            //InsertEmployee(connectionstring, "sham", 2);

            GetEmployeeById(connectionstring, 4);
            GetEmployeeById(connectionstring, 1);

            Console.WriteLine("Done");
        }
        public static void InsertDepartment(string constr, string deptName)
        {
            using (SqlConnection con = new SqlConnection(constr))
            {
                con.Open();
                using (SqlCommand cmd = new SqlCommand())
                {
                    cmd.CommandType = System.Data.CommandType.StoredProcedure;
                    cmd.CommandText = "InsertDepartment";
                    cmd.Connection = con;
                    cmd.Parameters.AddWithValue("@DepartmentName", deptName);

                    cmd.ExecuteNonQuery();
                }
            }
        }
        public static void InsertEmployee(string conStr, string empName, int deptId)
        {
            using (SqlConnection con = new SqlConnection(conStr))
            {
                con.Open();
                using (var command = new SqlCommand("InsertEmployee", con))
                {
                    command.CommandType = System.Data.CommandType.StoredProcedure;
                    command.Parameters.AddWithValue("@EmployeeName", empName);
                    command.Parameters.AddWithValue("@DepartmentId", deptId);
                    command.ExecuteNonQuery();
                }
            }
        }

        public static void GetEmployeeById(string constring, int id)
        {
            using (var connection = new SqlConnection(constring))
            {
                connection.Open();
                using (var command = new SqlCommand("GetEmployeeByDepartment", connection))
                {
                    command.CommandType = System.Data.CommandType.StoredProcedure;
                    command.Parameters.AddWithValue("@DepartmentId", id);

                    using (var reader = command.ExecuteReader())
                    {
                        while (reader.Read()) 
                        {
                            Console.WriteLine($"Id: {reader["EmployeeId"]}, Name:{reader["EmployeeName"]}");
                        }
                    }
                }
            }
        }
    }
}