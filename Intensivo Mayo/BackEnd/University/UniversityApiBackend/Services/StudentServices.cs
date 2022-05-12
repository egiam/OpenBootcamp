using UniversityApiBackend.Models.DataModels;

namespace UniversityApiBackend.Services
{
    public class StudentServices : IStudentService
    {
        public IEnumerable<Studient> GetCoursesOfStudent()
        {
            //Obtener los Cursos de un Alumno
            var students = new List<Studient>();
            Console.WriteLine("Coloque el alumno a buscar");
            string? alumno = Console.ReadLine();

            var getCoursesOfStudent = from s in students
                                      where s.Name == alumno && s.Courses.Any()
                                      select s.Courses;

            throw new NotImplementedException();
        }

        //TODO
        public IEnumerable<Studient> GetStudentsWithCourses()
        {
            throw new NotImplementedException();
        }

        public IEnumerable<Studient> GetStudentsWithNoCourses()
        {
            //Obtener todos los alumnos que no tienen cursos asociados
            var students = new List<Studient>();

            var getStudentsWithNoCourses = from s in students
                                           where !s.Courses.Any()
                                           select s;

            throw new NotImplementedException();
        }
    }
}
