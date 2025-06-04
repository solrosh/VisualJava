import java.util.Scanner;

public class Class04PositivoNegativo {
    public static void main(String[] strg){
        
        Scanner read = new Scanner(System.in);
        int numero1;

        System.out.print("Introduzca un número: ");
        numero1 = read.nextInt();

        if (numero1 > 0) {
            System.out.println("El número es POSITIVO");
        }
        else if (numero1 == 0){
            System.out.println("El número es CERO");
        }
        else
            System.out.println("El número es NEGATIVO");
    }
}
