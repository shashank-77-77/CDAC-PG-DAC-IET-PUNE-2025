namespace _09Demo_TagHelpers.Models
{
    public enum Gender
    {
        Male,
        Female
    }
    public class NewUser
    {
        public string Name { get; set; }
        public int Age { get; set; }
        public Gender Gender { get; set; }
        public string Address { get; set; }
        public string Email { get; set; }
        public long PhNo { get; set; }
        public string isMarried { get; set; }
        public string Enquiry { get; set; }
    }
}
