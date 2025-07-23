
public class AritmeticaThis {
    int operando1;
    int operando2;

    // Constructor vacío
    public AritmeticaThis(){
    }

    // Constructor con dos argumentos
    public AritmeticaThis(int operando1, int operando2){
        System.out.println("Ejecutando constructor");
        this.operando1 = operando1;
        this.operando2 = operando2;
        System.out.println("Operador this: " + this);
    }

    void sumar() {
        var resultado = this.operando1 + this.operando2;
        System.out.println("Resultado de la suma: " + resultado);
    }

    void resta() {
        var resultado2 = this.operando1 - this.operando2;
        System.out.println("Resultado de la resta: " + resultado2);
    }


    public static void main(String[] args) {
        System.out.println("*** Ejemplo aritmetica.Aritmetica ***");
        var aritmetica1 = new AritmeticaThis(5, 7); // El operador this está apuntando aunque no lo parezca
        aritmetica1.sumar();
        aritmetica1.resta();
        System.out.println("Dir. Mem obj1: " + aritmetica1);

        // Creamos un segundo objeto
        var aritmetica2 = new AritmeticaThis(12, 16);
        aritmetica2.sumar();
        System.out.println("Dir Memoria obj2: " + aritmetica2);

    }

}
