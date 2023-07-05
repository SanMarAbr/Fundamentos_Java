package TiposDatos;


import java.util.Scanner;

public class HolaMundoScanner {

    public static void main(String[] args) {

        System.out.println("Hola mundo");
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese nombre de usuario:");
        var usuario = scanner.nextLine();
        System.out.println("usuario: " + usuario);

        scanner.close();
    }
}

