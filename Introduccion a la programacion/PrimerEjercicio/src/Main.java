public class Main {
    public static void main(String[] args) {
        suma(2,5,6);
        System.out.println(suma(12,12,12));

        var coche = new Coche();
        coche.incPuerta(1);
    }

    public static int suma(int num1, int num2, int num3){
        return num1  + num2 + num3;
    }
}

class Coche {
    public int numPuertas;

    public void incPuerta(int numero) {
        numPuertas += numero;
        System.out.println("El coche tiene " + numPuertas + " puertas.");
    }
}