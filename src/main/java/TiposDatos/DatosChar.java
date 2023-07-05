package TiposDatos;


public class DatosChar {

    public static void main(String[] args) {
        System.out.println("bits de tipo Char: " + Character.SIZE);
        System.out.println("Bytes de tipo Char: " + Character.BYTES);
        System.out.println("Valor minimo tipo Char: " + Character.MIN_VALUE);
        System.out.println("Valor maximo tipo Char: " + Character.MAX_VALUE);

        char varChar = +'\u0021';
        System.out.println("varChar: " + varChar);

        char varCharDecimal = 33;
        System.out.println("varChar Deximal: = " + varCharDecimal);

        char varCharSimbolo = '!';
        System.out.println("varCharSimbolo: = " + varCharSimbolo);

    }
}
