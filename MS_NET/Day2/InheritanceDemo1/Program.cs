namespace InheritanceDemo1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            
            #region Inheritance Demo 1
            //InsertInMySqlServer();
            //UpdateInMySqlServer();
            //DeleteInMySqlServer();
            //MySqlServer mysql = new MySqlServer();
            //mysql.Insert();
            //mysql.Update();
            //mysql.Delete();
            #endregion

            Console.WriteLine("Enter your Db choice. 1. SqlServer, 2. MySql Server, 3. Oracle Server");
            int dbChoice = Convert.ToInt32(Console.ReadLine());

            DataBaseFactory factory = new DataBaseFactory();
            IDatabase someDatabaseObject = factory.GetSomeDatabase(dbChoice);
            Console.WriteLine("Enter db operation choice : 1. Insert, 2. Update, 3. Delete");
            int opChoice = Convert.ToInt32(Console.ReadLine());
            switch (opChoice)
            {
                case 1:
                    someDatabaseObject.Insert();
                    break;
                case 2:
                    someDatabaseObject.Update();
                    break;
                case 3:
                    someDatabaseObject.Delete();
                    break;
                default:
                    Console.WriteLine("Invalid Db operation Choice");
                    break;
            }

        }

    }
    public interface IDatabase
    {
        void Insert();
        void Update();
        void Delete();
    }
    public class DataBaseFactory
    {
       
        public IDatabase GetSomeDatabase(int dbChoice)
        {
            IDatabase db = null;
            switch (dbChoice)
            {
                case 1:
                    db = new SqlServer();
                    break;
                case 2:
                    db = new MySqlServer();
                    break;
                case 3:
                    db = new OracleServer();
                    break;
                default:
                    db = null;
                    break;
            }
            return db;
        }
    }
    public class MySqlServer : IDatabase
    {
        public void Insert()
        {
            Console.WriteLine("Record Inserted in MySql Successfylly");
        }
        public void Update()
        {
            Console.WriteLine("Record Updated in MySql Successfylly");
        }
        public void Delete()
        {
            Console.WriteLine("Record Deleted from MySql Successfylly");
        }
    }
    public class SqlServer : IDatabase
    {
        public void Insert()
        {
            Console.WriteLine("Record Inserted in SqlServer Successfylly");
        }
        public void Update()
        {
            Console.WriteLine("Record Updated in SqlServer Successfylly");
        }
        public void Delete()
        {
            Console.WriteLine("Record Deleted from SqlServer Successfylly");
        }
    }

    public class OracleServer : IDatabase
    {
        public void Delete()
        {
            Console.WriteLine("Record Deleted from OracleServer Successfylly");
        }

        public void Insert()
        {
            Console.WriteLine("Record Inserted from OracleServer Successfylly");
        }

        public void Update()
        {
            Console.WriteLine("Record Updated from OracleServer Successfylly");
        }
    }
}
