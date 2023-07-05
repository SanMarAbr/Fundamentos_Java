package OperadoresJava;

public class OperadoresIgualdadRelacionales {

    public static void main(String[] args) {
        //Objeto primitivo
        int a = 3, b = 2;

        boolean c = (a == b);// Solo se ocupa con tipos primitivos
        System.out.println("Es igual ? " + c);

        c = (a != b);
        System.out.println("Es diferente ? = " + c);

        //Objeto Objects
        String cadena = "Hola";
        String cadena2 = "Adios";
        System.out.println(cadena.equals(cadena2));

        boolean d = (a <= b);
        System.out.println("D = " + d);

        //Estructura If
        if (b % 2 == 0) {
            System.out.println("Es par");

        } else {
            System.out.println("Es impar");
        }
        
        int edad = 8;
        int adulto = 18;
        
        if (edad >= adulto ) {
            System.out.println("Es adulto");
            
        }else{
            System.out.println("Menor de edad");
        }

    }
}
