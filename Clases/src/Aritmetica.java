
public class Aritmetica {
    int operando1;
    int operando2;

    // Constructor vacío
    public Aritmetica(){
    }

    // Constructor con dos argumentos
    public Aritmetica(int op1, int op2){
        System.out.println("Ejecutando constructor");
        operando1 = op1;
        operando2 = op2;
    }

    void sumar() {
        var resultado = operando1 + operando2;
        System.out.println("Resultado de la suma: " + resultado);
    }

    void resta() {
        var resultado2 = operando1 - operando2;
        System.out.println("Resultado de la resta: " + resultado2);
    }


    public static void main(String[] args) {
        System.out.println("*** Ejemplo Aritmetica ***");
        var aritmetica1 = new Aritmetica(5, 7);
        // aritmetica1.input();
        aritmetica1.sumar();
        aritmetica1.resta();

        // constructor vacio
        var aritmetica2 = new Aritmetica();
        System.out.println();
        aritmetica2.operando1 = 12;
        aritmetica2.operando2 = 8;
        aritmetica2.sumar();
        aritmetica2.resta();


    }

}
