using Microsoft.Data.SqlClient;

namespace _42Demo_ConnectedAdoNet
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string connectionString = "Data Source=(LocalDB)\\MSSQLLocalDB;Initial Catalog=IETDb;Integrated Security=True";

            #region SELECT QUERY 
            // SqlConnection con = new SqlConnection(connectionString);

            // string selectQuery = "SELECT * FROM Emp";

            // SqlCommand cmd = new SqlCommand();
            // cmd.CommandType = System.Data.CommandType.Text;
            // cmd.CommandText = selectQuery;
            // cmd.Connection = con;

            // con.Open();

            //SqlDataReader reader = cmd.ExecuteReader();
            // while (reader.Read()) 
            // {
            //     int id = Convert.ToInt32(reader["Id"]);
            //     string? nm = reader["Name"].ToString();
            //     string? address =  reader["Address"].ToString();
            //     Console.WriteLine($"Id:{id}, Name: {nm}, Address: {address}");
            // }

            // con.Close(); 
            #endregion

            #region INSERT QUERY
            //SqlConnection con = new SqlConnection(connectionString);
            //Console.WriteLine("Enter Name:");
            //string nm = Console.ReadLine();
            //Console.WriteLine("Enter Address");
            //string add = Console.ReadLine();

            //string insertQuery = $"INSERT INTO Emp(NAME,ADDRESS) VALUES('{nm}','{add}')";

            //SqlCommand cmd = new SqlCommand(insertQuery, con);
            ////cmd.CommandType = System.Data.CommandType.Text;
            ////cmd.CommandText = insertQuery;
            ////cmd.Connection = con;

            //con.Open();

            //int noOfRowsAffected = cmd.ExecuteNonQuery();
            //if (noOfRowsAffected > 0)
            //{
            //    Console.WriteLine("Record inserted successfully!!");
            //}
            //else
            //{
            //    Console.WriteLine("Error");
            //}

            //con.Close(); 
            #endregion

            #region UPDATE QUERY
            //SqlConnection con = new SqlConnection(connectionString);

            //Console.WriteLine("Enter Id for Emp to be updated");
            //int id = Convert.ToInt32(Console.ReadLine());
            //Console.WriteLine("Enter Name to be updated:");
            //string nm = Console.ReadLine();
            //Console.WriteLine("Enter Address to be updated");
            //string add = Console.ReadLine();

            //string updateQuery = $"UPDATE Emp SET NAME='{nm}', ADDRESS='{add}' WHERE ID = {id}";

            //SqlCommand cmd = new SqlCommand(updateQuery, con);

            //con.Open();

            //int noOfRowsAffected = cmd.ExecuteNonQuery();
            //if (noOfRowsAffected > 0)
            //{
            //    Console.WriteLine("Record updated successfully!!");
            //}
            //else
            //{
            //    Console.WriteLine("Error");
            //}

            //con.Close(); 
            #endregion

            #region DELETE QUERY
            //SqlConnection con = new SqlConnection(connectionString);

            //Console.WriteLine("Enter Id for Emp to be deleted");
            //int id = Convert.ToInt32(Console.ReadLine());

            //string deleteQuery = $"DELETE FROM Emp WHERE ID={id}";

            //SqlCommand cmd = new SqlCommand(deleteQuery, con);

            //con.Open();

            //int noOfRowsAffected = cmd.ExecuteNonQuery();
            //if (noOfRowsAffected > 0)
            //{
            //    Console.WriteLine("Record deleted successfully!!");
            //}
            //else
            //{
            //    Console.WriteLine("Error");
            //}

            //con.Close(); 
            #endregion
        }
    }
}
