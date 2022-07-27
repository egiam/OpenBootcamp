
class Vehiculo:

    def __init__(self, marca, modelo, color, ruedas, puertas):
        self.marca = marca
        self.modelo = modelo
        self.color = color
        self.ruedas = ruedas
        self.puertas = puertas
    
    def __str__(self):
        return "Marca: {}\nModelo: {}\nColor: {}\nRuedas: {}\nPuertas: {}".format(self.marca, self.modelo, self.color, self.ruedas, self.puertas)


class Coche(Vehiculo):

    def __init__(self, marca, modelo, color, ruedas, puertas, velocidad, cilindrada):
        super().__init__(marca, modelo, color, ruedas, puertas)
        self.velocidad = velocidad
        self.cilindrada = cilindrada

    def __str__(self):
        return super().__str__() + "\nVelocidad: {}\nCilindrada: {}".format(self.velocidad, self.cilindrada)

coche1 = Coche("Seat", "Ibiza", "Rojo", 4, 5, "120km/h", "1.0")
print(coche1)

coche2 = Coche("Fiat", "Punto", "Azul", 4, 3, "110km/h", "1.2")
print(coche2)
