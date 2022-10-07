
class Alumno:
    def __init__(self, nombre, apellido, dni, nota):
        self.nombre = nombre
        self.apellido = apellido
        self.dni = dni
        self.nota = nota

    def __str__(self):
        return f"{self.nombre} {self.apellido} - DNI: {self.dni} - Nota: {self.nota}"

    def Aprobado(self):
        if self.nota >= 6:
            return "El alumno a Aprobado"
        else:
            return "El alumno a Reprobado"

alumno1 = Alumno("Juan", "Perez", "12345678", 7)
print(alumno1)
print(alumno1.Aprobado())

print("\n---------------------------------\n")

alumno2 = Alumno("Pedro", "Gonzalez", "87654321", 5)
print(alumno2)
print(alumno2.Aprobado())
