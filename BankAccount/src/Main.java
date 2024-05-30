// Exercício Fixação: Construtores, palavra this, sobrecarga, encapsulamento

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int accountNumber;
        String accountHolder;
        double valueDeposit;
        char decision;
        BankAccount Account = null;

        System.out.println("Enter account number");
        accountNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter account holder");
        accountHolder = scanner.nextLine();

        System.out.println("Is there na initial deposit (y/n)?");
        decision = scanner.next().charAt(0);

        if (decision == 'y' || decision == 'Y') {
            System.out.println("Enter initial deposit value");
            valueDeposit = scanner.nextDouble();
            Account = new BankAccount(accountNumber, accountHolder, valueDeposit);
        } else if (decision == 'n' || decision == 'N') {
            Account = new BankAccount(accountNumber, accountHolder);
        } else {
            System.out.println("Invalid");
            System.out.println("Is there na initial deposit (y/n)?");
            decision = scanner.next().charAt(0);
        }

        System.out.println("Account data:");
        System.out.println(Account);

        System.out.println("Enter a deposit value");
        valueDeposit = scanner.nextDouble();
        assert Account != null;
        Account.deposit(valueDeposit);

        System.out.println("Updated account data");
        System.out.println(Account);

        System.out.println("Enter a withdraw value");
        valueDeposit = scanner.nextDouble();
        Account.withdraw(valueDeposit);
        System.out.println("Updated account data");
        System.out.println(Account);

        scanner.close();
    }
}