using Microsoft.EntityFrameworkCore;   // ? REQUIRED
using prac.Models;

namespace prac
{
    public class Program
    {
        public static void Main(string[] args)
        {
            var builder = WebApplication.CreateBuilder(args);

            builder.Services.AddDbContext<krishnadb>(options =>
                options.UseSqlServer(
                    builder.Configuration.GetConnectionString("krishnadb")
                )
            );

            builder.Services.AddControllersWithViews();

            var app = builder.Build();

            if (!app.Environment.IsDevelopment())
            {
                app.UseExceptionHandler("/Home/Error");
                app.UseHsts();
            }

            app.UseHttpsRedirection();
            app.UseRouting();
            app.UseAuthorization();

            app.MapControllerRoute(
                name: "default",
                pattern: "{controller=emps}/{action=Index}/{id?}");

            app.Run();
        }
    }
}
