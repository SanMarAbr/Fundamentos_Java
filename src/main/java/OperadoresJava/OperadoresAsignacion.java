//Operadores de asignacion
package OperadoresJava;

public class OperadoresAsignacion {

    public static void main(String[] args) {

        float a = 3, b = 2;

        float c = a + 5 - b;
        System.out.println("c = " + c);

        //Composición
        a += 1; //a = a + 1
        System.out.println("a = " + a);

        a += 3; // a = a +3
        System.out.println("a  = " + a);
        // Resta 
        b -= 1; //b = b -1
        System.out.println("b = " + b);
        // *=; /=; %=

        // Multiplicación
        a *= 2;
        System.out.println("a = " + a);
        b *= 1;
        System.out.println("b = " + b);

        //División
        a /= 1;
        System.out.println("a = " + a);
        b /= 2;
        System.out.println("b = " + b);

        //Modulo
        a %= 1;
        System.out.println("a = " + a);
        b %= 2;
        System.out.println("b = " + b);

    }
}
