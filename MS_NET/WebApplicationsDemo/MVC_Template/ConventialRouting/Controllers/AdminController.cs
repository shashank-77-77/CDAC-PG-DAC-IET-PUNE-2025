using Microsoft.AspNetCore.Mvc;

namespace ConventialRouting.Controllers
{
    public class AdminController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }
    }
}
