package Ciclos;

public class BreakContinue {

    public static void main(String[] args) {

        System.out.println("Break y Continue");

        for (int i = 0; i < 3; i++) {
            if (i % 2 != 0) {
                break;
                // continue; // Ir a la siguiente iteración
            }
            System.out.println("Contador = " + i);
        }
    }
}
