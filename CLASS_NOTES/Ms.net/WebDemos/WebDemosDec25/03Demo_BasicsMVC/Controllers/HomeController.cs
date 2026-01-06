using Microsoft.AspNetCore.Mvc;

namespace _03Demo_BasicsMVC.Controllers
{
    // /Home/Index
    public class HomeController : Controller
    {
        // Action Method
        public IActionResult Index()
        {
            return View();
        }
    }
}
