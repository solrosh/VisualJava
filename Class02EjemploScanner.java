// PEDIR AL USUARIO NOMNBRE Y EDAD.
// LE MOSTRAREMOS EL MENSAJE DE BIENVENIDA CON SU NOMBRE Y OTRO CON SU EDAD.

import java.util.Scanner;

public class Class02EjemploScanner {
    public static void main (String [] args ) {
        Scanner leer = new Scanner(System.in);

        String nombre;
        int edad;

        System.out.print("Ingrese su nombre: ");
        nombre = leer.nextLine();

        System.out.print("Ingrese su edad: ");
        edad = leer.nextInt();

        System.out.println("Buenos días " + nombre);
        System.out.println("Tienes "+edad +" años");
    }
}
