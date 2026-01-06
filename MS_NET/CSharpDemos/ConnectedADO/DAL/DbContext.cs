using ConnectedADO.Models;
using Microsoft.Data.SqlClient;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConnectedADO.DAL
{
    public class DbContext
    {
        string connectionString = "Data Source=(LocalDB)\\MSSQLLocalDB;Initial Catalog=Dac83;Integrated Security=True";

        public List<Emp> GetEmpRecords()
        {
            SqlConnection conn = new SqlConnection(connectionString);
            SqlCommand cmd = new SqlCommand("select * from Emp", conn);

            conn.Open();
            
            SqlDataReader reader = cmd.ExecuteReader();
            List<Emp> allEmpRecords = new List<Emp>();
            while (reader.Read())
            {
                allEmpRecords.Add(new Emp()
                {
                    id= Convert.ToInt32(reader["Id"]),
                    name = reader["Name"].ToString(),
                    address = reader["Address"].ToString()
                });
            }
            conn.Close();

            return allEmpRecords;
        }

        public List<Emp> GetById(int id) 
        {
            SqlConnection conn = new SqlConnection(connectionString);

            string selectByIdQuery = $"select * from Emp where id={id}";

            SqlCommand cmd = new SqlCommand(selectByIdQuery, conn);

            conn.Open() ;

            SqlDataReader reader = cmd.ExecuteReader();

            List<Emp> allRecords=new List<Emp>();

            while(reader.Read())
            {
                allRecords.Add(new Emp()
                {
                    id=Convert.ToInt32(reader["id"]),
                    name = reader["name"].ToString(),
                    address = reader["address"].ToString()
                });
            }
            conn.Close();

            return allRecords;
        }


        public int InsertEmp(Emp emp)
        {
            SqlConnection con = new SqlConnection(connectionString);

            string insertQuery=$"INSERT INTO Emp(name,address) values('{emp.name}','{emp.address}')";
            
            SqlCommand cmd=new SqlCommand(insertQuery, con);

            con.Open() ;

            int rowsAffected =cmd.ExecuteNonQuery();
            con.Close();

            return rowsAffected;
        }

        public int UpdateEmp(int idtoUpdate,Emp emptoupdate)
        {
            SqlConnection con = new SqlConnection( connectionString);

            string updateQuery = $"update Emp set name ='{emptoupdate.name}',Address ='{emptoupdate.address}' where id={idtoUpdate}";
            
            SqlCommand cmd=new SqlCommand(updateQuery, con);
            con.Open();
            int rowsAffected=cmd.ExecuteNonQuery();
            con.Close();
            return rowsAffected;
        }

        public int DeleteEmpRecord(int idToBeDeleted)
        {
            SqlConnection conn = new SqlConnection(connectionString);

            string deleteQuery = $"DELETE FROM EMP WHERE ID = {idToBeDeleted} ";

            SqlCommand cmd = new SqlCommand(deleteQuery, conn);
            conn.Open();
            int rowsAffected = cmd.ExecuteNonQuery();
            conn.Close();
            return rowsAffected;
        }

    }
}
 