namespace ConventialRouting
{
    public class Program
    {
        public static void Main(string[] args)
        {
            var builder = WebApplication.CreateBuilder(args);

            builder.Services.AddControllersWithViews();

            var app = builder.Build();


            app.MapControllerRoute(
                name: "default",
                pattern: "{controller=Demo}/{action=Index}/{id?}"
                );

            app.MapControllerRoute(
       name: "bvs",
       pattern: "{controller=Admin}/{action=Index}/{nm}"
       );

            app.MapControllerRoute(
                name: "bvs2",
                pattern: "{controller=Home}/{action=UserCredentials}/{usernm}/{pwd}"
                );


            app.Run();
        }
    }
}
