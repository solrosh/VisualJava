import java.util.Scanner;

public class Class25MetodosPositivoNegativo {
    // si son static void no retornan
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número");
        String dato = teclado.nextLine();
        int valor = Integer.parseInt(dato);
        String data = evaluarNumero(valor);
        System.out.println(data);
    }

    public static String evaluarNumero(int numero){
        // aquí si retornan
        String respuesta = "";
        if (numero > 0){
            respuesta = "POSITIVO";
        }else if (numero == 0){
            respuesta = "CERO";
        }else {
            respuesta = "NEGATIVO";
        }
        return respuesta;
    }
}