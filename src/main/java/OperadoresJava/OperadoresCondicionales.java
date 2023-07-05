//Operadores Condicionales
package OperadoresJava;

public class OperadoresCondicionales {

    public static void main(String[] args) {
        
        //Condicional
        int a = 10;
        int valorMinimo = 0, valorMaximo = 10;
        boolean resultado = a >= valorMinimo && a <= valorMaximo;

        System.out.println("Resultado = " + resultado);
        
        //Operador Or
        boolean vacaciones = true;
        boolean diaDescanso = false;
        
        if(vacaciones || diaDescanso)
            System.out.println("Puede asistir juego del hijo");
        else
            System.out.println("Padre esta ocupado");

    }
}
