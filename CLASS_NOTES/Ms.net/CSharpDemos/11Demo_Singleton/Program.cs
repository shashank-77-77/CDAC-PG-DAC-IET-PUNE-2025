namespace _11Demo_Singleton
{
    internal class Program
    {
        static void Main(string[] args)
        {

           while(true)
            {
                Console.WriteLine("Enter your Db choice. 1. SqlServer, 2. MySql Server, 3. Oracle Server");
                int dbChoice = Convert.ToInt32(Console.ReadLine());

                DataBaseFactory factory = new DataBaseFactory();
                Database someDatabaseObject = factory.GetSomeDatabase(dbChoice);
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

                Console.WriteLine("Do you want to continue? y/n");
                string ynChoice = Console.ReadLine();
                if ( ynChoice == "n")
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
            _logger = Logger.GetLogger();
        }
        protected abstract void DoInsert();
        protected abstract void DoUpdate();
        protected abstract void DoDelete();
        protected abstract string GetDataBaseName();

        public void Insert()
        {
            DoInsert();
            _logger.Log($"Insert From {GetDataBaseName()} done.");
        }
        public void Update()
        {
            DoUpdate();
            _logger.Log($"Update From {GetDataBaseName()} done.");
        }
        public void Delete()
        {
            DoDelete();
            _logger.Log($"Delete From {GetDataBaseName()} done.");
        }
    }
    public class DataBaseFactory
    {
        public Database GetSomeDatabase(int dbChoice)
        {
            Database db = null;
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
    public class MySqlServer :Database
    {
        protected override string GetDataBaseName()
        {
            return "MySQL Server";
        }
        protected override void DoInsert()
        {
            Console.WriteLine("Record Inserted in MySql Successfylly");
        }
        protected override void DoUpdate()
        {
            Console.WriteLine("Record Updated in MySql Successfylly");
        }
        protected override void DoDelete()
        {
            Console.WriteLine("Record Deleted from MySql Successfylly");
        }
    }
    public class SqlServer : Database
    {
        protected override string GetDataBaseName()
        {
            return "Sql Server";
        }
        protected override void DoInsert()
        {
            Console.WriteLine("Record Inserted in SqlServer Successfylly");
        }
        protected override void DoUpdate()
        {
            Console.WriteLine("Record Updated in SqlServer Successfylly");
        }
        protected override void DoDelete()
        {
            Console.WriteLine("Record Deleted from SqlServer Successfylly");
        }
    }

    public class OracleServer : Database
    {
        protected override string GetDataBaseName()
        {
            return "Oracle Server";
        }
        protected override void DoDelete()
        {
            Console.WriteLine("Record Deleted from OracleServer Successfylly");
        }

        protected override void DoInsert()
        {
            Console.WriteLine("Record Inserted from OracleServer Successfylly");
        }

        protected override void DoUpdate()
        {
            Console.WriteLine("Record Updated from OracleServer Successfylly");
        }
    }

    public class Logger
    {
        private static readonly Logger _logger1 = new Logger();
        //private static readonly Logger _logger2 = new Logger();
        //private static readonly Logger _logger3 = new Logger();

        //private static Logger[] _loggerObjectPool = new Logger[3] { _logger1, _logger2, _logger3};
        

        private Logger()
        {
            // Write a txt file for this. We will be using File IO operations
            // Path of txt file = C://MyDBApplication/Log/Log.txt
            // public void createFile(){}
            Console.WriteLine("Logger Object is created for the first time!..");
        }
        public static Logger GetLogger()
        {
            return _logger1;
        }
        //public static Logger[] GetLoggers()
        //{
        //    return _loggerObjectPool;
        //}
        public void Log(string message)
        {
            
            Console.WriteLine("---Logged at {0}, message : {1}",DateTime.Now.ToString(),message);
        }
    }
}
