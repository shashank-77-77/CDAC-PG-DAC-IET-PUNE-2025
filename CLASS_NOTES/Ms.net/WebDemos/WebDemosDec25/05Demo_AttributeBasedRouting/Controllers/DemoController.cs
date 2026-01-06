using Microsoft.AspNetCore.Mvc;

namespace _05Demo_AttributeBasedRouting.Controllers
{
    //[Route("Demo")]
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
            return "Hello !!";
        }
    }
}
