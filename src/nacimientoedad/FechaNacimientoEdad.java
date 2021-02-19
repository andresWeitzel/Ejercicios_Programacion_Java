
package nacimientoedad;

import java.util.Scanner;


public class FechaNacimientoEdad {
    public static void main(String[] args) {
        /*Escribir una aplicacion que pida el año actual y el nacimiento del usuario.
        Debe calcular su edad, suponiendo que en el año en curso el usuario ya ha cumplido años*/
        int añoActual,añoDeNacimiento,edad;
        
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("\n Ingrese Año Actual:");
        añoActual=scanner.nextInt();
        
        System.out.println("\n Ingrese Año de Nacimiento:");
        añoDeNacimiento=scanner.nextInt();
        
        edad = añoActual - añoDeNacimiento;
        
        System.out.println("\n Su edad es : "+edad+" años");
        
        
        
        
    }

}
