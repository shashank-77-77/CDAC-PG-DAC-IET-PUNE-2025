namespace _08Demo_Bootstrap_Layout_PartialView
{
    public class Program
    {
        public static void Main(string[] args)
        {
            var builder = WebApplication.CreateBuilder(args);
            builder.Services.AddControllersWithViews();
            var app = builder.Build();

            //bootstrap,images, pdf,text files
            app.UseStaticFiles();
            
            app.MapDefaultControllerRoute();

            app.Run();
        }
    }
}
