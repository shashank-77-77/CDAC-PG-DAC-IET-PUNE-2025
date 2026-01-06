using Microsoft.AspNetCore.Mvc;

namespace _04Demo_ConventialRouting.Controllers
{
    public class AdminController : Controller
    {
        // URL: /Admin/Index?nm=Hugh Jackman
        public string Index(string nm)
        {
            return nm;
        }
    }
}
