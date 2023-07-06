package SentenciasControl;

import java.util.Scanner;
//Sanbra
public class SenteciaSwitchEstaciones {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String estacionDesconocida = "Estacion desconocida";
        String estacion = "";

        System.out.println("Estaciones del año por mes");
        int numeroMes = Integer.parseInt(scanner.nextLine());

        switch (numeroMes) {
            case 1:
            case 2:
            case 3:
            case 12:
                estacion = "Invierno";
                break;
            case 4:
            case 5:
            case 6:
                estacion = "Primavera";
                break;
            case 7:
            case 8:
            case 9:
                estacion = "Verano";
                break;
            case 10:
            case 11:
                estacion = "Otoño";
                break;
            default:
                estacion = estacionDesconocida;
                break;
        }

        System.out.println(estacion);
        scanner.close();
        
    }
}
