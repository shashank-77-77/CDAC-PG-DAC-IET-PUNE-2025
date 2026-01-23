using Microsoft.EntityFrameworkCore;   // ✅ REQUIRED
using System.Collections.Generic;

namespace prac.Models
{
    public class krishnadb : DbContext
    {
        public DbSet<emp> emps { get; set; }

        public krishnadb(DbContextOptions<krishnadb> options)
            : base(options)
        {
        }
    }
}
