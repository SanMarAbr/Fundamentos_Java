package SentenciasControl;

public class SentenciaIf {
    public static void main(String[] args) {
        var condicion = true;

        if (condicion == true) {
            System.out.println("Es verdadera");
            System.out.println("Nueva linea");
        } else {
            System.out.println("Condicion Falsa");
        }

        var numero = 10 ;
        var numeroTexto = "Numero desconocido";

        if (numero == 1) {
            numeroTexto = "Numero uno";
        } 
        else if(numero ==2 ){
            numeroTexto = "Numero dos";
        } 
        else if(numero == 3){
            numeroTexto = "Numero tres";
        } 
        else if(numero == 4){
            numeroTexto = "Numero cuatro";
        } else {
            System.out.println(numeroTexto);
        }
       
        System.out.println("numeroTexto = "+ numeroTexto);
    }
}
