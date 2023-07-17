package PasoPorReferencia;

import Clases.Persona; // Import de clases de anteriores paquetes

public class PasoPorReferencia{

    public static void main(String[] args) {
        
        Persona persona1 = new Persona(); //Hereda de clases Object
        persona1.nombre = " Abraham";
        System.out.println("Persona1 nombre: "+persona1.nombre);
        cambiaValor(persona1);
        System.out.println("Persona1 cambio nombre: "+ persona1.nombre);
    }
    public static void cambiaValor(Persona persona){
      //  System.out.println("Persona1: "+persona.nombre);
        persona.nombre = "Laura";

    }

    

}