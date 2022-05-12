using UniversityApiBackend.Models.DataModels;

namespace UniversityApiBackend.Services
{
    public class CourseServices : ICourseService
    {
        public IEnumerable<Course> GetByCategory()
        {
            //Obtener todos los Cursos de una categoría concreta
            var cursos = new List<Course>();
            Console.WriteLine("Coloque la categoria a buscar");
            string? categoria = Console.ReadLine();

            var certainCategory = from c in cursos
                                  where c.Categories.Any(name => name.Name == categoria)
                                  select c;

            throw new NotImplementedException();
        }

        public IEnumerable<Course> GetStudentOfCourse()
        {
            //Obtener alumnos de un Curso concreto
            var cursos = new List<Course>();
            Console.WriteLine("Coloque el curso a buscar");
            string? categoria = Console.ReadLine();

            var studentOfCourse = from c in cursos
                                  where c.Name == categoria && c.Studients.Any()
                                  select c.Studients;

            throw new NotImplementedException();
        }

        public IEnumerable<Course> GetTemaryOfCourse()
        {
            //Obtener temario de un curso concreto
            var cursos = new List<Course>();
            Console.WriteLine("Coloque el curso a buscar");
            string? categoria = Console.ReadLine();

            var temaryOfCourse = from c in cursos
                                 where c.Name == categoria && c.Temary.Any()
                                 select c.Temary;

            throw new NotImplementedException();
        }

        public IEnumerable<Course> GetWithoutTemary()
        {
            //Obtener Cursos sin temarios
            var cursos = new List<Course>();

            var temaryOfCourse = from c in cursos
                                 where !c.Temary.Any()
                                 select c;

            throw new NotImplementedException();
        }
    }
}
