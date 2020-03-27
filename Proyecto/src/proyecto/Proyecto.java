/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author Diego
 */
import java.io.*;

public class Proyecto {
    //Variable global
    static int Variableglobal=1;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CONDICIONALES
        //IF
        int a=1, b=2;
         if (a>b) {
             System.out.println("Numero  a, es mayor que b");
         }else{
             System.out.println("Numero en  a, es mayor que b");
         }
         //SWITCH
         int nums=1;
         switch(nums){
             case 1:
                 System.out.println(" Uno");
             break;
             case 2:
                 System.out.println(" Dos");
             break;
             case 3:
                 System.out.println(" Tres");
             break;
             default:
                 System.out.println("No hay numeros");
                 break;
         }
         //ITERABLES
         int iter=1;
         while (iter<=4) {                        
             System.out.println("Numeros en  WHILE: "+iter);
             iter++;
         }
         System.out.print("\n");
         int dow=5  ;         
         do {
             dow--;
             System.out.println("Números en  DO-WHILE: "+dow);
         } while (dow>2);
         //FOR
         for(int inicio = 0; inicio<=6; inicio++){
           
            System.out.println(inicio);
       
        }
         //ARREGLOS
         String arg[] = new String[]{"a","b","c"};         
         System.out.println(" arreglo en la posicion inicial: "+arg[0]);
         System.out.println("");
         
         System.out.println("todo el contenido del arreglo");         
          for(int i = 0; i < arg.length; i++) {
             System.out.println(arg[i]);
         }
         //VARIABLE LOCAL
         String nm = "Diego ";
         //MATRICES
         int matrizNumeros[][];
        matrizNumeros = new int[2][2];
        // ingresar datos en la matriz
        for(int inicioF = 0; inicioF < matrizNumeros.length; inicioF++){
            for (int inicioC = 0; inicioC < matrizNumeros[inicioF].length; inicioC++) {
                System.out.println("ingresar valores: "+inicioF+" , "+inicioC);
                matrizNumeros[inicioF][inicioC] = 2*inicioF;
            }
        }
        // visuaizar los valores de la mtariz
        for(int inicioF = 0; inicioF < matrizNumeros.length;
                inicioF++){
            for (int inicioC = 0; inicioC < matrizNumeros[inicioF].length;
                    inicioC++) {
                System.out.println("resultado de valores: "+inicioF+" , "+inicioC);
                System.out.println(matrizNumeros[inicioF][inicioC]);
            }
        }
        //ARCHIVOS
        String ubicacionArchivo = "Fundamentos de programacion.txt";
        String contenidoArchivo = "Proyecto Final";
                
        File archivo = new File(ubicacionArchivo);
        
        if(archivo.exists())
        {
            System.out.println("Archivo existente");
        }   
        else{
            try {
                archivo.createNewFile();
                FileWriter escribirArchivo = new FileWriter(archivo);
                
            }  catch (IOException ex) {
                
            System.out.println("Error al crear archivo");
                
            }   
                
     
        } 
}
    
 //Funciones
    public static int sumar2numeros (int num1, int num2){
         int suma = num1 + num2;
         return suma;  
         }   
         }       
     
