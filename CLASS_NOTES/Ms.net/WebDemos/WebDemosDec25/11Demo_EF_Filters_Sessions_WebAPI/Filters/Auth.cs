using Microsoft.AspNetCore.Mvc.Filters;

namespace _11Demo_EF_Filters_Sessions_WebAPI.Filters
{
    public class Auth : ActionFilterAttribute
    {
        public override void OnActionExecuting(ActionExecutingContext context)
        {
            var token = context.HttpContext.Session.GetString("token");
            if (token == null)
            {
                context.HttpContext.Response.Redirect("/Login/SignIn");
            }
        }
    }
}
