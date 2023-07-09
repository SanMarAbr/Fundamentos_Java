package Ciclos;

public class Etiquetas {
    public static void main(String[] args) {
        //Manejo de etiquetas: 

        inicio: 
        
       // System.out.println("Buenas tardes");
       
        for(int i = 0 ; i < 3 ; i++)
        {
            if( i % 2 !=0)
            {
                continue inicio; //Ir a la linea de codigo de la etiqueta
            }
        System.out.println("i = "+i);
        }
    }
    
}
