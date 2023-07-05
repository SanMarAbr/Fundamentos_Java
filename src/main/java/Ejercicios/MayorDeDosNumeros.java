package Ejercicios;

import java.util.Scanner;

public class MayorDeDosNumeros {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Proporciona el numero uno: ");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona el numero dos");
        int y = Integer.parseInt(scanner.nextLine());

        System.out.println("El numero mayor es: ");
        System.out.println(x > y ? x : y);

        scanner.close();
    }
}
