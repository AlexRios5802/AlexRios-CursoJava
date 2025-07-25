package aritmetica; // <--- Esto se agregó justo de crear el paquete

public class Aritmetica {
    private int operando1; // <<= Al ponerlo en público podemos usar estas variables en mi PruebaAritmetica.java
    private int operando2;

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


    public int getOperando1(){
        return  this.operando1;
    }
    public void setOperando1(int operando1){
        this.operando1 = operando1;
    }


    public int getOperando2(){
        return this.operando2;
    }
    public void setOperando2(int operando2){
        this.operando2 = operando2;
    }

}
