using Microsoft.AspNetCore.Mvc;

namespace AttributeBasedRouting.Controllers
{
    [Route("Admin")]
    public class DemoController : Controller
    {
        [Route("Demo")]
        public IActionResult Demo()
        {
            return View("~/Views/Demo/Data.cshtml");
        }

        [Route("Greet")]

        public string SayHi()
        {
            return "Hello Soham!!";
        }
    }
}
