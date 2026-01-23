using Microsoft.EntityFrameworkCore;

namespace WebApplication1.Models
{
    public class IETDbcontext : DbContext
    {
        public DbSet<Emp> emps { get; set; }


        //public IETDbcontext(DbContextOptions options) : base(options)
        //{

        //}
        public IETDbcontext(DbContextOptions<IETDbcontext> options)
            : base(options)
        {
        }
    }
}
