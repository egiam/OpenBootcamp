public class Main {
    public static void main(String[] args) {
        int numeros[][] = {
                {10,20,30,40,50},
                {10,20,30,40,50}
        };

        for (int i = 0; i < numeros.length; i++){
            for (int j = 0; j < numeros[j].length; j++){
                //Imprime el valor de [i,j]
                System.out.println(numeros[j]);
            }
        }

        int numbers[] = {10,20,30,40,50};
        //Parecido a un foreach. Asigna a la variable un numero, y ese numero es luego utilizado para el array.
        for (int i : numbers) {
            System.out.println(numbers[i]);
        }
    }
}