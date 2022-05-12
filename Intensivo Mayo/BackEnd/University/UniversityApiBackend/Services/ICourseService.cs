using UniversityApiBackend.Models.DataModels;

namespace UniversityApiBackend.Services
{
    public interface ICourseService
    {
        IEnumerable<Course> GetByCategory();
        IEnumerable<Course> GetWithoutTemary();
        IEnumerable<Course> GetTemaryOfCourse();
        IEnumerable<Course> GetStudentOfCourse();
    }
}
