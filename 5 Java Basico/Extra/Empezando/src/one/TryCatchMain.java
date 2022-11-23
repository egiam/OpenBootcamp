package one;

public class TryCatchMain {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int index = 0;
        try {
            while (true) {
                System.out.println(array[index]);
                index++;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Se ha producido un error: " + e.getMessage());
        } finally {
            System.out.println("Esto se ejecuta siempre");
        }
    }
}
