namespace LINQ2
{
    internal class Program
    {
        static void Main(string[] args)
        {
            List<Emp> emps = new List<Emp>() {

                new Emp() { Id = 1, Name = "Shashank", Address = "Nagpur" },
                new Emp() { Id = 2, Name = "Soham", Address = "Satara" },
                new Emp() { Id = 3, Name = "Pratik", Address = "Nagpur" },
                new Emp() { Id = 4, Name = "Yuvraj", Address = "Amravati" },
                new Emp() { Id = 5, Name = "Tushar", Address = "Nagpur" },
                new Emp() { Id = 6, Name = "Shivam", Address = "NarayanGaon" },
                new Emp() { Id = 7, Name = "Saket", Address = "Amravati" },
                new Emp() { Id = 8, Name = "Sairaj", Address = "Pune" },
                new Emp() { Id = 9, Name = "Pranit", Address = "Pune" }
            };

            #region Filter Cities
            Console.WriteLine("Enter City For Search:");
            string? city = Console.ReadLine().ToLower();

            Func<Emp, bool> del = emp => emp.Address.ToLower() == city;

            foreach (Emp emp in emps)
            {
                //if(emp.Address.ToLower() == city)
                if (del(emp))
                {
                    Console.WriteLine($"Id: {emp.Id}, Name: {emp.Name}, Address: {emp.Address}");
                }
            }
            #endregion
        }
    }
    public class Emp
    {
        public int Id { get; set; }
        public string Name { get; set; }
        public string Address { get; set; }
    }
}
