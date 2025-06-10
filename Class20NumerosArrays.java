// Necesitamos un programa en el que pidamos al usuario 8 números
// Después de pedir 8 números al usuario, debemos analizar lo siguiente:

// mayor,menor,media y suma.

import java.util.Scanner;

public class Class20NumerosArrays {
    public static void main (String[] srt) {
        Scanner read = new Scanner(System.in);
        int arrayNumber[] = new int[8];
        int mayor= 0,menor=0,media= 0,suma=0;
        
        for (int i=0;i<arrayNumber.length;i++) {
            System.out.println("Escriba un número: ");
            arrayNumber[i] = read.nextInt();
            int inicial = arrayNumber[0];
            if (inicial < arrayNumber[i]) {
                mayor= arrayNumber[i];
            }
            else if (inicial>arrayNumber[i]) {
                menor=arrayNumber[i];
            }
            suma +=arrayNumber[i];
        }
        media = suma / arrayNumber.length;
        System.out.println("mayor: "+mayor);
        System.out.println("menor: "+menor);
        System.out.println("media: "+media);
        System.out.println("suma: "+suma);
    }
}
