import java.util.Scanner;

public class Class13CalcularDni {
    public static void main (String[] str) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Seleccione una opción: ");
        System.out.println("1.-Comprobar NIF: ");
        System.out.println("2.-Comprobar DNI: ");
        String dato = read.nextLine();
        int opcion = Integer.parseInt(dato);

        String letrasDni = "TRWAGMYFPDXBNJZSQVHLCKET";

        if (opcion == 1) {
            System.out.println("Introduzca su NIF (12345678X)");
            String dni = read.nextLine();
            char letraDNI = dni.charAt(dni.length()-1);
            String temp = dni.substring(0, dni.length()-1);
            int numeroDni = Integer.parseInt(temp);

            int result = ( numeroDni - ( numeroDni / 23) *23);
            char letra = letrasDni.charAt(result);

            System.out.println("Tu letra es "+letra);

            if (letraDNI == letra) {
                System.out.println("Su DNI es correcto");
            } else {
                System.out.println("Su DNI es incorrecto, su letra es " +letra);
            }

        } else {
            System.out.print("Introduzca número DNI: ");
            dato = read.nextLine();
            int numeroDni = Integer.parseInt(dato);
            int result = ( numeroDni - ( numeroDni / 23) *23);
            char letra = letrasDni.charAt(result);
            System.out.println("Tu letra es "+letra);
        }
    }
}
