using System.ComponentModel.DataAnnotations;

namespace StudentManagementSystem.Models
{
    public partial class Course
    {
        public int CourseId { get; set; }

        [Required]
        public string CourseName { get; set; } = null!;
    }
}
