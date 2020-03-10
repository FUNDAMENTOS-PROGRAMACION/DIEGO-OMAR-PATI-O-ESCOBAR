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
        String cad = "Hello world ";
        System.out.println(cad);
        imprimirNombre();
        
        sumar2numeros(1,2);
       
    }
     public static void imprimirNombre (){
         System.out.println("Fundamentos");
         }
     
     public static int sumar2numeros (int num1, int num2){
         int suma = num1 + num2;
         return suma;  
         }
}