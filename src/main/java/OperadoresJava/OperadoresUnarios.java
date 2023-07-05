// Operadores Unarios
package OperadoresJava;

public class OperadoresUnarios {

    public static void main(String[] args) {

        int a = 3;
        int b = -a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        boolean c = true;
        boolean d = !c; //Operador de complemento

        System.out.println("c= " + c);
        System.out.println("d= " + d);

        //Incremento
        //Pre incremento
        int e = 3;
        int f = ++e; // +1

        System.out.println("e = " + e);
        System.out.println("f = " + f);

        //postincremento
        int g = 5;
        int h = g++;
        System.out.println("g = " + g);
        System.out.println("h = " + h);
        
        //Decremento
        //predecremento
        
        int i = 2;
        int j = --i;
        
        System.out.println("i = "+i);
        System.out.println("j = "+j);
        
        //postdecremento
        
        int k = 4;
        int l = k--;
        
        System.out.println("k = "+k);
        System.out.println("l = "+l);

    }
}
