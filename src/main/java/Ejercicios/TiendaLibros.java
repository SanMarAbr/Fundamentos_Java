package Ejercicios;

import java.util.Scanner;

public class TiendaLibros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del libro");
        String nLibro = scanner.nextLine();

        System.out.println("Ingrese el ID del libro");
        int idLibro = Integer.parseInt(scanner.nextLine());

        System.out.println("Ingrese el precio del libro");
        double pLibro = Double.parseDouble(scanner.nextLine());

        System.out.println("¿Tiene envio gratuito?");
        boolean eGratuito = Boolean.parseBoolean(scanner.nextLine());

        System.out.println("Nombre del libro: " + nLibro + " # " + idLibro);
        System.out.println("Precio del libro: $ " + pLibro);
        System.out.println("Envio gratuito: " + eGratuito);

        scanner.close();

    }
}
