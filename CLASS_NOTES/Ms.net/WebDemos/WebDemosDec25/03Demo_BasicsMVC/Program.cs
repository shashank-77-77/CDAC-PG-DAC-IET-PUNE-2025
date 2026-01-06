using _03Demo_BasicsMVC.Controllers;
using Microsoft.AspNetCore.Mvc.ViewEngines;

namespace _03Demo_BasicsMVC
{
    public class Program
    {
        public static void Main(string[] args)
        {
            var builder = WebApplication.CreateBuilder(args);
            // Bind Services :Setting application Dependencies
            builder.Services.AddControllersWithViews();

            var app = builder.Build();

            // URL: "/" : /Home/Index
            // URL : "/Home": /Home/Index
            // URL : /Home/Index : Default Route
            //Conventional Based Routing
            app.MapDefaultControllerRoute();
            
            app.Run();
        }
    }
}
