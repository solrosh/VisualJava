import java.util.Scanner;

public class Class03SumarNumeros {
    public static void main(String[] args){
        Scanner leerteclado = new Scanner(System.in);
        System.out.print("Introduzca número 1: ");
        // Almacenamos el primer numero
        // El número debemos almacenarlo como entero
        // Voy a capturar el dato como String
        String dato = leerteclado.nextLine();
        //Convertimos el dato a INT
        int numero = Integer.parseInt(dato);
        System.out.print("Introduzca número 2: ");
        //Volvemos a utilizar la variable dato
        dato = leerteclado.nextLine();
        // Convertimos el dato a int
        int numero2 = Integer.parseInt(dato);

        // realizamos suma
        int suma = numero + numero2;
        //Mostramos la suma
        System.out.println("La suma entre "+numero+" + "+numero2+" es "+suma);

    }
}
