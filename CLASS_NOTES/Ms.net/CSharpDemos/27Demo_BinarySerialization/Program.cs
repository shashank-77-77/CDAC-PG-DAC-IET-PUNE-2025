using System.Runtime.Serialization.Formatters.Binary;

namespace _27Demo_BinarySerialization
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string filePath = @"D:\IET_Dec_25_Batch\CSharpDemos\26Demo_FileIO\Files\data3.txt";

            Emp emp = new Emp();
            emp.Id = 101;
            emp.Name = "Tony Stark";
            emp.Address = "Shivaji Nagar";

            #region BinaryFormatter : Serialize
            //FileStream fs = null;
            //if (File.Exists(filePath))
            //{
            //    fs = new FileStream(filePath, FileMode.Append, FileAccess.Write);
            //}
            //else
            //{
            //    fs = new FileStream(filePath, FileMode.OpenOrCreate, FileAccess.Write);
            //}

            //BinaryFormatter bf = new BinaryFormatter();
            //bf.Serialize(fs, emp);// emp, book, customer
            //fs.Close();
            //Console.WriteLine("Done"); 
            #endregion

            #region BinaryFormatter : Deserialize

            //FileStream fs = null;
            //if (File.Exists(filePath))
            //{
            //    fs = new FileStream(filePath, FileMode.Open, FileAccess.Read);
            //}
            //else
            //{
            //    Console.WriteLine("File does not exist!");
            //}

            //BinaryFormatter bf = new BinaryFormatter();
            //Emp empData = bf.Deserialize(fs) as Emp;
            //fs.Close();

            //Console.WriteLine($"Id = {empData.Id}, Name = {empData.Name}, Address= {empData.Address}");

            #endregion
        }
    }

    // Gives permission to serialize the class to CLR
    [Serializable] 
    public class Emp
    {
        private int _Id;
        private string _Name;

        [NonSerialized]// do not have permission to serialize this field
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
