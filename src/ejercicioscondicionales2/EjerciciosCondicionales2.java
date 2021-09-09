
package ejercicioscondicionales2;

import java.util.Scanner;


public class EjerciciosCondicionales2 {

 
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cantidadPaquetes;
        System.out.println("Ingrese cantidad de paquetes");
        cantidadPaquetes = teclado.nextInt();
        
        if(cantidadPaquetes < 5){
            System.out.println("No se permiten compras inferiores a 5 paquetes");
            }
         if(cantidadPaquetes >= 5 & cantidadPaquetes <= 15){
                System.out.println("El costo de envio es 200 pesos");
            }
         else {
             System.out.println("El envio es gratuito");
         }
    }
    
}
