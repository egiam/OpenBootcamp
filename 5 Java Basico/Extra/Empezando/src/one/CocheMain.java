package one;

public class CocheMain {

    public static void main(String[] args){
//        Coche coche1 = new Coche("Rojo", "Honda", "Civic", 1430.0, 5.4);
//        Coche coche2 = new Coche("Azul", "Ferrari", "F40", 1000.0, 4.0);
//
//        coche1.acelerar(50);
//        coche2.acelerar(120);
//
//        System.out.println(coche1);
//        System.out.println(coche2);

        //Coche electrico
        CocheElectrico cocheElectrico = new CocheElectrico();
        cocheElectrico.color = "Verde";
        cocheElectrico.fabricante = "Tesla";
        cocheElectrico.modelo = "Model S";
        cocheElectrico.peso = 2000.0;
        cocheElectrico.largo = 5.0;
        cocheElectrico.motorElectrico = "Tesla";

        System.out.println(cocheElectrico);

        CocheElectrico cocheElectrico2 = new CocheElectrico("Verde", "Tesla", "Model S", 2000.0, 5.0, "Tesla");
        System.out.println(cocheElectrico2);
        cocheElectrico2.acelerar(120);
        System.out.println(cocheElectrico2);
    }
}
