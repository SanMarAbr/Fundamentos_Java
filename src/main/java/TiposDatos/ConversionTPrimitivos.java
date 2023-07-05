package TiposDatos;


import java.util.Scanner;

public class ConversionTPrimitivos {

    public static void main(String[] args) {
        //Convertir un String a un Int

        var edad = Integer.parseInt("20");
        System.out.println("edad = " + edad);

        //Convertir un Double a un Int
        double valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);

        //
        char c = "hola".charAt(0);
        System.out.println("c: " + c);

        var scanner = new Scanner(System.in);
        edad = Integer.parseInt(scanner.nextLine());
        System.out.println("edad: " + edad);

        char caracter = scanner.nextLine().charAt(0);
        System.out.println("Caracter: " + caracter);

        String edadTexto = String.valueOf(false);
        System.out.println("edadTexto = " + edadTexto);
        
        //No se podría convertir un short a byte debido a la perdida de informacion
        //e incompatibilidad que hay
        short s = 128;
        byte b = (byte) s;
        System.out.println("b = " + b);

        scanner.close();
    }
}
