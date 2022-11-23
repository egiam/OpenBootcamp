package one;

public class Operadores {
    public static void main(String[] args) {
        // Operadores aritmeticos
        // +, -, *, /, %
        int a = 3;
        int b = 2;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        // Operadores de asignacion
        // =, +=, -=, *=, /=, %=
        int c = 1;
        c += 3;
        System.out.println("c = " + c);
        c -= 2;
        System.out.println("c = " + c);
        c *= 3;
        System.out.println("c = " + c);
        c /= 2;
        System.out.println("c = " + c);
        c %= 2;
        System.out.println("c = " + c);
        // Operadores de incremento y decremento
        // ++, --
        int d = 3;
        d++;
        System.out.println("d = " + d);
        d--;
        System.out.println("d = " + d);
        // Operadores relacionales
        // ==, !=, >, <, >=, <=
        int e = 3;
        int f = 2;
        System.out.println("e == f = " + (e == f));
        System.out.println("e != f = " + (e != f));
        System.out.println("e > f = " + (e > f));
        System.out.println("e < f = " + (e < f));
        System.out.println("e >= f = " + (e >= f));
        System.out.println("e <= f = " + (e <= f));
        // Operadores logicos
        // &&, ||, !
        boolean g = true;
        boolean h = false;
        System.out.println("g && h = " + (g && h));
        System.out.println("g || h = " + (g || h));
        System.out.println("!g = " + !g);
        System.out.println("!h = " + !h);
        // Operadores de bits
        // &, |, ^, ~, <<, >>
        int i = 5;
        int j = 1;
        System.out.println("i & j = " + (i & j));
        System.out.println("i | j = " + (i | j));
        System.out.println("i ^ j = " + (i ^ j));
        System.out.println("~i = " + ~i);
        System.out.println("i << 1 = " + (i << 1));
        System.out.println("i >> 1 = " + (i >> 1));
        // Operadores ternarios
        // ?:
        int k = 4;
        int l = 2;
        int m = (k > l) ? k : l;
        System.out.println("m = " + m);
    }
}
