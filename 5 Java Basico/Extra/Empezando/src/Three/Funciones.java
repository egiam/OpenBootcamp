package Three;

public class Funciones {
    public static void main(String[] args) {

//        Opcion 1
        showMenu();

//        Opcion 2
        imprimirSaludoBuenosDias("OpenBootCamp");

    }

    private static void imprimirSaludoBuenosDias(String openBootCamp) {
        System.out.println("Buenos dias " + openBootCamp);
    }

    static void showMenu(){
        System.out.println("Bienvenidos a este Ecommerce de zapatillas");
        System.out.println("1 - Ver zapatillas");
        System.out.println("2 - Comprar zapatillas");
        System.out.println("3 - Salir");
    }

    static String getMenu(){
        return "Bienvenidos a este Ecommerce de zapatillas";
    }
}
