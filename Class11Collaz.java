import java.util.Scanner;

public class Class11Collaz {
    public static void main (String [] srt){
        Scanner read = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        String dato = read.nextLine();
        int numero = Integer.parseInt(dato);
        while (numero != 1){
            if (numero % 2 == 0) {
                numero = numero / 2;
            }
            else
                numero = (numero * 3)+1;
            System.out.print(numero);
        }
    }
}
