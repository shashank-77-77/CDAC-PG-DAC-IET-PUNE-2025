using Microsoft.AspNetCore.Mvc;

namespace ReturnTypesOfActionMethod.Controllers
{
    public class HomeController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }
        // Most common Return Type in old MVC version(Standard .Net)
        public ActionResult About()
        {
            return View();
        }
        // Strongly -typed return type of Method : Generic Type<T>
        public ActionResult<int> GetNumber()
        {
            return 1111;
        }
        public ViewResult M1()
        {
            return View("~/Views/Home/About.cshtml");
        }
        public string GetSomething(string unm, string pwd)
        {
            return $"{unm} {pwd}";
        }

        public JsonResult GetData()
        {
            var data = new
            {
                ID = 101,
                Name = "Hugh Jackman",
                Address = "NYC"
            };
            return Json(data); // JSON
        }

        public StatusCodeResult GetStatus()
        {
            return StatusCode(404);
        }

        public ObjectResult GetObject()
        {
            var obj = new
            {
                ID = 101,
                Name = "Hugh Jackman",
                Address = "NYC"
            };
            return new ObjectResult(obj);
        }

        public EmptyResult DoNothing()
        {
            return new EmptyResult();
        }

        public async Task<ViewResult> GetResult()
        {
            await Task.Delay(3000);
            return View("~/Views/Home/GetData.cshtml");
        }

        public FileResult DownloadFile()
        {
            var byteArray = System.IO.File.ReadAllBytes(@"C:\Users\IET\Desktop\soham sss\CDAC_PG-DAC\250845920083\Notes\Ms.net\WebApplicationsDemo\MVC_Template\ReturnTypesOfActionMethod\Data\quote.pdf");

            return File(byteArray, "application/pdf", "quote.pdf");
        }
    }
}

