/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer.proyecto;

/**
 *
 * @author Diego
 */
public class PrimerProyecto {

    /**
     * @param args the command line arguments
     */
   int a = 0;
    double d = 0.0;
    char c = 'c';
    String str = "hello world";
    boolean v = false;
     
    
    public static void main(String[] args) {
        // TODO code application logic here
        String cad = "Hello world ";//imprimir algo
        System.out.println(cad);
        imprimirNombre();
        
        sumar2numeros(1,2);
       
    }
     public static void imprimirNombre (){
         System.out.println("Diego \n Patiño");//salto de linea e imprimir 
         System.out.println("Die \t go");//tabulador espacio 
         //
                  
         String nombre="   Diego Patiño";
         System.out.println(nombre.trim());
         
         String Nombre="Diego Patiño";
         System.out.println(Nombre.length());
         
         String NOMBRE="Diego Patiño";
         System.out.println(NOMBRE.toUpperCase());
         
         String Name="DIEGO PATIÑO";
         System.out.println(Name.toLowerCase());
         String nombrE="   Diego Patiño";
         System.out.println(nombre.replace(nombrE, "Gorjito el Guayaco"));
         
         String N="DIEGO PATIÑO";
         System.out.println(N.split("3"));
         

         }
     
     public static int sumar2numeros (int num1, int num2){
         int suma = num1 + num2;
         return suma;  
         }
}