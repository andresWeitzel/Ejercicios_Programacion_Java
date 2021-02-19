
package comprobacionrangovalores;


public class ComprobacionRangoDeValores {
    public static void main(String[] args) {
        /*El tipo short permite almacenar valores comprendidos entre -32 768 y 32 767 . Se pide escribir 
        un programa que compruebe que el rango de valores de un tipo se comporta de forma ciclica, el valor
        siguiente al maximo es el valor minimo y viceversa*/
        
        short comprobacionRangoDeValores=32767;
        
        System.out.println("\n El valor maximo para el tipo de dato short es: "+ comprobacionRangoDeValores);

        comprobacionRangoDeValores += 1;
        
        System.out.println("El valor minimo pr el tipo de dato short es: "+comprobacionRangoDeValores);
        
    }

}
