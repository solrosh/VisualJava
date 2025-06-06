public class Class12String {
    public static void main (String [] srt) {
        String texto = "Desarrollo con java";
        System.out.println(texto.length());
        System.out.println(texto.toLowerCase());
        System.out.println(texto.toUpperCase());
        // BUSCAMOS LA LETRA "A" DIVERSAS FORMAS
        System.out.println(texto.indexOf('x'));
        System.out.println(texto.indexOf('o'));
        System.out.println(texto.indexOf('a'));
        System.out.println(texto.indexOf('a'));
        System.out.println(texto.indexOf('a'));
        System.out.println(texto.lastIndexOf('a'));
        System.out.println(texto.lastIndexOf('a'));
        System.out.println(texto.lastIndexOf('a'));
        // LA SOBRECARGA BUSCA A PARTIR DE UN INDICE
        System.out.println(texto.indexOf('a',4));
        System.out.println(texto.lastIndexOf('a'));
        System.out.println(texto.substring(2,4));
        System.out.println(texto.startsWith("D")); // True or false
    }
}
