import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;
        double valor;

        System.out.println("""
                1.Depositar
                2.Sacar
                3.Consultar Saldo
                4.Encerrar""");


        while (continuar) {

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    valor = scanner.nextDouble();
                    saldo += valor;
                    System.out.println("Saldo atual: " + String.format("%.1f", saldo));
                    break;
                case 2:
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    valor = scanner.nextDouble();
                    if (valor > saldo){
                        System.out.println("Saldo insuficiente.");
                        System.out.println("Programa encerrado.");
                        continuar = false;
                    }
                    else {
                        saldo -=valor;
                        System.out.println("Saldo atual: " + String.format("%.1f", saldo));
                    }
                    break;
                case 3:
                    // TODO: Exibir o saldo atual da conta.
                    System.out.println("Saldo atual: " + String.format("%.1f", saldo));
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }

}