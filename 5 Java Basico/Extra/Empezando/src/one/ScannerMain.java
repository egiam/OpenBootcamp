package one;

import java.util.Scanner;

public class ScannerMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        int numero = scanner.nextInt();

        System.out.println("El numero introducido es: " + numero);

        System.out.println("Introduce un numero decimal: ");
        double numeroDecimal = scanner.nextDouble();

        System.out.println("El numero decimal introducido es: " + numeroDecimal);

        System.out.println("Introduce un texto: ");
        String texto = scanner.next();

        System.out.println("El texto introducido es: " + texto);

        scanner.close();

    }
}
