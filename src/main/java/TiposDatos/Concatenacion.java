package TiposDatos;



public class Concatenacion {
   
    public static void main(String[] args) 
    { 
    //Unir valores de varias variables si son dos o mas de tipo cadena
    //+ Concatena y + en terminos aritmeticos se hace como una suma
    //Variables almacenan 
        var usuario = "Abraham";
        var saludar = "Hola"; 
        
        System.out.println(saludar +" "+ usuario);
        
        var i = 3;
        var j = 5;
        System.out.println(i+j);
        
        //De izquierda a derecha depende de cual encuentre primero es lo que hara primero
         // Contexto de cadena esto se debe a cadena 
        System.out.println(saludar + i + j);
        
         //Si primero encuentra numeros los suma y luego contatena
        System.out.println(i + j + saludar);
    }
}
    
