package TiposDatos;

//Datos primitivos Java

public class DatosPrimitivos {

    public static void main(String[] args) {

        System.out.println("Estos son los datos primitivos");
        System.out.println("byte, short, int, long");

//       int l = 1;
        byte byteVar = 0; //Rango Maximo
        System.out.println("byteVar = " + byteVar);

        System.out.println("bits tipo byte: " + Byte.SIZE);
        System.out.println("Bytes tipos byte: " + Byte.BYTES);
        System.out.println("Valor minimo tipo Byte: " + Byte.MIN_VALUE);
        System.out.println("Valore maximo tipo byte: " + Byte.MAX_VALUE);

        short shortVar = 32767;
        System.out.println("shortVar: " + shortVar);

        System.out.println("bits tipo short: " + Short.SIZE);
        System.out.println("Bytes tipos short: " + Short.BYTES);
        System.out.println("Valor minimo tipo short " + Short.MIN_VALUE);
        System.out.println("Valore maximo tipo short " + Short.MAX_VALUE);

        int intVar = 2147483647;
        System.out.println("intVar = " + intVar);

        System.out.println("bits tipo int: " + Integer.SIZE);
        System.out.println("Bytes tipos int: " + Integer.BYTES);
        System.out.println("Valor minimo tipo int " + Integer.MIN_VALUE);
        System.out.println("Valore maximo tipo int " + Integer.MAX_VALUE);

        long longVar = 1000000000;
        System.out.println("longVar : " + longVar);

        System.out.println("bits tipo long: " + Long.SIZE);
        System.out.println("Bytes tipos long: " + Long.BYTES);
        System.out.println("Valor minimo tipo long: " + Long.MIN_VALUE);
        System.out.println("Valore maximo tipo long: " + Long.MAX_VALUE);

        var numeroInt= 1000000000; // Tiene un valor maximo tipo int y con la literal long
        System.out.println("numero: " + numeroInt);

        var numeroLong = 10000000000000000l; // Tiene un valor maximo tipo int y con la literal long
        System.out.println("numero: " + numeroLong);

    
    }
}
