package aritmetica; // <--- Esto se agregó justo de crear el paquete

public class Aritmetica {
    int operando1;
    int operando2;

    // Constructor vacío
    public Aritmetica(){
    }

    // Constructor con dos argumentos
    public Aritmetica(int operando1, int operando2){
        System.out.println("Ejecutando constructor");
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    // Estos métodos de sumar y restar no son públicos. Esto quiere decir que solo se pueden acceder desde otras clases dentro del mismo paquete
    public void sumar() {
        var resultado = operando1 + operando2;
        System.out.println("Resultado de la suma: " + resultado);
    }

    public void resta() {
        var resultado2 = operando1 - operando2;
        System.out.println("Resultado de la resta: " + resultado2);
    }

}
