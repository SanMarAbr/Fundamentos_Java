//Escribe un programa en Java que solicite al usuario ingresar el precio de un producto y el porcentaje de descuento aplicado. 
//El programa debe calcular y mostrar el precio final después del descuento.

package Ejercicios;

import java.util.Scanner;

public class CalculadoraDescuento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de descuentos: ");

        System.out.println("Ingresa el precio del producto");
        double precioProducto = Double.parseDouble(scanner.nextLine());

        System.out.println("Ingrese el porcentaje que le gustaría aplicar en el producto");
        int numero = Integer.parseInt(scanner.nextLine());

        double porcentaje = (numero / 100.00);
        // System.out.println(porcentaje);
        double descuento = (precioProducto * porcentaje);
        // System.out.println(descuento);
        double precioFinal = precioProducto - descuento;

        System.out.println("Precio inicial del producto: $" + precioProducto);
        System.out.println("Este es el porcentaje de descuento aplicado: " + numero + "%");
        System.out.println("Esta es la cantidad descontada al precio: $ " + descuento);
        System.out.println("Este es el precio final = $ " + precioFinal);

        scanner.close();
    }
}