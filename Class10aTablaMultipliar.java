// Pedir número al usuario y mostraremos la tabla de multiplicar de dicho número.

import java.util.Scanner;

public class Class10aTablaMultipliar {
    public static void main(String [] arg) {
        Scanner read = new Scanner(System.in);

        System.out.println("Introduzca un número: ");
        String dato = read.nextLine();
        int number = Integer.parseInt(dato);

        // for (int i=1;i<=10;i++){
        //     System.out.println(number+"*"+i +" = " +number*i);
        // }

        for (int i=1;i<=number;i++){
            for (int a=1;a<=10;a++){
                System.out.println(i+"*"+a +" = " +a*i);
            }
            System.out.println("-----------------");
        }
    }
}
