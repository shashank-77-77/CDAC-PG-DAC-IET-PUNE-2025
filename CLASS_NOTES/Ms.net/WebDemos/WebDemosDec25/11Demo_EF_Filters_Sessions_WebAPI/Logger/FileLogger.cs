namespace _11Demo_EF_Filters_Sessions_WebAPI.Logger
{
    public class FileLogger
    {
        private static FileLogger _logger = new FileLogger();
        private FileLogger()
        {
            
        }
        public static FileLogger CurrentLogger
        {
            get { return _logger; }
        }

        public void Log(string message)
        {
            string path = @"D:\IET_Dec_25_Batch\WebDemos\WebDemosDec25\11Demo_EF_Filters_Sessions_WebAPI\Data\Log.txt";

            FileStream fs = null;
            if (File.Exists(path))
            {
                fs = new FileStream(path, FileMode.Append,FileAccess.Write);
            }
            else
            {
                fs = new FileStream(path, FileMode.Create, FileAccess.Write);
            }

            StreamWriter writer= new StreamWriter(fs);
            writer.WriteLine($"--Logged at {DateTime.Now.ToString()} - {message}");

            writer.Close();
            fs.Close();
        }
    }
}
