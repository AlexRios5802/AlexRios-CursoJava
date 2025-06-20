public class FuncionSumar {

    // Definimos la función sumar
    static int suma(int a, int b) {
        var resultado = a + b;
        return resultado;
    }

    public static void main(String[] args) {
        int arg1 = 3, arg2 = 8; // Como estamos definiendo dos variables en una sola línea, no podemos usar var
        var resultado_funcion = suma(arg1, arg2);
        System.out.println("resultado_funcion = " + resultado_funcion);
        resultado_funcion = suma(10, 20);
        System.out.println("resultado_funcion = " + resultado_funcion);
    }
}
