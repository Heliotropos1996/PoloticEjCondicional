
package ejercicioscondicionales3;

import java.util.Scanner;

public class EjerciciosCondicionales3 {


    public static void main(String[] args) {
        int edad;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese la edad");
        edad = teclado.nextInt();
        
        if(edad >= 4 & edad <= 6){
            System.out.println("Las cursadas son los Lunes y Miércoles de 16 a 17");
        }
        else if(edad >= 7 & edad <= 8){
            System.out.println("Las cursadas son los Martes y Jueves de 16:30 a 17:30");
        }
        
        else if (edad >= 9 & edad <= 10){
            System.out.println("Las cursadas son los Martes y Jueves de 17:30 a 19");
        }
        else if(edad >= 11 & edad <= 13){
            System.out.println("Las cursadas son los Lunes y Miércoles de 17 a 18:30");
        }
        else{
             System.out.println("Ingresó mal la edad");
         }
         }

}