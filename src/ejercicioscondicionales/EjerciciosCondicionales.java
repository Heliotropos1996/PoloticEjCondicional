
package ejercicioscondicionales;

import java.util.Scanner;


public class EjerciciosCondicionales {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String sueldo;
        double sueldoRepo, sueldoCajero, sueldoSup;
        System.out.println("Elige un sueldo");
        sueldo = teclado.nextLine();
switch(sueldo){
    case "sueldo repositor":
        System.out.println("Ingrese monto");
        sueldoRepo = teclado.nextDouble();
        sueldoRepo = sueldoRepo + sueldoRepo * 0.1;
        System.out.println("El sueldo es: " + sueldoRepo);
        break;
    case "sueldo cajero": 
        System.out.println("Ingrese monto");
        sueldoCajero = teclado.nextDouble();
        System.out.println("El sueldo es: " + sueldoCajero);
         break;
    case "sueldo supervisor":
        System.out.println("Ingrese monto");
        sueldoSup = teclado.nextDouble();
        sueldoSup = sueldoSup - sueldoSup * 0.11;
        System.out.println("El sueldo es: " + sueldoSup);
}
    }

}
