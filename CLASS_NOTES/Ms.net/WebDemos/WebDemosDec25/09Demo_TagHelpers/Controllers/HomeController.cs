using _09Demo_TagHelpers.Models;
using Microsoft.AspNetCore.Mvc;

namespace _09Demo_TagHelpers.Controllers
{
    public class HomeController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }
        
        public IActionResult GetNewUserDetails(NewUser newuser)//Model Binder
        {
            return View(newuser);
        }
    }
}
