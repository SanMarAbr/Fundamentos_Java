package Ejercicios;

import java.util.Scanner;

public class FormulaRectangulo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Proporciona el alto");
        int alto = Integer.parseInt(sc.nextLine());
        System.out.println("Proporciona el ancho");
        int ancho = Integer.parseInt(sc.nextLine());

        int area = alto * ancho;
        int perimetro = (alto + ancho) * 2;

        System.out.println("Resultado del area = " + area);
        System.out.println("Resultado del perimetro = " + perimetro);
        sc.close();
    }
}
