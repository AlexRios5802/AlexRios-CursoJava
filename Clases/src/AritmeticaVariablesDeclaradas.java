public class AritmeticaVariablesDeclaradas {
    int operando1;
    int operando2;

    void sumar (){
        var resultado = operando1 + operando2;
        System.out.println("Resultado de la suma: " + resultado);
    }

    void resta (){
        var resultado2 = operando1 - operando2;
        System.out.println("Resultado de la resta: " + resultado2);
    }

    public static void main(String[] args) {
        System.out.println("*** Ejemplo Aritmetica ***");
        var aritmetica1 = new Aritmetica();
        aritmetica1.operando1 = 5;
        aritmetica1.operando2 = 7;
        aritmetica1.sumar();
        aritmetica1.resta();

        System.out.println();

        var aritmetica2 = new Aritmetica();
        aritmetica2.operando1 = 12;
        aritmetica2.operando2 = 16;
        aritmetica2.sumar();
        aritmetica2.resta();


    }

}