import java.lang.foreign.SymbolLookup;
import java.util.ArrayList;
import java.util.Scanner;

public class Class22ArrayListNombres {

    public static void main (String [] srt) {
        Scanner read = new Scanner(System.in);
        ArrayList <String> nombres = new ArrayList<>();
        String nombre = "";
        while (nombre.equals("stop") == false) {
            System.out.println("Introduce un nombre: ");
            nombre = read.nextLine();

            
            if (nombres.contains(nombre)) {
                System.out.println("Nombre repetido");
            }
            else if (nombre.isBlank()) {
                    System.out.println("No esta permitido vacios");
                }
            else 
                nombres.add(nombre);
            
            System.out.println("Nombres recogidods: " +nombres.size());
        }
        nombres.remove(nombres.size()-1);
        System.out.println("-----------------------------------------");
        for (String name: nombres) {
            System.out.println(name);
        }
    }
}