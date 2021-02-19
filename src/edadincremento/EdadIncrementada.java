
package edadincremento;

import java.util.Scanner;


public class EdadIncrementada {
    public static void main(String[] args) {
        /*Pedir al Usuario su edad y mostrar la que tendra el proximo año*/
        int edad;
        
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("\nEscriba su  edad por favor:");
        
        edad=scanner.nextInt();
        
        //edad=edad+1;
        edad+=1;
        
        System.out.println("\n El proximo año tendra una edad de :"+edad);
        
        
        
        
    }

}
