package PasosPorValor;

public class PasoPorValor {
    public static void main(String[] args) {

        int x = 10;
        System.out.println("X: " + x);

        cambiarValor(x);
        System.out.println("X nuevo valor: "+x);
    }

    public static void cambiarValor(int arg1) {
        System.out.println("Iniciando Metodo");
        System.out.println("Variable arg1: " + arg1);
        arg1 = 15;
    }

}
