import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args) {

        System.out.println("*** Promedio de Calificaciones ***");

        // Lo que usaremos fuera del bloque de código
        var consola = new Scanner(System.in);
        var suma = 0;

        // Ingresamos la cantidad de calificaciones que vamos a agregar
        System.out.print("Cuantas Calificaciones deseas agregar?: ");
        var addGrades = Integer.parseInt(consola.nextLine());
        var enteros = new int[addGrades];

        // Comenzamos a ingresar los valores y ademas a sumarlos para poder sacar el promedio
        for (var i = 0; i < addGrades; i++){
            System.out.print("Calificación[" + i + "] = ");
            enteros[i] = Integer.parseInt(consola.nextLine());
            suma += enteros[i];
        }

        var promedio = suma / addGrades;

        System.out.println("Promedio de las Calificaciones es: " + promedio);

    }
}
