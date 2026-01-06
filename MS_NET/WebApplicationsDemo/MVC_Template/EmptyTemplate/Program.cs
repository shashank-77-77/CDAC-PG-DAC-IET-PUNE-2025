using System.Net.Security;
using System.Security.Cryptography;

namespace EmptyTemplate
{
    public class Program
    {
        public static void Main(string[] args)
        {
            var builder = WebApplication.CreateBuilder(args);
            var app = builder.Build();

            #region app.Map- GET , POST, PUT, DELETE

            //app.MapGet("/", () => "Get : <h1>Hello world</h1>" );
            //app.MapPost("/", () => "Post : Hello soham!");
            //app.MapPut("/", () => "Put : Hello Everyone!");
            //app.MapDelete("/", () => "Delete : Hello world"); 
            #endregion


            #region  app.Run() can not pass http context reference to next app.Run() method .

            app.Run(async (context) =>
            {
                await context.Response.WriteAsync("Hello Soham");
                await context.Response.WriteAsync("\nHow are you");
            });

            app.Run(async (context) =>
            {
                await context.Response.WriteAsync("Bye Soham!!");
            }); 
            #endregion



            app.Use(async (context, next) =>
            {
                await context.Response.WriteAsync("Hello Soham!!");
                await context.Response.WriteAsync("\nHow are you!!");
                next(context);
            });

            app.Use(async (context, next) => {
                await context.Response.WriteAsync("\nVirat");
                next(context);
                await context.Response.WriteAsync("\nKholi");
            });

            app.Run(async (context) => {
                await context.Response.WriteAsync("\nBye Soham!!");
            });

            app.Run();
        }
    }
}
