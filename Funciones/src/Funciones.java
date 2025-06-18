public class Funciones {

    static void saludar (String mensaje){ // Parámetro
        System.out.println("Mensaje: " + mensaje);
    }

    public static void main(String[] args) {
        saludar("Hola desde java "); // Argumento
        saludar("Adios");
    }
}
