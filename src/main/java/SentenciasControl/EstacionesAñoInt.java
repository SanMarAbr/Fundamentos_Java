package SentenciasControl;

import java.util.Scanner;

public class EstacionesAñoInt {
    public static void main(String[] args) {

        String estacionAño = "";
        String mesDesconocido = "Mes no valido";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Estaciones del año con Int");
        int mes = Integer.parseInt(scanner.nextLine());

        if (mes == 1 || mes == 2 || mes == 3 || mes == 12) {
            
            estacionAño = "Invierno";
            
        } else if(mes == 4 || mes == 5 || mes == 6){

            estacionAño = "Primavera";
            
        } else if(mes == 7 || mes == 8 || mes == 9){
           
            estacionAño = "Verano";

        } else if(mes == 10 || mes == 11){

            estacionAño ="Otoño";
        } else {

            estacionAño = mesDesconocido;
        }
        
        System.out.println(estacionAño);

        scanner.close();
    }
}
