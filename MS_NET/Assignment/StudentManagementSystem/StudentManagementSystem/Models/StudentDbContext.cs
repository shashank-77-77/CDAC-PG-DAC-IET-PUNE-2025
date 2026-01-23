using Microsoft.EntityFrameworkCore;

namespace StudentManagementSystem.Models
{
    public partial class StudentDbContext : DbContext
    {
        public StudentDbContext(DbContextOptions<StudentDbContext> options)
            : base(options)
        {
        }

        public virtual DbSet<Student> Students { get; set; }
        public virtual DbSet<Course> Courses { get; set; }

        protected override void OnModelCreating(ModelBuilder modelBuilder)
        {
            modelBuilder.Entity<Student>(entity =>
            {
                entity.ToTable("Student");   // 👈 FIX FOR YOUR ERROR
                entity.HasKey(e => e.StudentId);
            });

            modelBuilder.Entity<Course>(entity =>
            {
                entity.ToTable("Course");
                entity.HasKey(e => e.CourseId);
            });
        }
    }
}
