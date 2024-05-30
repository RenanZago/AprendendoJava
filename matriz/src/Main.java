import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int coluna = 3;
        int linha = 3;
        int[][] matriz = new int[linha][coluna];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }

        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Diagonal Principal
        System.out.print("Diagonal Principal: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i]);
        }
        System.out.println();

        // Negativos
        int count = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0)
                    count++;
            }
        }
        System.out.printf("Numeros negativos: %d", count);



    }
}