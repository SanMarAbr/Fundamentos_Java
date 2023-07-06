//Utilizar sentencia if para mostrar las estaciones del año
//Por medio de operador logico OR
//Sanbra 1

package SentenciasControl;

import java.util.Scanner;

public class EstacionesAño {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String estacionAño = "";
        String mesDesconocido = "Mes desconocido";

        System.out.println("Estaciones del año");
        System.out.println("Ingrese el mes");
        String mes = scanner.nextLine();

        if (mes.equals("Enero") || mes.equals("Febrero") || mes.equals("Marzo") || mes.equals("Diciembre")) {

            estacionAño = "Invierno";

        } else if (mes.equals("Abril") || mes.equals("Mayo ") || mes.equals("Junio")) {

            estacionAño = "Primavera";

        } else if (mes.equals("Julio") || mes.equals("Agosto") || mes.equals("Septiembre")) {

            estacionAño = "Verano";

        } else if (mes.equals("Octubre") || mes.equals("Noviembre")) {

            estacionAño = "Otoño";

        } else {

            System.out.println(mesDesconocido);
        }
        
        System.out.println(estacionAño);

        scanner.close();
    }
}
