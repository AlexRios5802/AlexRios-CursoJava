public class Cadenas {
    public static void main(String[] args) {
        System.out.println("*** Manejo de Cadenas en Java ***");
        var cadena1 = "Hola";
        System.out.println("cadena1 = " + cadena1);
        var cadena2 = new String("Mundo"); // Sintaxis formal para crear objetos en JAVA
        System.out.println("cadena2 = " + cadena2);
        var cadena3 = cadena1 + " " + cadena2;
        System.out.println("cadena3 = " + cadena3);
        // Cadena de multiples lineas (text block)
        var cadena4 = """
                Este es un texto
                multilinea
                mas
                linea
                """;
        System.out.println("cadena4 = " + cadena4);
    }
}
