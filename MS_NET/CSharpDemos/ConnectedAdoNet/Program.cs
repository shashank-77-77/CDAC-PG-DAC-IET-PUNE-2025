using Microsoft.Data.SqlClient;
using Microsoft.VisualBasic;
using System.Data.SqlTypes;

namespace ConnectedAdoNet
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string connectionString = "Data Source=(LocalDB)\\MSSQLLocalDB;Initial Catalog=Dac83;Integrated Security=True";
            #region SelectQuery
            //SqlConnection conn=new SqlConnection(connectionString);

            //string selectQuery = "SELECT * FROM Emp";

            //SqlCommand cmd=new SqlCommand();
            //cmd.CommandType=System.Data.CommandType.Text;
            //cmd.CommandText=selectQuery;
            //cmd.Connection=conn;

            //conn.Open();

            //SqlDataReader reader = cmd.ExecuteReader();
            //while (reader.Read()) 
            //{
            //    int id = Convert.ToInt32(reader["id"]);
            //    string? nm= reader["name"].ToString();
            //    string? address=reader["address"].ToString();

            //    Console.WriteLine($"Id: {id},Name :{nm},Address:{address}");
            //}

            #endregion

            #region InsertQuery
            //SqlConnection con = new SqlConnection(connectionString);
            //Console.WriteLine("Enter name");
            //string nm=Console.ReadLine();
            //Console.WriteLine("Enter Address");
            //string address = Console.ReadLine();

            //string insertQuery = $"INSERT INTO Emp(name,address) VALUES('{nm}','{address}')";

            //SqlCommand cmd = con.CreateCommand();
            //cmd.CommandType=System.Data.CommandType.Text;
            //cmd.CommandText=insertQuery;
            //cmd.Connection= con;

            //con.Open();

            //int noOfRowsAffected = cmd.ExecuteNonQuery();

            //if (noOfRowsAffected > 0) 
            //{
            //    Console.WriteLine("Record inserted Successfully !!");
            //}
            //else
            //{
            //    Console.WriteLine("Error");
            //}

            //con.Close(); 
            #endregion

            #region UpdateQuery
            //SqlConnection conn=new SqlConnection(connectionString);

            //Console.WriteLine("Enter emp id to update");
            //int id = Convert.ToInt32(Console.ReadLine());

            //Console.WriteLine("Enter name to be Update");
            //string nm=Console.ReadLine();

            //Console.WriteLine("Enter Address To Be Update");
            //string address= Console.ReadLine();

            //string updateQuery = $"UPDATE Emp SET name='{nm}',address='{address}' where id={id}";

            //SqlCommand cmd=new SqlCommand(updateQuery, conn);

            //conn.Open();

            //int noOfRowsAffected = cmd.ExecuteNonQuery();
            //if (noOfRowsAffected > 0)
            //{
            //    Console.WriteLine("Record Updated Success");
            //}
            //else
            //{
            //    Console.WriteLine("Error");
            //}
            //conn.Close(); 
            #endregion

            #region DeleteQuery
            //SqlConnection conn=new SqlConnection(connectionString);

            //Console.WriteLine("Enter Id to delete");
            //int id =Convert.ToInt32(Console.ReadLine());

            //string deleteQuery = $"delete from Emp where id={id}";

            //SqlCommand cmd = new SqlCommand(deleteQuery, conn);

            //conn.Open();

            //int noOfRowsffected = cmd.ExecuteNonQuery();
            //if (noOfRowsffected > 0)
            //{
            //    Console.WriteLine("Record Deleted Successfully");
            //}
            //else
            //{
            //    Console.WriteLine("Error");
            //}

            //conn.Close(); 
            #endregion
        }
    }
}
