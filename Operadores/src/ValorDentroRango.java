import java.util.Scanner;

public class ValorDentroRango {
    public static void main(String[] args) {
        System.out.println("*** Valor Dentro Rango ***");
        // Definimos los limites
        final var MINIMO = 0;
        final var MAXIMO = 5;
        
        // Solicitar un valor entre 0 y 5
        System.out.print("Proporciona un dato entre 0 y 5: ");
        var dato = Integer.parseInt(new Scanner(System.in).nextLine()); // <--- Simplificacion del Scanner
        // Verifica si el dato esta dentro de rango
        var estaDentroRango = dato >= MINIMO && dato <= MAXIMO; // <--- Se puede hacer usando IF, pero es más código
        System.out.println("estaDentroRango? = " + estaDentroRango);

    }
}
