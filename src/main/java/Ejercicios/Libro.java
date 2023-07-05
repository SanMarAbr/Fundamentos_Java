package Ejercicios;

import java.util.Scanner; //Libreria scanner

public class Libro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Declaracion de scanner

        System.out.println("Proporciona el titulo");
        String titulo = scanner.nextLine(); //Declaracion de variable string + scanner
        System.out.println("Proporciona el autor");
        String autor = scanner.nextLine(); //Declaracion de cariable string + scanner

        System.out.println(autor);
        System.out.println(titulo);

        System.out.println(titulo + " Este libro fue escrito por: " + autor);
        scanner.close();
    }
}
