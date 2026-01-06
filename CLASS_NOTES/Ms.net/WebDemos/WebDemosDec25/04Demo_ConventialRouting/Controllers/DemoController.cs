using Microsoft.AspNetCore.Mvc;

namespace _04Demo_ConventialRouting.Controllers
{
    public class DemoController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }
    }
}
