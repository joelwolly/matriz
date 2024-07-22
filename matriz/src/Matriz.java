import java.util.Arrays;
import java.util.Random;

public class Matriz {
    // Função para preencher a matriz com números pares aleatórios entre 1 e 100
    public static int[][] preencherMatriz() {
        int[][] matriz = new int[3][3];
        Random rand = new Random();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // Gera números pares aleatórios entre 1 e 100
                matriz[i][j] = rand.nextInt(50) * 2 + 2;
            }
        }
        return matriz;
    }

    // Função para imprimir a matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Função para ordenar a matriz e substituir números iguais por 999
    public static void ordenarSubstituir(int[][] matriz) {
        System.out.println("\nMatriz antes de ser ordenada:");
        imprimirMatriz(matriz);

        for (int i = 0; i < 3; i++) {
            Arrays.sort(matriz[i]);
        }

        System.out.println("\nMatriz após ser ordenada:");
        imprimirMatriz(matriz);

        // Substitui números iguais por 999
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                if (matriz[i][j] == matriz[i][j + 1]) {
                    matriz[i][j] = 999;
                }
            }
        }

        System.out.println("\nMatriz após substituir números iguais por 999:");
        imprimirMatriz(matriz);
    }

    public static void main(String[] args) {
        System.out.println("Preenchendo a matriz com números pares aleatórios entre 1 e 100:");
        int[][] matriz = preencherMatriz();

        System.out.println("Matriz gerada:");
        imprimirMatriz(matriz);

        ordenarSubstituir(matriz);
    }
}
