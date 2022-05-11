namespace UniversityApiBackend.Models.DataModels
{
    public class Services
    {
        static public void UsersByEmail()
        {
            var users = new[]
            {
                new User {
                    Name = "Hola",
                    LastName = "Manuel",
                    Email = "hola@gmail.com",
                    Password = "hola1234"
                },

                new User {
                    Name = "Chau",
                    LastName = "Manuel",
                    Email = "chau@gmail.com",
                    Password = "chau1234"
                }
            };

            Console.WriteLine("Coloque el Email del usuario a buscar: ");
            string? emailBuscar = Console.ReadLine();

            var userByEmail = users.Any(user => user.Email == emailBuscar);
        }

        static public void StudientsPastAge()
        {
            var studients = new[]
            {
                new Studient
                {
                    Name = "Juan",
                    LastName="Rodolfo",
                    Dob = Convert.ToDateTime("1/2/2002"),
                    Courses = new[]
                    {
                        new Course
                        {
                            Name = "Mats",
                            ShrotDescription = "A course of mats and all of that",
                            Description = "Things",
                            Level = Level.Basic,

                        }
                    }
                }
            };

            var courses = new[]
            {
                new Course {
                    Name = "Advanced Mats",
                    ShrotDescription = "A course of mats and all of that",
                    Description = "Things",
                    Level = Level.Advanced
                }

            };

            var studientMayor = studients.Any(studient => studient.Dob.Year <= (DateTime.Now.Year - 18) && studient.Dob.Month <= DateTime.Now.Month);
            var studientAtLeastOneCourse = studients.Any(studient => studient.Courses.Any());

            var courseAtLeastOneStudient = courses
                .Where(course => course.Studients != null && course.Level > Level.Basic);

            Console.WriteLine("Diga la categoria a buscar.");
            string? category = Console.ReadLine();
            var courseByCategory = courses
                .Where(course => course.Categories.Any(categor => categor.Name == category) && course.Level > Level.Basic);

            var courseWithoutStudient = courses
                .Where(course => course.Studients.Any(studient => studient == null));
        }
    }
}
