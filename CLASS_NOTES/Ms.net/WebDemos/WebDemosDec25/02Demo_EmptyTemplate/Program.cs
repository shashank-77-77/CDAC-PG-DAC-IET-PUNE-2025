namespace _02Demo_EmptyTemplate
{
    public class Program
    {
        public static void Main(string[] args)
        {
            var builder = WebApplication.CreateBuilder(args);
            var app = builder.Build();

            // Middlewares
            #region app.Map- GET , POST, PUT, DELETE
            //app.MapGet("/", () => "GET: <h1>Hello World!</h1>");
            //app.MapPost("/", () => "Post: Hello World!");
            //app.MapPut("/", () => "Put: Hello World!");
            //app.MapDelete("/", () => "Delete: Hello World!"); 
            #endregion
          #region app.Run() can not pass http context reference to next app.Run() method .
            //app.Run(async (context) => {
            //    await context.Response.WriteAsync("Hello Hugh Jackman!!");
            //    await context.Response.WriteAsync("\nHow are you!!");
            //});

            //app.Run(async (context) => {
            //    await context.Response.WriteAsync("Bye Hugh Jackman!!");
            //}); 
            #endregion
            app.Use(async (context,next) => {
                await context.Response.WriteAsync("Hello Hugh Jackman!!");
                await context.Response.WriteAsync("\nHow are you!!");
                next(context);
            });
            app.Use(async (context, next) => {
                await context.Response.WriteAsync("\nWolvarine");
                next(context);
                await context.Response.WriteAsync("\nLogan");
            });

            app.Run(async (context) => {
                await context.Response.WriteAsync("\nBye Hugh Jackman!!");
            });
            app.Run();// Host and Run Web Application
        }
    }
}
    