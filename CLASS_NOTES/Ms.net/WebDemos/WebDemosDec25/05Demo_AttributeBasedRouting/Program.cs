namespace _05Demo_AttributeBasedRouting
{
    public class Program
    {
        public static void Main(string[] args)
        {
            var builder = WebApplication.CreateBuilder(args);
            builder.Services.AddControllersWithViews();
            var app = builder.Build();

            // Attribute Based Routing
            app.MapControllers();

            app.Run();
        }
    }
}
