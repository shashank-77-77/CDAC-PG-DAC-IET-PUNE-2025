using _11Demo_EF_Filters_Sessions_WebAPI.Models;
using Microsoft.AspNetCore.Cors;
using Microsoft.AspNetCore.Mvc;

// For more information on enabling Web API for empty projects, visit https://go.microsoft.com/fwlink/?LinkID=397860

namespace _11Demo_EF_Filters_Sessions_WebAPI.Controllers
{
    [EnableCors(PolicyName ="IET")]
    [Route("api/[controller]")]
    [ApiController]
    public class EmpsController : ControllerBase
    {
        private readonly IETDbContext _db;

        public EmpsController(IETDbContext db)
        {
            _db = db;
        }
        // GET: api/Emps
        [HttpGet]
        public IEnumerable<Emp> GetEmps()
        {
            return _db.emps.ToList();
        }

        // GET api/<EmpsController>/5
        [HttpGet("{id}")]
        public Emp Get(int id)
        {
            Emp emp = _db.emps.Find(id);
            return emp;
        }

        // POST api/<EmpsController>
        [HttpPost]
        public void Post([FromBody] Emp entity)
        {
            _db.emps.Add(entity);
            _db.SaveChanges();
        }

        // PUT api/<EmpsController>/5
        [HttpPut("{id}")]
        public void Put(int id, [FromBody] Emp entity)
        {
            Emp emp = _db.emps.Find(id);
            emp.Name = entity.Name;
            emp.Address = entity.Address;
            _db.SaveChanges();
        }

        // DELETE api/<EmpsController>/5
        [HttpDelete("{id}")]
        public void Delete(int id)
        {
            Emp emp = _db.emps.Find(id);
            _db.emps.Remove(emp);
            _db.SaveChanges();
        }
    }
}
