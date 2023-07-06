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

        var numero = .0 ;
        var numeroDesconocido = "no es valido";

        if (numero == 1) {
            System.out.println("Numero 1");
        } else if(numero ==2 ){
            System.out.println("Numero 2");
        } else if(numero == 3){
            System.out.println("Numero 3");
        } else {
            System.out.println(numeroDesconocido);
        }
    }
}
