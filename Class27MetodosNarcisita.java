// Necesitamos un método para averiguar si un número es Narcisita o no.
// lo que quiero en mi programa es lo siguiente.
// Necesito recorrer todos los números desde el 1 hasta el 20.000 y almacenar dentro de una colección todos los números Narcisitas.
// Posteriormente, quiero dibujar dichos números.
// String dato = String.valueof(numero);
import java.util.ArrayList;

public class Class27MetodosNarcisita {

    public static void main(String [] srt){
        ArrayList <Integer> cadenaNum  = new ArrayList<>();

        for (int i=1;i<20000;i++ ) {
            if (validarNumNarc(i) == false) {
                System.out.print("");
            }
            else 
                cadenaNum.add(i); 
        }
        for ( int narci: cadenaNum) {
            System.out.print(narci+" ");
        }
    }
    public static boolean validarNumNarc (int num) {
        String numeroCadena = String.valueOf(num);
        int suma = 0, longitud = numeroCadena.length();

        for (int i=0;i<numeroCadena.length();i++) {
            char digitos = numeroCadena.charAt(i);
            String aux = String.valueOf(digitos);
            int numero = Integer.parseInt(aux);
            int potencia = (int) Math.pow(numero, longitud);
            suma += potencia;
        }
        if (suma == Integer.parseInt(numeroCadena)) {
            return true;
        }
        else
            return false;
    }
}
