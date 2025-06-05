import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class Class09CalcularSalario {
    public static void main(String[] stg) {
        Scanner read = new Scanner(System.in);

        System.out.print("Introduzca las horas semanales: ");
        String dato = read.nextLine(); 
        int timework = Integer.parseInt(dato);

        System.out.print("Introduzca importe hora: ");
        dato = read.nextLine(); 
        int money = Integer.parseInt(dato);

        System.out.print("Introduzca kilometros: ");
        dato = read.nextLine(); 
        int distance = Integer.parseInt(dato);

        int sueldo,horasextra,sueldobase;
        String dieta;

        // Sueldo
        if (timework > 35 ){
            horasextra = (timework-35)*(money+2);
        }
        else {
            horasextra = 0;
        }

        sueldobase = 35*money;

        sueldo = sueldobase + horasextra;

        // KILOMETROS

        if (distance > 101 && distance < 900) {
            dieta = "NACIONAL";
        }
        else if (distance > 900) {
            dieta = "INTERNACIONAL";
        }
        else
            dieta = "PROVINCIAL";
        
        // RETENCION

        
        
        System.out.println("------------------------");
        System.out.println("Horas trabajadas: "+timework);
        System.out.println("Horas extra: "+horasextra/money*2);
        System.out.println("Importe de las horas: "+money);
        System.out.println("Distancia en km: "+dieta);
        System.out.println("Salario base: "+sueldobase);
        System.out.println("Salario horas extra: "+horasextra);
        System.out.println("Salario bruto: "+sueldo);
        System.out.println("IVA(16%): "+(sueldo*0.16));
        System.out.println("------------------------");
        System.out.println("Salario total: "+(sueldo-(sueldo*0.16)));

    }
}