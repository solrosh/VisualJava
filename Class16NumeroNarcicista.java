// Necesitamos un programa para mostrar si un número es narcisita o no lo es.
// Un número narcicista es aquel que la suma de la potencia de su longitud es el mismo resultado que el número introducido:

// Ejemplo: 153

// 1*1*1 = 1
// 5*5*5 = 125
// 3*3*3 = 27

// 153 = 125 + 27 +1!!
// Como hacer una potencia en java: Math.??

import java.util.Scanner;

public class Class16NumeroNarcicista {
    public static void main (String [] srt) {
        Scanner read = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        String dato = read.nextLine();
        int suma=0;
        int longitud = dato.length();
        for (int i=0;i<dato.length();i++){
            char digitos = dato.charAt(i);
            String aux = String.valueOf(digitos);
            int numero = Integer.parseInt(aux);
            int potencia = (int) Math.pow(numero,longitud);
            suma =+ potencia;
        }
        System.out.println(suma);
    }
}
