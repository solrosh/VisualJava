// Necesitamos un programa para validar un Email
// Debemos indicar cada error del Email
// No podemos utilizar bucles, solamente IF.
// Vamos a comprobar una serie de elementos:

    // Exista una @
    // @ No esté ni al inicio ni al final
    // Solamente una @
    // Existe un punto
    // Existe un punto después de la @
    // Dominio de 2 a 3 caracteres

import java.util.Scanner;

import javax.swing.text.StyledEditorKit;

public class Class14ValidarEmail {

    public static void main (String [] srt) {
        Scanner read = new Scanner(System.in);
        System.out.println("Introduzca su email: ");
        String email = read.nextLine();


        if (email.startsWith("@") || email.endsWith("@")) {
            System.out.println("No puede empezar ni acabar con un @");
        } else
            if (email.contains("@") == false ) {
                System.out.println("No hay @");
                if (email.contains(".") == false) {
                    System.out.println("No hay punto");
                }
                else if (email.indexOf(".") != email.lastIndexOf(".")) {
                    System.out.print("Hay más de un punto");
                }
            } else if (email.indexOf("@") != email.lastIndexOf("@")) {
                System.out.println("Hay más de dos @");
            } else if (email.lastIndexOf(".") < email.lastIndexOf("@")) {
                System.out.println("El . tiene que ir despues del @");
            }

    }
}