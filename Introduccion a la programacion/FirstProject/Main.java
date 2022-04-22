public class Main {

    public static void  main(String[] args){
        int resultado = 0;
        resultado = suma( 4, 2);
        System.out.println(resultado)
        sumaDif(10,30);
    }

    public static int suma(int a, int b){
        var resultado = a + b;
        return a + b;
    }

    public static void sumaDif(int a, int b){
        int resultado;
        resultado = a + b;
        System.out.println(resultado);
    }

}

class Potato {
    public int brazos = 0;

    public void QuitarBrazo() {
        this.brazos--;
    }
}
