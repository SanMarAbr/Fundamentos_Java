package SentenciasControl;

public class SentenciaIf {
    public static void main(String[] args) {
        // var condicion = true;

        // if (condicion == true) {
        //     System.out.println("Es verdadera");
        //     System.out.println("Nueva linea");
        // } else {
        //     System.out.println("Condicion Falsa");
        // }

        String numeroTexto = "";
        String numeroDesconocido = "Numero desconocido";

        var numero = 4 ;

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
            numeroTexto = numeroDesconocido;
        }
       
        System.out.println(numeroTexto);
    }
}
