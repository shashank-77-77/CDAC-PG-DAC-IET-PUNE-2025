using _46Demo_EntityFramewrok.Models;
using Microsoft.EntityFrameworkCore;
using Microsoft.Extensions.Configuration;

namespace _46Demo_EntityFramewrok.DAL
{
    public class IETDbContext : DbContext
    {
        public DbSet<Emp> emps { get; set; }

        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            // Service to read config file.
            // A service to read appsettings.json file
            var builder = new ConfigurationBuilder();

            //string dirPath = Directory.GetCurrentDirectory();//// Path =" /bin/debug/net8.0" 
            builder.SetBasePath(Directory.GetCurrentDirectory());

            // Add the JSON file to the configuration and copy appsettings.json file to the output directory
            builder.AddJsonFile("appsettings.json");

            // Build the configuration
           IConfiguration config = builder.Build();

            // // Read the config file
            //string connectionString = config.GetConnectionString("IETDb");

            optionsBuilder.UseSqlServer(config.GetConnectionString("IETDb"));
        }
    }
}
