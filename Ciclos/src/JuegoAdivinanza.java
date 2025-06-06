import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanza {
    public static void main(String[] args) {
        System.out.println("*** Juego de Adivinanza ***");
        var consola = new Scanner(System.in);
        var random = new Random();

        // Generamos un número aleatorio entre 1 y 50
        var numeroScreto = random.nextInt(50) + 1;
        var intentos = 0;
        var adivinanza = 0;
        final var INTENTOS_MAXIMOS = 5;

        while (adivinanza != numeroScreto && intentos < INTENTOS_MAXIMOS) {
            System.out.print("Adivina el número secreto (1-50): ");
            adivinanza = consola.nextInt();

            // Agregar una ayuda para orientar al jugador
            if (adivinanza < numeroScreto)
                System.out.println("El número secreto es mayor");
            else if (adivinanza > numeroScreto)
                System.out.println("El número secreto es menor");

            // Incrementamos la variable de intentos
            intentos++;
        }
        // Conclusión del juego
        if (adivinanza == numeroScreto) {
            System.out.printf("Felicidades, adivinaste el número secreto en %d intentos%n", intentos);
        }
        else {
            System.out.printf("Lo siento, has agotado tus intentos máximos: %d%n", INTENTOS_MAXIMOS);
            System.out.printf("El número secreto era: %d%n", numeroScreto);
        }
    }
}
