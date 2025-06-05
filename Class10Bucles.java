import java.util.Scanner;

public class Class10Bucles {
    public static void main (String[] srt) {
        //Bucle con for
        for (int i=1;i<=5;i++){
            System.out.println("For: "+i);
        }
        //Bucles de condición
        // Necesitan una condición para salir
        // bucles infinitos
        int contador =1;
        while (contador <= 5) {
            System.out.println("Soy infinito!!!");
            contador++;
        }
        // Necestio mostrar los 20 primeros números pares

        for (int i=1; i<=20;i++){

            if (i% 2 == 0){
                System.out.println("Es par "+i);
            }
        }
        
        // VAMOS A PEDIR AL USUARIO TEXTOS HASTA QUE ESCRIBA STOP

        Scanner teclado = new Scanner(System.in);
        String dato = "";
        //Java en sus String no compara con el operador == ni !=
        // Se debe comparar el valor del objeto, se utiliza el metodo EQUALS
        while (dato.equals("stop") == false){
            System.out.println("Dime algo bonito(stop para salir)");
            dato = teclado.nextLine();
        }
    }
}
