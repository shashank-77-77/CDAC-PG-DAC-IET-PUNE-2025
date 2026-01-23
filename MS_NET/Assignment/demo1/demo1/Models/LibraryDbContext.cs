using Microsoft.EntityFrameworkCore;

namespace demo1.Models
{
    public class LibraryDbContext : DbContext
    {
        public LibraryDbContext(DbContextOptions<LibraryDbContext> options)
            : base(options) { }

        public DbSet<Book> Books { get; set; }
    }
}
