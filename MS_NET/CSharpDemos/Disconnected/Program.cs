using Microsoft.Data.SqlClient;
using System.Data;
using System.Reflection;

namespace Disconnected
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string connection = "Data Source=(LocalDB)\\MSSQLLocalDB;Initial Catalog=Dac83;Integrated Security=True";
            #region SelectQuery

            //SqlConnection conn = new SqlConnection(connection);

            //SqlDataAdapter da = new SqlDataAdapter("Select * from Emp", conn);

            //da.MissingSchemaAction = MissingSchemaAction.AddWithKey;

            //DataSet ds = new DataSet();
            //da.Fill(ds, "Emp");

            //foreach(DataRow row in ds.Tables["Emp"].Rows)
            //{
            //    int id=Convert.ToInt32(row["id"]);
            //    string nm = row["name"].ToString();
            //    string add = row["address"].ToString();

            //    Console.WriteLine($"Id :{id},Name:{nm},Address:{add}");
            //}  
            #endregion


            #region Insert Query
            //SqlConnection con = new SqlConnection(connection);
            //SqlDataAdapter da = new SqlDataAdapter("SELECT * FROM EMP", con);

            //da.MissingSchemaAction = MissingSchemaAction.AddWithKey;

            //SqlCommandBuilder builder = new SqlCommandBuilder(da);

            //DataSet ds = new DataSet();
            //da.Fill(ds, "Emp");
            ////ds.GetXml()

            //Console.WriteLine("Enter Name:");
            //string nm = Console.ReadLine();
            //Console.WriteLine("Enter Address:");
            //string add = Console.ReadLine();

            //DataRow newRow = ds.Tables["Emp"].NewRow();
            //newRow["Name"] = nm;
            //newRow["Address"] = add;

            //ds.Tables["Emp"].Rows.Add(newRow);

            //da.Update(ds, "Emp");
            //Console.WriteLine("Record inserted!"); 
            #endregion
        }
    }
}
