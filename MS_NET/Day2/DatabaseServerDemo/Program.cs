using System.Net.Http.Headers;
using System.Reflection.Metadata;
using System.Runtime.CompilerServices;

namespace DatabaseServerDemo
{
    internal class Program
    {

        static void Main(string[] args)
        {
            while (true) {
                Console.WriteLine("Enter your Db choice. 1. SqlServer, 2. MySql Server, 3. Oracle Server");
                int dbchoice = Convert.ToInt32(Console.ReadLine());

                DataBaseFactory factory = new DataBaseFactory();
                Database someDatabaseObject = factory.GetSomeDatabase(dbchoice);
                Console.WriteLine("Enter db operation choice : 1. Insert, 2. Update, 3. Delete");
                int opChoice = Convert.ToInt32(Console.ReadLine());

                switch (opChoice) {

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
                        Console.WriteLine("Invalid Db opreations Choice");
                        break;
                }

                Console.WriteLine("Do you want to continue? y/n");
                string yesnochoice = Console.ReadLine();
                if (yesnochoice == "n")
                {
                    break;
                }
            }
        }
    }

    public abstract class Database
    {

        public Logger _logger = null;
        public Database()
        {
            _logger=Logger.GetLogger();
        }
        protected abstract void DoInsert();
        protected abstract void DoUpdate();
        protected abstract void DoDelete();

        protected abstract string GetDatabaseName();

        public void Insert()
        {
            DoInsert();
            _logger.Log($"Insert Form {GetDatabaseName()} done.");
        }

        public void Update()
        {
            DoUpdate();
            _logger.Log($"Update from {GetDatabaseName()} done.");
        }

        public void Delete()
        {
            DoDelete();
            _logger.Log($"Delete from {GetDatabaseName()} done");
        }
    }

    public class DataBaseFactory
    {
        public Database GetSomeDatabase(int dbchoice)
        {
            Database db = null;
            switch (dbchoice) {
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

    public class MySqlServer : Database
    {
        protected override string GetDatabaseName()
        {
            return "MySQL Server";
        }

        protected override void DoInsert()
        {
            Console.WriteLine("Record Inserted in MySql Successfully");
        }

        protected override void DoUpdate()
        {
            Console.WriteLine("Record Updated in MySql Successfully");
        }
        protected override void DoDelete()
        {
            Console.WriteLine("Record Deleted from MySql successfully");
        }
     
    }

    public class SqlServer : Database
    {
        protected override string GetDatabaseName()
        {
            return "Sql Server";
        }

        protected override void DoInsert()
        {
            Console.WriteLine("Record inserted in Sql Server successfully");
        }

        protected override void DoUpdate()
        {
            Console.WriteLine("Record Updated in Sql Server successfully");
        }

        protected override void DoDelete()
        {
            Console.WriteLine("Record Deleted from Sql Server successfully");
        }
    }

    public class OracleServer:Database
    {
        protected override string GetDatabaseName()
        {
            return "OracleServer";
        }

        protected override void DoInsert()
        {
            Console.WriteLine("Record Inserted in Oracle Server successfully");
        }
        protected override void DoUpdate()
        {
            Console.WriteLine("Record Updated in Oracle Server successfully");
        }

        protected override void DoDelete()
        {
            Console.WriteLine("Record Deleted from Oracle Server successfully");
        }
    }


    public class Logger
    {
        private static readonly Logger _logger1 =new Logger();

        private Logger()
        {
            Console.WriteLine("Logger Object is created for the first time");
        }

        public static Logger GetLogger()
        {
            return _logger1;
        }

        public void Log(string message)
        {
            Console.WriteLine("-Logged at {0},message : {1}",DateTime.Now.ToString(),message);
        }
    }
}
