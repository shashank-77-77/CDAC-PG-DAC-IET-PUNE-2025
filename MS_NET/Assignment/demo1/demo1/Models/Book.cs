using System.ComponentModel.DataAnnotations;

namespace demo1.Models;


public class Book
{
    public int BookId { get; set; }

    [Required]
    public string BookName { get; set; }

    [Required]
    public string Author { get; set; }

    [Required]
    public string Genre { get; set; }

    [Range(1000, 2100, ErrorMessage = "Enter valid publication year")]
    public int PublicationYear { get; set; }
}
