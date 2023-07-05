package OperadoresJava;

public class PrecedenciaOperadores {

    public static void main(String[] args) {

        var x = 5;
        var y = 10;
        var z = ++x + y--;//x=6, y=10, z=16
        System.out.println("X = " + x);
        System.out.println("Y= " + y);
        System.out.println("Z = " + z);

        System.out.println("Ejemplo 2 precedencia de operadores");
        var resultado = 4 + 5 * 6  / 3; //4+((5*6)/3) => (30/3) => 10 + 4 => 14

        System.out.println("Resultado = " + resultado);

    }
}
