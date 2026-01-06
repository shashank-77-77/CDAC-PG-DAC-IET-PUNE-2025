using Microsoft.AspNetCore.Mvc;

namespace ConventialRouting.Controllers
{
    public class DemoController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }
    }
}
