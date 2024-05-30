import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, M, X;

        // Input tamanho matriz
        N = sc.nextInt();
        M = sc.nextInt();

        int[][] matriz = new int[M][N]; //M linhas N colunas

        // Input elementos matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        // Output matriz
        for (int[] ints : matriz) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

        // Input elemento de busca
        X = sc.nextInt();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if ((matriz[i][j]) == X) {
                    System.out.println("Position " + i + "," + j + ":");
                    // Se coluna > 0 : tem left
                    if (j > 0) {
                        System.out.println("Left: " + matriz[i][j - 1]);
                    }
                    // Se linha > 0 : tem up
                    if (i > 0) {
                        System.out.println("Up: " + matriz[i - 1][j]);
                    }
                    if (j < matriz[i].length - 1) {
                        System.out.println("Right: " + matriz[i][j + 1]);
                    }
                    if (i < matriz.length - 1) {
                        System.out.println("Down: " + matriz[i + 1][j]);
                    }
                }
            }
        }

        sc.close();
    }
}