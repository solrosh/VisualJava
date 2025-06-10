public class Class19Arrays {
    public static void main (String [] args) {
        // Declaramos un array para guardar nombres
        String [] nombres = new String[3];
        // Podemos visualizar la longitud
        System.out.println("Longitud del array "+nombres.length);
        nombres[0]= "Lucia";
        nombres[1]= "Adrian";
        nombres[2] = "Diana";

        for (int i=0;i< nombres.length;i++) {
            System.out.println(nombres[i]);
        }

        // tambien podemos tener un array inicializado con contenido
        int [] numeros = new int[] {11,14,15,66,55,44,22,88};
        System.out.println(numeros.length);
    }
}
