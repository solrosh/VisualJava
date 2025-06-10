import java.util.Scanner;

public class Class187ComprobarISBN {
    public static void main (String[] srt) {
        Scanner read = new Scanner(System.in);
        System.out.println("Introduzca el numero ISBN a validar (10 cifras): ");
        String isbn = read.nextLine();
        int resultado = 0 ;
        int longitud = isbn.length();

        if (longitud == 10) {
            for (int i=0;i<longitud;i++) {
                char digitos = isbn.charAt(i);
                String aux = String.valueOf(digitos);
                int numero = Integer.parseInt(aux);
                int ope1 = numero*(i+1);
                resultado += ope1;
            }
            if (resultado % 11 == 0 ){
            System.out.println("Numero ISBN " +isbn +" CORRECTO");
            }
            else
                System.out.println("Numero ISBN "+isbn+" NO CORRECTO");
        }
        else {
            System.out.println("La longitud de caracteres es "+longitud);
            System.out.println("La longitud de caracteres tiene que ser 10");
        }
    }
}
