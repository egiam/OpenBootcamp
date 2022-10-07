# En este segundo ejercicios tendréis que crear un script que nos diga si es la hora de ir a casa. Tendréis que hacer uso del modulo time. Necesitaréis la fecha del sistema y poder comprobar la hora.

# En el caso de que sean más de las 7, se mostrará un mensaje y en caso contrario, haréis una operación para calcular el tiempo que queda de trabajo.

import time

class Time:

    def __init__(self):
        self.fecha = time.localtime()

    def get_time(self):
        return self.fecha

    def get_hour(self):
        return self.fecha.tm_hour

    def get_minutes(self):
        return self.fecha.tm_min

    def get_seconds(self):
        return self.fecha.tm_sec

    def get_day(self):
        return self.fecha.tm_mday

    def get_month(self):
        return self.fecha.tm_mon

    def get_year(self):
        return self.fecha.tm_year

def main(valor):
    if valor.get_hour() > 19:
        print("Es hora de ir a casa")
    else:
        print(f"Tienes que trabajar {(19 - valor.get_hour()) * 60 - valor.get_minutes()} minutos mas.")

tiempo1 = Time()
main(tiempo1)
