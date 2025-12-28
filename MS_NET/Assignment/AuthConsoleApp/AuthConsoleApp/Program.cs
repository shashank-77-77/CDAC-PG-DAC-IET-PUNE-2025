using System;
using System.Collections.Generic;
using System.Linq;
using Microsoft.Data.SqlClient;

class Program
{
    static string cs =
@"Server=SHASHANK\SQLEXPRESS01;Database=AuthDB;Trusted_Connection=True;TrustServerCertificate=True;";

    static void Main()
    {
        while (true)
        {
            Console.Clear();
            Console.WriteLine("1. Login");
            Console.WriteLine("2. Create User");
            Console.WriteLine("3. Forgot Password");
            Console.Write("Select: ");

            switch (Console.ReadLine())
            {
                case "1": Login(); break;
                case "2": CreateUser(); break;
                case "3": ResetPassword(); break;
                default: Console.WriteLine("Invalid Choice"); break;
            }

            Console.WriteLine("\nPress any key...");
            Console.ReadKey();
        }
    }

    static List<User> FetchUsers()
    {
        List<User> users = new();
        using SqlConnection con = new SqlConnection(cs);
        con.Open();
        SqlCommand cmd = new SqlCommand("SELECT * FROM Users", con);
        SqlDataReader dr = cmd.ExecuteReader();
        while (dr.Read())
            users.Add(new User
            {
                Id = (int)dr[0],
                Name = dr[1].ToString()!,
                Pass = dr[2].ToString()!
            });
        return users;
    }

    static void Login()
    {
        Console.Write("Username: ");
        string u = Console.ReadLine()!;
        Console.Write("Password: ");
        string p = Console.ReadLine()!;

        var match = FetchUsers().FirstOrDefault(x => x.Name == u && x.Pass == p);

        if (match != null)
        {
            Console.WriteLine("Login Successful");
            Console.WriteLine($"Welcome, {match.Name}");
            Console.WriteLine("Redirecting to Dashboard...");
        }
        else Console.WriteLine("Invalid Username or Password");
    }

    static void CreateUser()
    {
        Console.Write("New Username: ");
        string u = Console.ReadLine()!;
        Console.Write("New Password: ");
        string p = Console.ReadLine()!;

        using SqlConnection con = new SqlConnection(cs);
        con.Open();
        SqlCommand cmd = new SqlCommand("INSERT INTO Users VALUES(@u,@p)", con);
        cmd.Parameters.AddWithValue("@u", u);
        cmd.Parameters.AddWithValue("@p", p);
        cmd.ExecuteNonQuery();
        Console.WriteLine("User Created Successfully");
    }

    static void ResetPassword()
    {
        Console.Write("Username: ");
        string u = Console.ReadLine()!;
        Console.Write("New Password: ");
        string p = Console.ReadLine()!;

        using SqlConnection con = new SqlConnection(cs);
        con.Open();
        SqlCommand cmd = new SqlCommand("UPDATE Users SET Password=@p WHERE Username=@u", con);
        cmd.Parameters.AddWithValue("@u", u);
        cmd.Parameters.AddWithValue("@p", p);

        Console.WriteLine(cmd.ExecuteNonQuery() > 0 ? "Password Updated" : "User Not Found");
    }
}

class User
{
    public int Id;
    public required string Name;
    public required string Pass;
}
