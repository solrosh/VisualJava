// debemos utilizar la clase Character. pediremos cualquier texto al usuario y debemos indicar los siguientes datos sobre el texto escrito:

// Texto: hoy es martes 10 de junio de 25
// numero de letras: 9
// numero de digitos: 4
// numero de vocales: 6
// numero de consonantes: 3
// mayusculas: 1

import java.util.Scanner;

public class Class18AnalizarTexto {
    public static void main (String [] srt) {
        Scanner read = new Scanner(System.in);
        System.out.println("Escriba cualquier texto: ");
        String texto = read.nextLine();
        String vocales[] = {"a","e","i","o","u","A","E","I","O","U"};
        int contLetras = 0;
        int contDigi = 0;
        int contVocal = 0;
        int contConsona = 0;
        int contMayuscula = 0;


        for (int i=0;i< texto.length();i++) {
            char digitos = texto.charAt(i);
            if (Character.isLetter(digitos)) {
                contLetras ++;
                if (Character.isUpperCase(digitos)) {
                    contMayuscula++;
                }
                if (Character.toLowerCase(digitos) == 'a' || Character.toLowerCase(digitos) == 'e' || Character.toLowerCase(digitos) == 'i' || Character.toLowerCase(digitos) == 'o'
                    || Character.toLowerCase(digitos) == 'u' ) {
                    contVocal++;
                }
                else
                    contConsona++;
            }
            else if (Character.isDigit(digitos)) {
                contDigi++;
            }
        }
        System.out.println("Hay "+contLetras+" letras");
        System.out.println("Hay "+contDigi+" digitos");
        System.out.println("Hay "+contVocal+" vocales");
        System.out.println("Hay "+contConsona+" consonantes");
        System.out.println("Hay "+contMayuscula+" mayusculas");
    }
}
