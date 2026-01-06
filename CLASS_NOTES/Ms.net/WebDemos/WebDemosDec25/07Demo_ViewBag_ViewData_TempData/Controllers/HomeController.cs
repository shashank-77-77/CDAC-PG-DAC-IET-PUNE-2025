using System.Collections;
using System.Diagnostics;
using _07Demo_ViewBag_ViewData_TempData.Models;
using Microsoft.AspNetCore.Mvc;

namespace _07Demo_ViewBag_ViewData_TempData.Controllers
{
    public class HomeController : Controller
    {
        List<Emp> empList = new List<Emp>()
            {
                new Emp(){ Id= 101, Name= "Pooja", Address="Pune"},
                new Emp(){ Id= 102, Name= "Neha", Address="Nagpur"},
                new Emp(){ Id= 103, Name= "Tina", Address="Thane"},
                new Emp(){ Id= 104, Name= "Pinky", Address="Puri"},
                new Emp(){ Id= 105, Name= "Jaspreet", Address="Jamnagar"},

            };

        List<Customer> customerList = new List<Customer>() { 
         new Customer(){CId= 1, CName="Bob", BillNo= 1234 },
         new Customer(){CId= 2, CName="Rob", BillNo= 5678 },
         new Customer(){CId= 3, CName="Tom", BillNo= 2468 },
        };
        public IActionResult Index()
        {
            //string name = "Hugh Jackman";
            //return View("Index",name);
            long phNo = 8275006278;
            return View(phNo);
        }
        public IActionResult GetEmps()
        {
            return View(empList);
        }
        public IActionResult GetRecords()
        {
            IETDbViewModel vmmodel = new IETDbViewModel() { 
                allEmps = empList,
                allCusts= customerList
            };
            return View(vmmodel);
        }
        public IActionResult Display()
        {
            Emp emp= new Emp() { Id= 44, Name="Timothy", Address="London"};
            Customer cust= new Customer() { CId= 88, CName="Tony Stark", BillNo= 007};
            ArrayList arr = new ArrayList() { emp,cust};
            return View(arr);
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
