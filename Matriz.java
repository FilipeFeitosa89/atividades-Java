import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        Scanner scanner = new Scanner(System.in);

        // Lê a matriz
        System.out.println("Digite os elementos da matriz 3x3:");
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                matriz[linha][coluna] = scanner.nextInt();
            }
        }

        // Multiplica os elementos da diagonal principal por 2
        for (int linha = 0; linha < 3; linha++) {
            matriz[linha][linha] *= 2;
        }

        // Imprime a matriz resultante
        System.out.println("Matriz resultante:");
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println();
        }
    }
}