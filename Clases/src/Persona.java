public class Persona { // Nombre de la clase: Persona - Características
    // Agregamos atributos de NOMBRE y APELLIDO
    String nombre; // Todos sus valores por Default es NULL. NO PODEMOS USAR VAR, ya que requiere de un valor. y para este bloque no puede tener valores
    String apellido;


    void mostrarPersona(){ // Métodos
        System.out.println("Nombre: " + nombre); // Notamos que el color de la variable es diferente a un variable local
        System.out.println("Apellido: " + apellido);
    }
}
