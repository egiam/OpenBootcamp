package Three;

public class EstructurasDeControl {
    public static void main(String[] args) {

        // Condicionales

        int edad = 18;
        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

        int numero = 5;
        if (numero == 1) {
            System.out.println("El numero es 1");
        } else if (numero == 2) {
            System.out.println("El numero es 2");
        } else if (numero == 3) {
            System.out.println("El numero es 3");
        } else if (numero == 4) {
            System.out.println("El numero es 4");
        } else if (numero == 5) {
            System.out.println("El numero es 5");
        } else {
            System.out.println("El numero no es 1, 2, 3, 4 o 5");
        }

        switch (numero) {
            case 1:
                System.out.println("El numero es 1");
                break;
            case 2:
                System.out.println("El numero es 2");
                break;
            case 3:
                System.out.println("El numero es 3");
                break;
            case 4:
                System.out.println("El numero es 4");
                break;
            case 5:
                System.out.println("El numero es 5");
                break;
            default:
                System.out.println("El numero no es 1, 2, 3, 4 o 5");
                break;
        }

        // Repetitivas

        int contador = 0;
        while (contador < 10) {
            System.out.println("El contador es " + contador);
            contador++;
        }

        contador = 0;
        do {
            System.out.println("El contador es " + contador);
            contador++;
        } while (contador < 10);

        for (int i = 0; i < 10; i++) {
            System.out.println("El contador es " + i);
        }

        String[] nombres = {"Juan", "Pedro", "Maria", "Jose"};
        for (String nombre : nombres) {
            System.out.println("El nombre es " + nombre);
        }

        for (int i = 0; i < nombres.length; i++) {
            System.out.println("El nombre es " + nombres[i]);
        }

        String[] names = {"Juan", "Pedro", "Maria", "Jose"};
        for (String nombre : names) {
            if (nombre.equals("Pedro")) {
                continue;
            }
            System.out.println("El nombre es " + nombre);
        }
    }

}
