using UniversityApiBackend.Models.DataModels;

namespace UniversityApiBackend.Services
{
    public interface IStudentService
    {
        IEnumerable<Studient> GetStudentsWithCourses();
        IEnumerable<Studient> GetStudentsWithNoCourses();
        IEnumerable<Studient> GetCoursesOfStudent();
    }
}
