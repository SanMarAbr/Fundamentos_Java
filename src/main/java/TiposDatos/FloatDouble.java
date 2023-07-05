package TiposDatos;

//Variables flotantes / Dobles

public class FloatDouble {

    public static void main(String[] args) {
        var floatVar = -1.4F;
        System.out.println("doubleVar = " + floatVar);

        System.out.println("bits tipo float: " + Float.SIZE);
        System.out.println("bytes tipo float: " + Float.BYTES);
        System.out.println("Valor minimo tipo float: " + Float.MIN_VALUE);
        System.out.println("Valor maximo tipo float: " + Float.MAX_VALUE);

        var doubleVar = 10.00D;
        System.out.println("doubleVar = " + doubleVar);

        System.out.println("bits tipo double: " + Double.SIZE);
        System.out.println("Bytes tipo double: " + Double.BYTES);
        System.out.println("Valor minimo tipo Double: " + Double.MIN_VALUE);
        System.out.println("Valor maximo tipo Double: " + Double.MAX_VALUE);
    }

}
