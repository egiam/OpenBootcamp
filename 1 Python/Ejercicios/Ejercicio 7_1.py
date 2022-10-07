# En este ejercicio tendréis que crear un módulo que contenga las operaciones básicas de una calculadora: sumar, restar, multiplicar y dividir.

# Este módulo lo importaréis a un archivo python y llamaréis a las funciones creadas. Los resultados tenéis que mostrarlos por consola.

class Calculadora:

    def sumar(self, num1, num2):
        return num1 + num2

    def restar(self, num1, num2):
        return num1 - num2

    def multiplicar(self, num1, num2):
        return num1 * num2

    def dividir(self, num1, num2):
        return num1 / num2

operacion1 = Calculadora()
print(operacion1.sumar(10, 20))
print(operacion1.restar(10, 20))
print(operacion1.multiplicar(10, 20))
print(operacion1.dividir(10, 20))

operacion2 = Calculadora()
print(operacion2.sumar(20, 50))
print(operacion2.restar(20, 50))
print(operacion2.multiplicar(20, 50))
print(operacion2.dividir(20, 50))
