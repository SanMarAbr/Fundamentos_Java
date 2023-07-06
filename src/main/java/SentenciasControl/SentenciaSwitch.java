package SentenciasControl;

import java.util.Scanner;

public class SentenciaSwitch {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String numeroTexto = "Valor desconocido";

        System.out.println("Ingrese numero de caso");
        int numero = Integer.parseInt(scanner.nextLine());

        switch(numero){
            case 1: 
                numeroTexto = "Numero uno";
                break;
            case 2:
                numeroTexto = "Numero dos";
                break;
            case 3: 
                numeroTexto = "Numero tres";
                break;
            case 4:
                numeroTexto = "Numero cuatro";
                break;
            default :
                numeroTexto = "Caso no encontrado";
        }
        System.out.println(numeroTexto);

        scanner.close();
        


    }
}
