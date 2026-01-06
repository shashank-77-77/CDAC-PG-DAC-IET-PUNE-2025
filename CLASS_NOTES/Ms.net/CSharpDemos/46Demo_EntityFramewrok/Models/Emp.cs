using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace _46Demo_EntityFramewrok.Models
{
    // POCO : Code - First Approach
    [Table("Emp")] // db table name 
    public class Emp
    {
        [Key] // primary key + identity(1,1)
        [Column("Id", TypeName = "int")]
        public int Id { get; set; }

        [Column("Name",TypeName ="varchar(50)")]
        public string? Name { get; set; }

        [Column("Address", TypeName = "varchar(50)")]
        public string? Address { get; set; }
    }
}
