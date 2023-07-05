package TiposDatos;



public class CaracteresEspeciales {
    public static void main(String[] args) {
        var nombre   = "Karla";
        var apellido = "Esperanza";
        
        System.out.println(nombre + " " + apellido);
        System.out.println("Nueva linea: \n"+nombre);
        System.out.println("Tabulador: \t"+nombre);
        System.out.println("Retroseso: \b\b"+nombre);   
        System.out.println("Retorno de carro: \r"+nombre);
        System.out.println("Comilla simple \'"+nombre+"\'");
        System.out.println("Comilla doble\""+nombre+"\"");
        
        System.out.println("Saludos");
        System.out.print("Adios\n");
        System.out.print("Nos vemos");
    }
}
