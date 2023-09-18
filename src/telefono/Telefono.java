/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package telefono;

import java.util.Scanner;

/**
 *
 * Este metodo sirve para difernciar entre las comillas ,parentesis y guiones ,para remplazarlos por comillas cerradas,para despues accomodarlos en una lista
 * y poder guardalo en los contadores 
 */
public class Telefono {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Escriba el texto a revisar o evaluar");
        Scanner entrada=new Scanner(System.in);
      String texto =entrada.nextLine();
        //declaramos una variable tipo string llamada newTexto
        //lo igualamos a la variable texto y esta manda a llamar el metodo replace que nos permite sustituir cosas por otras
        String newTexto=texto.replace("(", "").replace(")", "").replace(" ", "").replace("-", "");
        
       
       
        int guaymas=0;
        int hermosillo=0;
        int tijuana=0;
        int desconocido=0;
         //este array llamado separador nos permitira enlistar todos los datos que nos arrojen pero con la cualidad de que al igualar a nuestra variable
         //esta mandara a llamar el metodo split y cada dato almacenado que se registre con comas se enlistara para abajo .
        String[]registros=newTexto.split(",");
        
        //los 2 puntos significa interar o en 
       for(String b :registros){
           
           String numero = b.substring(0, 3);
           //Extraer los primeros 3 caracteres (código de área)
          switch(numero){
              case "664":
                  tijuana++;
                          break;
              case "662":
                  hermosillo++;
                  break;
              case "622":
                  guaymas++;
                  break;
              default:
              desconocido++;
              break;
               
           }
               
       }
           
       
       
        System.out.println("numeros en guaymas son " +guaymas);
        System.out.println("Numeros en hermosillo son " +hermosillo);
        System.out.println("Numeros en tijuana son " +tijuana);
        System.out.println("Numeros desconocidos son " +desconocido);
        
        
        
    }
    
}
