// Ejercicio 2: Conversor de temperatura

// Escribe un programa en Java que solicite al usuario ingresar una temperatura en grados Celsius.
//  El programa debe convertir la temperatura a grados Fahrenheit y mostrar el resultado.
package Ejercicios;

import java.util.Scanner;

public class ConvertidorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la temperatura a grados Celsius: ");
        double gradosCelsius = Double.parseDouble(scanner.nextLine());
        double conversionFarenheit = (gradosCelsius * 9 / 5) + 32;

        String mensajeCelsius = ("Estos fueron los grados C° proporcionados: " + gradosCelsius + " °C");
        String mensajeFinal = ("Esta es la temperatura en grados Farenheit: " + conversionFarenheit + " °F");

        System.out.println(mensajeCelsius);
        System.out.println(mensajeFinal);
        
        scanner.close();
    }
}
