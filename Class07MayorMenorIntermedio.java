import java.util.Scanner;

public class Class07MayorMenorIntermedio {
    public static void main(String[] agrs){
        Scanner read = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        String dato = read.nextLine();
        int numero1 = Integer.parseInt(dato);

        System.out.print("Introduzca otro número: ");
        dato = read.nextLine();
        int numero2 = Integer.parseInt(dato);

        System.out.print("Introduzca otro número: ");
        dato = read.nextLine();
        int numero3 = Integer.parseInt(dato);

        int mayor,menor,intermedio;
        
        // MAYOR

        if (numero1 > numero2 && numero1 > numero3){
            mayor = numero1;
        }
        else if (numero2> numero1 && numero2>numero3){
            mayor = numero2;
        }
        else
            mayor = numero3;

        System.out.println("El mayor es "+mayor);
        
        // MENOR

        if (numero1 < numero2 && numero1 < numero3) {
            menor = numero1;
        }
        else if (numero2 < numero1 && numero2 < numero3) {
            menor = numero2;
        }
        else
            menor = numero3;
        System.out.println("El menor es "+menor);

        // INTERMEDIO

        if (numero1>numero2 && numero1< numero3) {
            intermedio = numero1;
        }
        else if (numero2>numero1 && numero2<numero3 ) {
            intermedio = numero2;
        }
        else
            intermedio= numero3;
        System.out.println("El intermedio es "+intermedio);
    }
}
