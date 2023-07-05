package OperadoresJava;

public class OperadorTernario {

    public static void main(String[] args) {
        //Expresion a evaluar ||| Caso verdadero ||| Falso 
        var resultado = (3 > 2) ? "Verdadero" : false; //Solo funciona con valores iguales
        System.out.println("Resultado = " + resultado);

        var numero = 7;
        var par = (numero % 2 == 0) ? "numero par" : "numero impar";
        System.out.println("par = "+ par);

    }
}
