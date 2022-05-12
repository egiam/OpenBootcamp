#nullable disable
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;
using UniversityApiBackend.DataAccess;
using UniversityApiBackend.Models.DataModels;
using UniversityApiBackend.Services;

namespace UniversityApiBackend.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class StudientsController : ControllerBase
    {
        private readonly UniversityDBContext _context;
        //Service
        private readonly IStudentService _studentService;//

        public StudientsController(UniversityDBContext context, IStudentService studentService)
        {
            _context = context;
            _studentService = studentService;//
        }

        // GET: api/Studients
        [HttpGet]
        public async Task<ActionResult<IEnumerable<Studient>>> GetStudients()
        {
            return await _context.Studients.ToListAsync();
        }

        // GET: api/Studients/5
        [HttpGet("{id}")]
        public async Task<ActionResult<Studient>> GetStudient(int id)
        {
            var studient = await _context.Studients.FindAsync(id);

            if (studient == null)
            {
                return NotFound();
            }

            return studient;
        }

        // PUT: api/Studients/5
        // To protect from overposting attacks, see https://go.microsoft.com/fwlink/?linkid=2123754
        [HttpPut("{id}")]
        public async Task<IActionResult> PutStudient(int id, Studient studient)
        {
            if (id != studient.Id)
            {
                return BadRequest();
            }

            _context.Entry(studient).State = EntityState.Modified;

            try
            {
                await _context.SaveChangesAsync();
            }
            catch (DbUpdateConcurrencyException)
            {
                if (!StudientExists(id))
                {
                    return NotFound();
                }
                else
                {
                    throw;
                }
            }

            return NoContent();
        }

        // POST: api/Studients
        // To protect from overposting attacks, see https://go.microsoft.com/fwlink/?linkid=2123754
        [HttpPost]
        public async Task<ActionResult<Studient>> PostStudient(Studient studient)
        {
            _context.Studients.Add(studient);
            await _context.SaveChangesAsync();

            return CreatedAtAction("GetStudient", new { id = studient.Id }, studient);
        }

        // DELETE: api/Studients/5
        [HttpDelete("{id}")]
        public async Task<IActionResult> DeleteStudient(int id)
        {
            var studient = await _context.Studients.FindAsync(id);
            if (studient == null)
            {
                return NotFound();
            }

            _context.Studients.Remove(studient);
            await _context.SaveChangesAsync();

            return NoContent();
        }

        private bool StudientExists(int id)
        {
            return _context.Studients.Any(e => e.Id == id);
        }
    }
}
