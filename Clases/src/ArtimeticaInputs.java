import java.util.Scanner;

public class ArtimeticaInputs {
    int operando1;
    int operando2;

    void sumar() {
        var resultado = operando1 + operando2;
        System.out.println("Resultado de la suma: " + resultado);
    }

    void resta() {
        var resultado2 = operando1 - operando2;
        System.out.println("Resultado de la resta: " + resultado2);
    }

    void input() {
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingresa el valor para el operando1: ");
        operando1 = consola.nextInt();
        System.out.print("Ingresa el valor para el operando1: ");
        operando2 = consola.nextInt();
    }

    public static void main(String[] args) {
        System.out.println("*** Ejemplo Aritmetica ***");
        var aritmetica1 = new ArtimeticaInputs();
        aritmetica1.input();
        aritmetica1.sumar();
        aritmetica1.resta();

        System.out.println();

        var aritmetica2 = new ArtimeticaInputs();
        aritmetica2.input(); // -> Se parece a un ciclo, ya que te pide de nuevo valores, pero no lo es, ya que está llamando el método "input"
        aritmetica2.sumar();
        aritmetica2.resta();


    }

}