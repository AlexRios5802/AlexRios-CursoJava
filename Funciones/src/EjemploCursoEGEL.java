import javax.crypto.spec.PSource;
import java.io.FilterOutputStream;
import java.util.Scanner;

public class EjemploCursoEGEL {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);

        // PEDIR NOMRBE
        System.out.print("NOMBRE: ");
        var nombre = consola.nextLine();

        System.out.println("APELLIDO: ");
        var apellido = consola.nextLine();




        // System.out.println("Hola " + nombre + ", tu edad es " + edad);

        // var sb = new StringBuilder();
        //sb.append(nombre);
        //sb.append(" ");
        //sb.append(edad);
        // var resultado = sb.toString();

        //System.out.println(resultado);

        String resultado = String.join(" ", nombre, apellido);
        System.out.println(resultado);

    }
}
