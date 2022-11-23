package one;

public class TiposDatos {
    public static void main(String[] args) {
        // Tipos de datos primitivos
        // byte, short, int, long, float, double, boolean, char
        // Tipos de datos no primitivos
        // String, Integer, Float, Double, Boolean, Character
        // Tipos de datos primitivos
        // byte
        byte byteVar = 127;
        System.out.println("byteVar = " + byteVar);
        System.out.println("Tipo byte corresponde en byte a " + Byte.BYTES);
        System.out.println("Tipo byte corresponde en bites a " + Byte.SIZE);
        System.out.println("Valor minimo de tipo byte " + Byte.MIN_VALUE);
        System.out.println("Valor maximo de tipo byte " + Byte.MAX_VALUE);
        // short
        short shortVar = 32767;
        System.out.println("shortVar = " + shortVar);
        System.out.println("Tipo short corresponde en byte a " + Short.BYTES);
        System.out.println("Tipo short corresponde en bites a " + Short.SIZE);
        System.out.println("Valor minimo de tipo short " + Short.MIN_VALUE);
        System.out.println("Valor maximo de tipo short " + Short.MAX_VALUE);
        // int
        int intVar = 2147483647;
        System.out.println("intVar = " + intVar);
        System.out.println("Tipo int corresponde en byte a " + Integer.BYTES);
        System.out.println("Tipo int corresponde en bites a " + Integer.SIZE);
        System.out.println("Valor minimo de tipo int " + Integer.MIN_VALUE);
        System.out.println("Valor maximo de tipo int " + Integer.MAX_VALUE);
        // long
        long longVar = 9223372036854775807L;
        System.out.println("longVar = " + longVar);
        System.out.println("Tipo long corresponde en byte a " + Long.BYTES);
        System.out.println("Tipo long corresponde en bites a " + Long.SIZE);
        System.out.println("Valor minimo de tipo long " + Long.MIN_VALUE);
        System.out.println("Valor maximo de tipo long " + Long.MAX_VALUE);
        // float
        float floatVar = 3.4028235E38F;
        System.out.println("floatVar = " + floatVar);
        System.out.println("Tipo float corresponde en byte a " + Float.BYTES);
        System.out.println("Tipo float corresponde en bites a " + Float.SIZE);
        System.out.println("Valor minimo de tipo float " + Float.MIN_VALUE);
        System.out.println("Valor maximo de tipo float " + Float.MAX_VALUE);
        // double
        double doubleVar = 1.7976931348623157E308;
        System.out.println("doubleVar = " + doubleVar);
        System.out.println("Tipo double corresponde en byte a " + Double.BYTES);
        System.out.println("Tipo double corresponde en bites a " + Double.SIZE);
        System.out.println("Valor minimo de tipo double " + Double.MIN_VALUE);
        System.out.println("Valor maximo de tipo double " + Double.MAX_VALUE);
        // boolean
        boolean booleanVar = true;
        System.out.println("booleanVar = " + booleanVar);
        // char
        char charVar = 'a';
        System.out.println("charVar = " + charVar);
        System.out.println("Tipo char corresponde en byte a " + Character.BYTES);
        System.out.println("Tipo char corresponde en bites a " + Character.SIZE);
        System.out.println("Valor minimo de tipo char " + (int)Character.MIN_VALUE);
        System.out.println("Valor maximo de tipo char " + (int)Character.MAX_VALUE);
        // Tipos de datos no primitivos
        // String
        String stringVar = "Hola";
        System.out.println("stringVar = " + stringVar);

    }
}
