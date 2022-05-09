using System.ComponentModel.DataAnnotations;

namespace UniversityApiBackend.Models.DataModels
{
    public enum Level
    {
        Basic,
        Medium,
        Advanced,
        Expert
    }

    public class Course: BaseEntity
    {
        [Required, StringLength(50)]
        public string Name { get; set; } = string.Empty;
        [Required, StringLength(280)]
        public string ShrotDescription { get; set; } = string.Empty;
        [Required]
        public string Description { get; set; } = string.Empty;
        //public string PublicObjective { get; set; } = string.Empty;
        //public string Objectives { get; set; } = string.Empty;
        //public string Requirments { get; set; } = string.Empty;
        [Required]
        public Level Level { get; set; } = Level.Basic;

        [Required]
        public ICollection<Category> Categories { get; set; } = new List<Category>();
        //Relacion q indica q un curso puede tener varias categorias

        [Required]
        public ICollection<Studient> Studients { get; set; } = new List<Studient>();
        //Relacion q indica q un curso puede tener varios Usuarios
        
        [Required]
        public Chapter Chapter { get; set; } = new Chapter();
        //Relacion q indica q un curso puede tener varios Usuarios
    }
}
