package OperadoresJava;

//import java.util.Scanner;

public class Operadores {

    public static void main(String[] args) {

        int l = 3, s = 2;
        //Suma
        int resultado = l + s;
        System.out.println("Resultado = " + resultado);

        System.out.println("Resultado = " + (l + s));

        //Resta
        resultado = l - s;
        System.out.println("Resultado de la resta = " + resultado);

        System.out.println("Resultado de la resta = " + (l - s));

        //Multiplicacion
        resultado = l * s;
        System.out.println("Resultado de la multiplicación = " + resultado);

        //Division
        var resultado2 = 3F / s;
        System.out.println("Resultado de la division = " + resultado2);

        //Modulo
        var resultado3 = 3F % s;
        System.out.println("Resultado de modulo = " + resultado3);
        
        resultado = l % 2;
        System.out.println("Es par o impar ? = "+ resultado );
        
        resultado = 123 % 2;
        System.out.println("Es par o impar ? = "+resultado);
        
        if (resultado == 0) {
            
            System.out.println("Es numero par");   
        }else{
            System.out.println("Es numero impar");
        }
        
    }
}
