using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace LinqSnippets
{
    public class Snippets
    {

        static public void BasicLinQ()
        {
            string[] cars =
            {
                "VW Golf",
                "VW California",
                "Audi A3",
                "Audi A5",
                "Fiat Punto",
                "Seat Ibiza",
                "Seat Leon"
            };

            //Select * from cars
            var carList = from car in cars select car;

            foreach (var car in carList)
            {
                Console.WriteLine(car);
            }

            //Select where
            var audiList = from car in cars where car.Contains("Audi") select car;

            foreach (var car in audiList)
            {
                Console.WriteLine(car);
            }
        }

        static public void LinqNumbers()
        {
            List<int> numbers = new List<int> { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

            var processedNumberList = numbers
                .Select(num => num * 3) //Multiplica x 3
                .Where(num => num != 9) //Todos menos el nueve
                .OrderBy(num => num); //Ordena ascendiente          

        }

        static public void SearchExamples()
        {
            List<string> textList = new List<string>
            {
                "a",
                "bx",
                "c",
                "d",
                "e",
                "f",
                "g",
                "h",
                "i",
            };

            var first = textList.First();

            var firstC = textList.First(text => text.Equals("c"));

            var firstJ = textList.First(text => text.Contains("j"));

            var firstDefaultText = textList.FirstOrDefault(text => text.Contains("z")); //O lista vacia o valor con "z"

            var lastDefaultText = textList.LastOrDefault(text => text.Contains("z"));

            var uniqueElement = textList.Single();//Solo un valor
            var uniqueDefaultElement = textList.SingleOrDefault();

            int[] evenNumbers = { 0, 2, 4, 6, 8 };
            int[] otherEvenNumbers = { 0, 2, 6 };

            //Los que no se repiten
            var myEvenNumbers = evenNumbers.Except(otherEvenNumbers);

        }

        static public void MultipleSelects()
        {
            string[] myOpinions =
            {
                "Opinion 1, text1",
                "Opinion 2, text2",
                "Opinion 3, text3",
                "Opinion 4, text4"
            };

            //Separado x comas
            var myOpinionSelection = myOpinions.SelectMany(opinion => opinion.Split(","));

            var enterprises = new[]
            {
                new Enterprise()
                {
                    Id = 1,
                    Name = "Enterprise 1",
                    Employees = new []
                    {
                        new Employee
                        {
                            Id = 1,
                            Name = "Martin",
                            Email = "martin@gmail.com",
                            Salary = 3000
                        },

                        new Employee
                        {
                            Id = 2,
                            Name = "Pepe",
                            Email = "pepe@gmail.com",
                            Salary = 1000
                        },

                        new Employee
                        {
                            Id = 3,
                            Name = "Juanjo",
                            Email = "juanjo@gmail.com",
                            Salary = 2000
                        }
                    }
                },

                new Enterprise()
                {
                    Id = 2,
                    Name = "Enterprise 2",
                    Employees = new []
                    {
                        new Employee
                        {
                            Id = 4,
                            Name = "Ana",
                            Email = "ana@gmail.com",
                            Salary = 3000
                        },

                        new Employee
                        {
                            Id = 5,
                            Name = "Maria",
                            Email = "maria@gmail.com",
                            Salary = 1500
                        },

                        new Employee
                        {
                            Id = 6,
                            Name = "Marta",
                            Email = "marta@gmail.com",
                            Salary = 4000
                        }
                    }
                }
            };

            //Objetener todos los empleados de todas las empresas
            var employeeList = enterprises.SelectMany(enterprise => enterprise.Employees);

            //Saber si es vacia
            bool hasEnterprises = enterprises.Any();

            //Que tenga empleados
            bool hasEmployees = enterprises.Any(enterprise => enterprise.Employees.Any());

            //Ganen mas de 1000
            bool hasEmployeesWithSalaryMoreThan1000 = enterprises.Any(enterprise => enterprise.Employees.Any(employee => employee.Salary >= 1000));
        }

        static public void LinqCollections()
        {
            var firstList = new List<string>() { "a", "b", "c" };
            var secondList = new List<string>() { "a", "c", "d" };

            var commonResult = from element in firstList
                             join secondElement in secondList
                             on element equals secondElement
                             select new { element, secondElement };

            var commonResult2 = firstList.Join(
                    secondList,
                    element => element,
                    secondElement => secondElement,
                    (element, secondElement) => new { element, secondElement }
                );

            //Video: -18:20
        }
    }
}