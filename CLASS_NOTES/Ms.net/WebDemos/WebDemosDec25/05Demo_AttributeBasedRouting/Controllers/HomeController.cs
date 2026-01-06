using Microsoft.AspNetCore.Mvc;

namespace _05Demo_AttributeBasedRouting.Controllers
{
    [Route("Home")]
    public class HomeController : Controller
    {
        [Route("")]
        //[Route("/Home")]
        //[Route("/Home/Index")]
        [Route("~/")]
        [Route("Index")]
        public IActionResult Index()
        {
            return View();
        }
        [Route("About")]
        public IActionResult About()
        {
            return View();
        }
        [Route("Marks/{mrk?}")]
        public int Marks(int mrk)
        {
            return mrk;
        }
    }
}
