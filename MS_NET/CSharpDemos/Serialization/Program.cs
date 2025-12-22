using System.Text.Json;
using System.Text.Json.Serialization;
using System.Xml.Serialization;

namespace Serialization
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string filePath = @"C:\Users\IET\Desktop\soham sss\CDAC_PG-DAC\250845920083\MS_NET\CSharpDemos\Serialization\Files\Data.xml";

            string filePath1 = @"C:\Users\IET\Desktop\soham sss\CDAC_PG-DAC\250845920083\MS_NET\CSharpDemos\Serialization\Files\Data.json";

            Emp emp = new Emp();
            emp.Id = 111;
            emp.Name = "Shashank Mankar";
            emp.Address = "Gokhale Nagar";

            //Type type = emp.GetType();
            //XmlSerializer xr = new XmlSerializer(type);

            #region XML Serialization 
            //FileStream fs = null;

            //if (File.Exists(filePath))
            //{
            //    fs = new FileStream(filePath, FileMode.Append, FileAccess.Write);
            //}
            //else
            //{
            //    fs = new FileStream(filePath, FileMode.OpenOrCreate, FileAccess.Write);
            //}

            //XmlSerializer xr = new XmlSerializer(typeof(Emp));
            //xr.Serialize(fs, emp);
            //fs.Close();
            //Console.WriteLine("Done");
            #endregion

            #region XML DeSerialization
            //FileStream fs = null;

            //if (File.Exists(filePath))
            //{
            //    fs = new FileStream(filePath, FileMode.Open, FileAccess.Read);
            //}
            //else
            //{
            //    Console.WriteLine("File does not exist!");
            //}

            //XmlSerializer xr = new XmlSerializer(typeof(Emp));
            //Emp empData = xr.Deserialize(fs) as Emp;
            //fs.Close();
            //Console.WriteLine($"Id = {empData.Id}, Name = {empData.Name}, Address= {empData.Address}");
            #endregion

            #region JSON Serialization 

            //FileStream fs = null;

            //if (File.Exists(filePath1))
            //{
            //    fs = new FileStream(filePath1, FileMode.Append, FileAccess.Write);
            //}
            //else
            //{
            //    fs = new FileStream(filePath1, FileMode.OpenOrCreate, FileAccess.Write);
            //}

            //JsonSerializer.Serialize<Emp>(fs, emp);
            //fs.Close();
            Console.WriteLine("Done");
            #endregion

            #region JSON DeSerialization
            //FileStream fs = null;

            //if (File.Exists(filePath1))
            //{
            //    fs = new FileStream(filePath1, FileMode.Open, FileAccess.Read);
            //}
            //else
            //{
            //    Console.WriteLine("File does not exist!");
            //}

            //Emp empData = JsonSerializer.Deserialize<Emp>(fs);
            //fs.Close();
            //Console.WriteLine($"Id = {empData.Id}, Name = {empData.Name}, Address= {empData.Address}");
            #endregion


        }
    }
    public class Emp
    {
        private int _Id;
        private string _Name;
        private string _Address;

        [XmlIgnore]
        [JsonIgnore]
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
