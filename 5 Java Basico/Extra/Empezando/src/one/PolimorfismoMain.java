package one;

public class PolimorfismoMain {

    public static void main(String[] args) {
        Coche coche = new Coche("Rojo", "Fiat", "Uno", 1000.0, 4.0);
        Coche cocheElectrico = new CocheElectrico("Rojo", "Tesla", "Model S", 2000.0, 5.0, "Tesla");
        Coche cocheHibrido = new CocheHibrido("Rojo", "Toyota", "Prius", 1500.0, 4.5, "Toyota", "Gasolina");
        System.out.println(coche);
        System.out.println(cocheElectrico);
        System.out.println(cocheHibrido);
        coche.acelerar(100);
        cocheElectrico.acelerar(100);
        cocheHibrido.acelerar(100);
        System.out.println(coche);
        System.out.println(cocheElectrico);
        System.out.println(cocheHibrido);
    }

}
