namespace Report_Demo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            while (true)
            {
                Console.WriteLine("Enter your choice : 1. PDF 2.DOCX 3. Excel 4.XML 5. JSON");
                int choice=Convert.ToInt32(Console.ReadLine());
                ReportFactory factory = new ReportFactory();
                Report report=factory.GetSomeReport(choice);
                report.GenerateReport();
                Console.WriteLine("Do you want to continue ? 'y/n'");
                string yesnochoice= Console.ReadLine();

                if( yesnochoice == "n")
                {
                    break;
                }
            }
        }
    }

    public abstract class Report
    {
        protected abstract void Parse();
        protected abstract void Validate();
        protected abstract void Save();
        public virtual void GenerateReport()
        {
            Parse();
            Validate();
            Save();
            Console.WriteLine("Report Generated");
        }
    }

    public abstract class SepcialReport : Report
    {
        protected abstract void Revalidate();
        public override void GenerateReport()
        {
            Parse();
            Validate();
            Save();
            Console.WriteLine("Special Report generated");
        }
    }
    public class ReportFactory
    {
        public Report GetSomeReport(int choice)
        {
            Report someReport = null;
            switch (choice)
            {
                case 1:
                    someReport = new PDF();
                    break;
                case 2:
                    someReport = new DOCX();
                    break;
                case 3:
                    someReport = new Excel();
                    break;
                case 4:
                    someReport = new XML();
                    break;
                case 5:
                    someReport = new JSON();
                    break;
                default:
                    someReport = null;
                    break;
            }
            return someReport;
        }
    }
    public class XML : SepcialReport
    {
        protected override void Parse()
        {
            Console.WriteLine("XML parsed");
        }
        protected override void Validate()
        {
            Console.WriteLine("XML validate");
        }
        protected override void Save()
        {
            Console.WriteLine("XML Save");
        }

        protected override void Revalidate()
        {
            Console.WriteLine("XML Revalidate");
        }
    }

    public class JSON : SepcialReport
    {
        protected override void Parse()
        {
            Console.WriteLine("JSON parse");
        }

        protected override void Validate()
        {
            Console.WriteLine("JSON Validate");
        }

        protected override void Save() {
            Console.WriteLine("JSON save");
        }

        protected override void Revalidate() {
            Console.WriteLine("JSON Revalidate");
        }
    }

    public class PDF  : Report
    {
        protected override void Parse() {
            Console.WriteLine("PDF Parse");
        }

        protected override void Validate() {
            Console.WriteLine("PDF Validate");
        }
        protected override void Save()
        {
            Console.WriteLine("PDF Save");
        }
    }

    public class DOCX : Report
    {
        protected override void Parse()
        {
            Console.WriteLine("DOCX parse");
        }

        protected override void Validate() {
            Console.WriteLine("DOCX validate");
        }

        protected override void Save()
        {
            Console.WriteLine("DOCX Save");
        }
    }

    public class Excel : Report
    {
        protected override void Parse()
        {
            Console.WriteLine("Excel Parse");
        }

        protected override void Validate()
        {
            Console.WriteLine("Excel Validate");
        }

        protected override void Save()
        {
            Console.WriteLine("Excel Save");
        }
    }
}