using System;
using System.Collections.Generic;
using Microsoft.EntityFrameworkCore;

namespace _12Demo_DbFirst.Models;

public partial class IetdbContext : DbContext
{
    public IetdbContext()
    {
    }

    public IetdbContext(DbContextOptions<IetdbContext> options)
        : base(options)
    {
    }

    public virtual DbSet<Emp> Emps { get; set; }

    protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder) { }

    

    protected override void OnModelCreating(ModelBuilder modelBuilder)
    {
        modelBuilder.Entity<Emp>(entity =>
        {
            entity.ToTable("Emp");

            entity.Property(e => e.Id).HasColumnName("id");
            entity.Property(e => e.Address)
                .HasMaxLength(50)
                .IsUnicode(false)
                .HasColumnName("address");
            entity.Property(e => e.Name)
                .HasMaxLength(50)
                .IsUnicode(false)
                .HasColumnName("name");
        });

        OnModelCreatingPartial(modelBuilder);
    }

    partial void OnModelCreatingPartial(ModelBuilder modelBuilder);
}
