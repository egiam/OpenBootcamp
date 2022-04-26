public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.acelerar();
        coche.decelerar();

        Coche coche2 = new Coche(2,90);
        coche.acelerar();
//        int suma = 0;
//
//        suma += 15;
//
//        System.out.println(suma);
//
//        int valores[] = new int[5];
//        int posicion = 5;
//        System.out.println(valores[posicion]);
    }
}

class Coche {
    int numeroDePuertas;
    int velocidadMaxima;
    float velocidadActual;

    //constructores
    public Coche(){
        numeroDePuertas = 5;
        velocidadMaxima = 120;
    }

    public Coche(int puertas, int velocidad){
        numeroDePuertas = puertas;
        velocidadMaxima = velocidad;
    }

    public void acelerar() {
        velocidadActual += 15;
    }

    public void decelerar() {
        velocidadActual -= 15;
    }
}