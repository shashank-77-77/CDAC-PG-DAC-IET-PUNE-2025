using Microsoft.AspNetCore.Mvc;

namespace _05Demo_AttributeBasedRouting.Controllers
{
    [Route("[controller]")] // Token based routing
    public class DashboardController : Controller
    {
        [Route("[action]")]
        public int GetNumber()
        {
            return 100;
        }
        [Route("[action]/{id?}/{nm?}")]
        public string GetSomething(int id, string nm)
        {
            return $"Id: {id}, Name:{nm}";
        }
    }
}
