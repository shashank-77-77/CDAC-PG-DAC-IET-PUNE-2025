using _08Demo_Bootstrap_Layout_PartialView.Models;
using Microsoft.AspNetCore.Mvc;

namespace _08Demo_Bootstrap_Layout_PartialView.Controllers
{
    public class DemoController : Controller
    {
        private Product _product = new Product()
        {
            Id = 1,
            Name = "Asus Laptop",
            Price = 75000
        };
        public IActionResult Index()
        {
            return View();
        }

        public IActionResult GetProducts()
        {
            ProductViewModel productViewModel = new ProductViewModel()
            {
                Product = _product,
                CategoryName = "Electronics",
                isInStock = true,
                Message = "This is a high-performance laptop suitable for gaming and professional work. OFFER: 50% discount"
            };
            return View(productViewModel);
        }

    }
}
