using _11Demo_EF_Filters_Sessions_WebAPI.Filters;
using _11Demo_EF_Filters_Sessions_WebAPI.Models;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;

namespace _11Demo_EF_Filters_Sessions_WebAPI.Controllers
{
    public class DemoController : BaseController
    {
        private readonly IETDbContext _db;

        public DemoController(IETDbContext db)
        {
            _db = db;
        }
        // GET: DemoController
        public ActionResult Index()
        {
            var allEmps = _db.emps.ToList();
            return View(allEmps);
        }

        // GET: DemoController/Details/5
        public ActionResult Details(int id)
        {
            return View();
        }

        // GET: DemoController/Create
        public ActionResult Create()
        {
            return View();
        }

        // POST: DemoController/Create
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Create(IFormCollection collection)
        {
            try
            {
                return RedirectToAction(nameof(Index));
            }
            catch
            {
                return View();
            }
        }

        // GET: DemoController/Edit/5
        public ActionResult Edit(int id)
        {
            return View();
        }

        // POST: DemoController/Edit/5
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Edit(int id, IFormCollection collection)
        {
            try
            {
                return RedirectToAction(nameof(Index));
            }
            catch
            {
                return View();
            }
        }

        // GET: DemoController/Delete/5
        public ActionResult Delete(int id)
        {
            return View();
        }

        // POST: DemoController/Delete/5
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Delete(int id, IFormCollection collection)
        {
            try
            {
                return RedirectToAction(nameof(Index));
            }
            catch
            {
                return View();
            }
        }
    }
}
