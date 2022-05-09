using System.ComponentModel.DataAnnotations;

namespace UniversityApiBackend.Models.DataModels
{
    public class BaseEntity
    {
        [Required]
        [Key]
        
        public int Id { get; set; }
        public string CreatedBy { get; set; } = String.Empty;
        public DateTime CreatedAt { get; set; } = DateTime.Now;
        public string UpdatedBy { get; set; } = String.Empty;
        public DateTime? UpdatedAt { get; set; }
        public string DeletedBy { get; set; } = String.Empty;
        public DateTime? DeletedAt { get; set; }
        public bool IsDeleted { get; set; } = false;


        //public int Id { get; set; }
        //public int UserID { get; set; }
        //public virtual User CreatedBy { get; set; } = new User();
        //public DateTime CreatedAt { get; set; } = DateTime.Now;
        //public User UpdatedBy { get; set; } = new User();
        //public DateTime? UpdatedAt { get; set; }
        //public User DeletedBy { get; set; } = new User();
        //public DateTime? DeletedAt { get; set; }
        //public bool IsDeleted { get; set; } = false;

    }
}
