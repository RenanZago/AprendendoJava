import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        int c = 23;

        int[] resultado = ordenar3Numeros(a, b, c);

        System.out.println("Os números em ordem decrescente são: " + Arrays.toString(resultado));
    }

    public static int[] ordenar3Numeros(int a, int b, int c) {
        // Comparar A com B e trocar se necessário
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        // Comparar B com C e trocar se necessário
        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }

        // Comparar A com B novamente para garantir a ordem
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        // A ordem decrescente é C, B, A
        return new int[]{c, b, a};
    }


}