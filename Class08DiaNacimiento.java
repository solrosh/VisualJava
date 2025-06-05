import java.util.Scanner;

public class Class08DiaNacimiento {
    public static void main (String [] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Introduzca el día de nacimiento: ");
        String dato = read.nextLine();
        int day = Integer.parseInt(dato);

        System.out.print("Introduzca el mes de nacimiento: ");
        dato = read.nextLine();
        int month = Integer.parseInt(dato);

        System.out.print("Introduzca el año de nacimiento: ");
        dato = read.nextLine();
        int year = Integer.parseInt(dato);

        // arrways
        String [] weekdays = {"Sabado","Domingo","Lunes","Martes","Miercoles","Jueves","Viernes"};
        System.out.println(weekdays[day]);
    }
}
