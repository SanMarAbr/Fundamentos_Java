package Clases; //Especifica el nombre del paquete almacenado en esta clase

public class Persona 
{
    //Atributos
        //nombre : String
        //genero : char
        //ocupacion : String
    //Metodos
        //obtenerNombre() : String
        //obtenerGenero() : String
        //modificarNombre (nombre: String)
        //modificarGenero (genero : String)
        //modificarOcupacion (ocupacion : String)
    //Atributos
    public String nombre;
    public String apellido;

    public void desplegarInformacion()
    {
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
    }
    

}
