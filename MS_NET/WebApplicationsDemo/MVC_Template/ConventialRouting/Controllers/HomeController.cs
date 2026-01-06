using Microsoft.AspNetCore.Mvc;

namespace ConventialRouting.Controllers
{
    public class HomeController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }

        public ActionResult<string> UserCredentials(string usernm,string pwd)
        {
            return $"UserName :{usernm},Password :{pwd}";
        }
    }
}
