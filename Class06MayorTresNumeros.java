import java.nio.channels.NetworkChannel;
import java.util.Scanner;

import javax.swing.text.StyledEditorKit;
public class Class06MayorTresNumeros {
    public static void main(String[] agrs){
        Scanner read = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        String dato = read.nextLine();
        int numero1 = Integer.parseInt(dato);

        System.out.print("Introduzca otro número: ");
        dato = read.nextLine();
        int numero2 = Integer.parseInt(dato);

        System.out.print("Introduzca otro número: ");
        dato = read.nextLine();
        int numero3 = Integer.parseInt(dato);

        int mayor;

        // codigo estatico

        if (numero1 > numero2 && numero1 > numero3){
            mayor = numero1;
        }
        else if (numero2>numero3){
            mayor = numero2;
        }
        else
            mayor = numero3;

        System.out.println("El mayor es "+mayor);


        // codigo dinamico

        if (numero1 > numero2 && numero1 > numero3){
            mayor = numero1;
        }
        else if (numero2> numero1 && numero2>numero3){
            mayor = numero2;
        }
        else
            mayor = numero3;

        System.out.println("El mayor es "+mayor);
    }
}
