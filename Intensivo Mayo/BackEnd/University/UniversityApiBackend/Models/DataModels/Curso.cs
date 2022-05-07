using System.ComponentModel.DataAnnotations;

namespace UniversityApiBackend.Models.DataModels
{
    public class Curso
    {
        [Required, StringLength(50)]
        public string Name { get; set; } = string.Empty;
        [StringLength(280)]
        public string ShrotDescription { get; set; } = string.Empty;
        public string LongDescription { get; set; } = string.Empty;
        public string PublicObjective { get; set; } = string.Empty;
        public string Objectives { get; set; } = string.Empty;
        public string Requirments { get; set; } = string.Empty;
        enum Levels
        {
            Basico,
            Intermedio,
            Avanzado
        }
    }
}
