public class Main {
    public static void main(String[] args) {
//        Coche coche = new Coche();
//        coche.Acelerar(50);
//
//        var resultado = suma (2, 5);
//        System.out.println (resultado);
//    }
//    public static int suma(int operandoA, int operandoB) {
//        return operandoA + operandoB;
//    }

        Coche coche = new Coche();
        EjecutarAcelerar(coche);
        Moto moto = new Moto();
        EjecutarAcelerar(moto);
    }

    public static int factorial(int numero) {
        int resultado;
        if (numero == 1) {
            return 1;
        }
        resultado = factorial(numero - 1) * numero;
        return resultado;
    }

    public static int factorialNR(int numero) {
        int temp;
        int resultado = 1;
        for (temp = 1; temp <= numero; temp++) {
            resultado = resultado * temp;
        }
        return resultado;
    }

    public static void cocheChanger (Coche coche) {
        coche.velocidad += coche.velocidad + 50;
    }

    public static void EjecutarAcelerar(Vehiculo vehiculo){
        vehiculo.Acelerar(15);
    }

    public static void EjecutarFrenar(Vehiculo vehiculo){
        vehiculo.Frenar(15);
    }

}

interface Vehiculo {
    void Acelerar(int cuantaVelocidad);

    void Frenar(int cuantaVelocidad);
}

class Coche implements Vehiculo {
    int velocidad = 0;
    public void Acelerar(int cuantaVelocidad) {
        System.out.println ("Acelerar");
    }

    public void Frenar(int cuantaVelocidad) {
        System.out.println ("Frenar");
    }
}

class Moto implements  Vehiculo{
    public void Acelerar(int cuantaVelocidad) {
        System.out.println ("Acelerar");
    }

    public void Frenar(int cuantaVelocidad) {
        System.out.println ("Frenar");
    }
}

class Colectivo implements Vehiculo {
    public void Acelerar(int cuantaVelocidad) {
        System.out.println ("Acelerar");
    }

    public void Frenar(int cuantaVelocidad) {
        System.out.println ("Frenar");
    }
}
