import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] tabuleiro = new char[][]{
                {'1', '1', '1'},
                {'1', '1', '1'},
                {'1', '1', '1'}
        };

        mostrarTabuleiro(tabuleiro);
        System.out.println("-------------");

        boolean jogadorXGanhou;
        boolean jogadorOGanhou;
        boolean deuVelha;

        do {
            escolherPosicao(tabuleiro, 'X');

            mostrarTabuleiro(tabuleiro);
            System.out.println("-------------");

            jogadorXGanhou = verificarVitoria(tabuleiro, 'X');
            if (jogadorXGanhou) {
                System.out.println("O jogador X ganhou!");
                break;
            } else {
                deuVelha = verificarEmpate(tabuleiro);
                if (deuVelha) {
                    System.out.println("Deu velha!");
                    break;
                }

                escolherPosicao(tabuleiro, 'O');

                mostrarTabuleiro(tabuleiro);
                System.out.println("-------------");

                jogadorOGanhou = verificarVitoria(tabuleiro, 'O');
                if (jogadorOGanhou) {
                    System.out.println("O jogador O ganhou!");
                    break;
                }
            }
        } while (true);

        sc.close();
    }

    public static boolean verificarVitoria(char[][] matriz, char jogador) {
        // Verifica as linhas e colunas
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][0] == jogador && matriz[i][1] == jogador && matriz[i][2] == jogador) {
                return true;
            }
            if (matriz[0][i] == jogador && matriz[1][i] == jogador && matriz[2][i] == jogador) {
                return true;
            }
        }

        // Verifica as diagonais
        if (matriz[0][0] == jogador && matriz[1][1] == jogador && matriz[2][2] == jogador) {
            return true;
        }
        return matriz[0][2] == jogador && matriz[1][1] == jogador && matriz[2][0] == jogador;
    }

    public static boolean verificarEmpate(char[][] tabuleiro) {
        for (char[] linha : tabuleiro) {
            for (char celula : linha) {
                if (celula == '1') {
                    return false;
                }
            }
        }
        return true;
    }

    public static void escolherPosicao(char[][] tabuleiro, char jogador) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite a posição (%c):\n", jogador);
        System.out.print("Linha: ");
        int linha = sc.nextInt();
        System.out.print("Coluna: ");
        int coluna = sc.nextInt();

        // Verifica se a posição escolhida é válida
        if (linha < 0 || linha >= 4 || coluna < 0 || coluna >= 4) {
            System.out.println("Posição inválida. Tente novamente.");
            escolherPosicao(tabuleiro, jogador); // Chama recursivamente para escolher outra posição
        } else if (tabuleiro[linha - 1][coluna - 1] != '1') {
            System.out.println("Esta posição já está ocupada. Tente novamente.");
            mostrarTabuleiro(tabuleiro);
            escolherPosicao(tabuleiro, jogador); // Chama recursivamente para escolher outra posição
        } else {
            tabuleiro[linha - 1][coluna - 1] = jogador;
        }
    }

    public static void mostrarTabuleiro(char[][] tabuleiro) {
        for (char[] chars : tabuleiro) {
            for (char anChar : chars) {
                System.out.print(anChar + " ");
            }
            System.out.println();
        }
    }

}