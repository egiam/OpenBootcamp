public class Main {
    public static void main(String[] args) {
        //IF
        int numeroif = 1;
        if (numeroif > 0){
            System.out.println("numeroif Es positivo");
        } else if (numeroif < 0){
            System.out.println("numeroif Es negativo");
        } else {
            System.out.println("numeroif Es cero");
        }

        //While
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        //Do While
        do {
            numeroWhile++;
            System.out.println(numeroWhile);
        } while (0 < 0);

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }

        //Switch
        String estacion = "verano";
        switch (estacion.toLowerCase()) {
            case "verano":
                System.out.println("Es verano");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            case "otoño":
                System.out.println("Es otoño");
                break;
            case "primavera":
                System.out.println("Es primavera");
                break;
            default:
                System.out.println("No es una estacion");
                break;
        }
    }
}