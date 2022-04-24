public class Main {
    public static void main(String[] args) {
        String estacion = "verano";

        if (estacion == "primavera"){
            System.out.println("Es primavera");
        } else if (estacion == "verano") {
            System.out.println("Es verano");
        } else {
            System.out.println("Es otra estacion");
        }

        int contador = 10;

        while (contador > 0){
            System.out.println(contador);
            contador--;
        }

        contador = 10;

        do {
            System.out.println(contador);
            contador--;
        } while (contador > 0);

        for (int conta = 1; conta <= 10; conta++){
            System.out.println(conta);
        }

        int temperatura = 14;

        for (;temperatura!=15;){
            System.out.println(temperatura);
        }

        int valores[] = {10,20,30,40,50};

        for (int i = 0; i <= valores.length; i++){
            System.out.println(valores[i]);
        }

        for (int i = 0 : valores){

        }

        for (;;){
            System.out.println("a");
        }

        switch (estacion.toUpperCase()){
            case "VERANO":
                System.out.println("Es " + estacion.toLowerCase());
                break;
            case "INVIERNO":
                System.out.println("Es " + estacion.toLowerCase() + ". Mi favorita :D");
                break;
            default:
                System.out.println("Es " + estacion.toLowerCase());
                break;
        }
    }
}