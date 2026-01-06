using _11Demo_EF_Filters_Sessions_WebAPI.Logger;
using Microsoft.AspNetCore.Diagnostics;

namespace _11Demo_EF_Filters_Sessions_WebAPI.Filters
{
    public class IETExExceptionFilter : IExceptionHandler
    {
        public ValueTask<bool> TryHandleAsync(HttpContext httpContext, Exception exception, CancellationToken cancellationToken)
        {
            FileLogger.CurrentLogger.Log(exception.Message);

            httpContext.Response.Redirect("/Exception/Error");
            // We have handled exception with our custom filter
            return ValueTask.FromResult(true);
        }
    }
}
