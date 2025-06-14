import java.util.Scanner;

public class SumaDiagonalMatriz {
    public static void main(String[] args) {

        System.out.println("Suma Diagonal de una Matriz");

        var consola = new Scanner(System.in);


        // Creamos la matriz
        var valores = new int[3][3];

        // Solicitamos los valores
        for (var ren = 0; ren < 3; ren++){
            for (var col = 0; col < 3; col++){
                System.out.print("Valores[" + ren + "][" + col + "] = ");
                valores[ren][col] = Integer.parseInt(consola.nextLine());

            }
        }

        // Sumamos la diagola
        var sumaDiagonal = 0;

        for (var i = 0; i < 3; i++){
            for (var j = 0; j < 3; j++){
                if (i == j){
                    sumaDiagonal += valores[i][i];
                }
            }
        }

        System.out.println("\nTu resultado es: " + sumaDiagonal);

    }
}
