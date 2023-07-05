// //Determina la longitud de la frase ingresada y guárdala en una variable.
// //Convierte la frase a minúsculas y guárdala en otra variable.
// Convierte la frase a mayúsculas y guárdala en otra variable.
// Verifica si la frase contiene la palabra "Java" y guarda el resultado en una variable booleana.
// Extrae los primeros tres caracteres de la frase y guárdalos en una variable.
// Extrae los últimos tres caracteres de la frase y guárdalos en otra variable.
package Ejercicios;

import java.util.Scanner;

public class Frase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su frase");
        String frase = scanner.nextLine();
        int longitudFrase = frase.length();
        String fraseMinusculas = frase.toLowerCase();
        String fraseMayusculas = frase.toUpperCase();
        Boolean verficaFrase = frase.contains("Verba");
        String tresPrimeros = frase.substring(0,3);
        String tresUltimos = frase.substring(frase.length()-3);

        System.out.println("Frase: "+frase);
        System.out.println("Longitud de la frase: "+longitudFrase);
        System.out.println("Frase en minusculas: "+fraseMinusculas);
        System.out.println("Frase en mayusculas: "+fraseMayusculas);
        System.out.println("Verificación de frase: "+verficaFrase);
        System.out.println("Tres primeros: "+tresPrimeros);
        System.out.println("Tres ulitmos: "+tresUltimos);

        scanner.close();

    }

}
