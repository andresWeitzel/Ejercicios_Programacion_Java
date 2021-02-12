
package resolucionecuacion2dogrado;

import java.util.Scanner;


public class ResolucionEcuacion2doGrado {

    
    public static void main(String[] args) {
        
        double a,b,c; //coeficientes/variables ax^2 + bx +c=0
        
        double x1, x2, determinante;//Soluciones y determinante
        
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Introduzca el primer coeficiente(a):");
        a=scanner.nextDouble();
        
        
        System.out.println("Introduzca el segundo coeficiente(b):");
        b=scanner.nextDouble();
        
        
        System.out.println("Introduzca el tercer coeficiente(c):");
        c=scanner.nextDouble();
        
        determinante= (b*b)-4*a*c; //Determinante
        
        if( determinante < 0){
            System.out.println("No tiene soluciones Reales!!");
        }else{
            x1=(-b + Math.sqrt(determinante))/(2*a) ;
            
            x2=(-b - Math.sqrt(determinante))/(2*a) ;
            
            System.out.println("Solucion x1 :"+x1);
            
            
            System.out.println("Solucion x2 :"+x2);
            
        }
        
        
        
        
        
        
        
         }

}
