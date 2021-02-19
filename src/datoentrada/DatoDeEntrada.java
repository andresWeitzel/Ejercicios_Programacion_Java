
package datoentrada;

import java.util.Scanner;


public class DatoDeEntrada {
    
    public static void main(String[] args) {
        
        /*Diseñar un Programa que pida un numero al usuario(por teclado) y a continuacion lo muestre*/
        
        int numeroDeEntrada;
        
        System.out.println("\nIngrese el numero por favor..");
        
        Scanner scanner=new Scanner(System.in);
        
        numeroDeEntrada=scanner.nextInt();
        
        System.out.println("\n El numero que ingreso es el : "+numeroDeEntrada);
        
    }

}
