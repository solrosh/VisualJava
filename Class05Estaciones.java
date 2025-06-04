
// Pedir número del 1-4 y dependiendo del número indicara una estación u otra. 1-P,2-V,3-I,4-Otoño;
import java.util.Scanner;

public class Class05Estaciones {
    public static void main(String[] agrs) {

        Scanner read = new Scanner(System.in);
        System.out.print("Introduzca un número del 1-4: ");
        String dato = read.nextLine();
        int numero = Integer.parseInt(dato);

        if (numero == 1) {
            System.out.println("Primavera");
        } else if (numero == 2) {
            System.out.println("Verano");
        } else if (numero == 3) {
            System.out.println("Invierno");
        } else if (numero == 4) {
            System.out.println("Otoño");
        } else
            System.out.println("Introduzca un caracter valido");
    }
}
