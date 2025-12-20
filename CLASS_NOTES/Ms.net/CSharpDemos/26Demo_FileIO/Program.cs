namespace _26Demo_FileIO
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string filePath = @"D:\IET_Dec_25_Batch\CSharpDemos\26Demo_FileIO\Files\demo1.txt";

            #region StreamWriter 

            //FileStream fs = null;

            //if (File.Exists(filePath))
            //{
            //    fs = new FileStream(filePath, FileMode.Append, FileAccess.Write);
            //}
            //else
            //{
            //    fs = new FileStream(filePath, FileMode.OpenOrCreate, FileAccess.Write);
            //}

            //StreamWriter writter = new StreamWriter(fs);
            //writter.WriteLine(" Hugh Jackman");
            //writter.Flush();
            //writter.Close();
            //fs.Close();
            //Console.WriteLine("Done.");
            #endregion

            #region StreamReader
            //FileStream fs = null;

            //if (File.Exists(filePath))
            //{
            //    fs = new FileStream(filePath, FileMode.Open, FileAccess.Read);
            //}
            //else
            //{
            //    Console.WriteLine("File does not exist!!");
            //}

            //StreamReader reader = new StreamReader(fs);
            //string content = reader.ReadToEnd();
            //reader.Close();
            //fs.Close();
            //Console.WriteLine(content);
            #endregion

            Emp emp = new Emp();
            emp.Id = 101;
            emp.Name = "Tony Stark";
            emp.Address = "Shivaji Nagar";

            #region StreamWriter 

            //FileStream fs = null;

            //if (File.Exists(filePath))
            //{
            //    fs = new FileStream(filePath, FileMode.Append, FileAccess.Write);
            //}
            //else
            //{
            //    fs = new FileStream(filePath, FileMode.OpenOrCreate, FileAccess.Write);
            //}

            //StreamWriter writter = new StreamWriter(fs);
            //writter.Write(emp);
            //writter.Flush();
            //writter.Close();
            //fs.Close();
            //Console.WriteLine("Done.");
            #endregion
        }
    }

    public class Emp
    {
        private int _Id;
        private string _Name;
        private string _Address;

        public string Address
        {
            get { return _Address; }
            set { _Address = value; }
        }


        public string Name
        {
            get { return _Name; }
            set { _Name = value; }
        }


        public int Id
        {
            get { return _Id; }
            set { _Id = value; }
        }

    }
}
