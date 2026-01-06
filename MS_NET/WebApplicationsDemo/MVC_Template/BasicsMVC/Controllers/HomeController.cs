using Microsoft.AspNetCore.Mvc;

namespace BasicsMVC.Controllers
{
    public class HomeController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }
    }
}
