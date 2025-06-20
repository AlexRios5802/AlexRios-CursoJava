import java.util.Scanner;

public class FuncionPar {

    // Función para saber si un nuemro es par
    static boolean esPar(int numero) {
        return (numero % 2 == 0) ? true : false;
        // if (numero % 2 == 0)
        //    return true;
        //else
        //    return false;
    }

    public static void main(String[] args) {

        System.out.print("Proporciona un valor numérico: ");
        var numero = Integer.parseInt(new Scanner(System.in).nextLine()); // NUEVA FORMA DEL SCANNER
        System.out.println("Número par? " + esPar(numero));

    }
}
