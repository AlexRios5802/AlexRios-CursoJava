public class Persona { // Nombre de la clase: Persona - Características
    // Agregamos atributos de NOMBRE y APELLIDO
    String nombre; // Todos sus valores por Default es NULL. NO PODEMOS USAR VAR, ya que requiere de un valor. y para este bloque no puede tener valores
    String apellido;

    void mostrarPersona(){ // Métodos
        System.out.println("Nombre: " + nombre); // Notamos que el color de la variable es diferente a un variable local
        System.out.println("Apellido: " + apellido);
    }

    public static void main(String[] args) {
        System.out.println("*** Creación de Clase y Objetos Persona ***");
        var objeto1 = new Persona(); // Solo reserva espacio en la memoria, pero no agrega valores
        objeto1.nombre = "Alex";
        objeto1.apellido = "Rios";
        objeto1.mostrarPersona();

        // Segundo objeto
        System.out.println();
        var objeto2 = new Persona();
        objeto2.nombre = "Omar";
        objeto2.apellido = "Perez";
        objeto2.mostrarPersona();
    }
}
