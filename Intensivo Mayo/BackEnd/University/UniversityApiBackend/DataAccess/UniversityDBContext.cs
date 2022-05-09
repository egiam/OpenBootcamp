﻿using Microsoft.EntityFrameworkCore;
using UniversityApiBackend.Models.DataModels;

namespace UniversityApiBackend.DataAccess
{
    public class UniversityDBContext: DbContext
    {
        public UniversityDBContext(DbContextOptions<UniversityDBContext> options) : base(options) { }

    // Add DbSets (Tables of DB)
    public DbSet<User>? Users { get; set; }
    public DbSet<Course>? Courses { get; set; }
    public DbSet<Category>? Categories { get; set; }
    public DbSet<Studient>? Studients { get; set; }
    public DbSet<Chapter>? Chapters { get; set; }
    }
}
