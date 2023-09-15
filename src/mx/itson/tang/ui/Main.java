package mx.itson.tang.ui;

import java.util.Scanner;

/**
 *Inicia el programa y determina el punto de partida de su ejecución.
 * @author Ramsés Sosa
 */
public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("Ingrese el texto a evaluar: ");
        Scanner leer = new Scanner(System.in);
        String oracion = leer.nextLine();
        
        int numerosTijuana = 0, numerosHermosillo = 0, numerosGuaymas = 0, numerosDesconocidos = 0;
        
        String numeros = oracion.replace("-", "").replace(")", "").replace("(", "").replace(" ", "");
        System.out.println(numeros);
         
        String [] tels = numeros.split(",");
        
        for(String g : tels){
            System.out.println(g);
     
            
            
        if(g.startsWith("622")){
            numerosGuaymas++;
         
        }  
        }
        for(String h : tels){
            System.out.println(h);
            
            if(h.startsWith("662"))
                numerosHermosillo++;
        }
        for(String t : tels){
            System.out.println(t);
            
            if(t.startsWith("664"))
            numerosTijuana++;
        }
           System.out.println("Hay:"+numerosGuaymas +" números de Guaymas");
           System.out.println("Hay:"+numerosHermosillo +" números de Hermosillo");
           System.out.println("Hay:"+numerosTijuana +" números de Tijuana");
        
        //String nuevaOracion = oracion.replace("n", "x");
        
        //System.out.println(nuevaOracion);

        /*boolean resultado = oracion.startsWith("a");
        if(resultado){
            System.out.println("Si inicia con a");
        }
        else{
            System.out.println("no inicia con a");
        }

        ///////////////////////////////////////////////////
        
        if(oracion.startsWith("a")){
            System.out.println("Si inicia con a");
        }
        else{
            System.out.println("no inicia con a");
        }
        ///////////////////////////////////////////////////    
        // ? = if
        // : = else
        System.out.println(oracion.startsWith("a") ? "Si inicia con a" : "No inicia con a");
        */
        
    }
    
    
}
