package Clases;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1;
        persona1 = new Persona();
        persona1.nombre = "Abraham";
        persona1.apellido = "Sanchez";
        persona1.desplegarInformacion();

        Persona persona2 = new Persona();
        System.out.println("Persona 1<===   " + persona1);
        System.out.println("Persona 2<===   " + persona2);

        persona2.desplegarInformacion();
        persona2.nombre="Laura";
        persona2.apellido="Gonzalez";
        persona2.desplegarInformacion();

    }
}
