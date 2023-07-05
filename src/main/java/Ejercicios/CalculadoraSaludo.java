package Ejercicios;

import java.util.Scanner;

public class CalculadoraSaludo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los valores de x: ");
        int x = scanner.nextInt();

        System.out.println("Ingrese los valores de y: ");
        int y = scanner.nextInt();

        scanner.nextLine(); // Esto pasa de linea de una variable entera a una variable de texto.
        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        
        int suma = x + y;
        int rest = x - y;
        int mult = x * y;
        double div  = (double) x / y; //(double) para la conversión de variables de int a double
        
        
        String resultados = ("Resultado suma = "+suma+" Resultado resta = "+rest+" Resultado Multiplicación = "+mult+" Resultado División = "+div);
        String presentacion = ("Hola: " +nombre+ " ,estos son los resultados de las operaciones");
        
        System.out.println(presentacion);
        System.out.println(resultados);

        scanner.close();

    }
}
