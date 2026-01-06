using System.Diagnostics;
using _12Demo_DbFirst.Models;
using Microsoft.AspNetCore.Mvc;

namespace _12Demo_DbFirst.Controllers
{
    public class HomeController : Controller
    {
        private readonly IetdbContext _dbcontext;

        public HomeController(IetdbContext dbcontext)
        {
            _dbcontext = dbcontext;
        }

        public IActionResult Index()
        {
            var allEmps = _dbcontext.Emps.ToList(); 
            return View(allEmps);
        }

        public IActionResult Privacy()
        {
            return View();
        }

        [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
        public IActionResult Error()
        {
            return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
        }
    }
}
