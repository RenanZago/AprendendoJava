package application;

import model.entities.Account;
import model.exceptions.DomainException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data");

            System.out.println("Number:");
            int number = sc.nextInt();
            sc.nextLine();

            System.out.println("Holder:");
            String holder = sc.nextLine();

            System.out.println("Initial balance:");
            double initialBalance = sc.nextDouble();

            System.out.println("Withdraw limit:");
            double withdrawLimit = sc.nextDouble();

            Account account = new Account(number, holder, initialBalance, withdrawLimit);

            System.out.println("Enter amount for withdraw:");
            double amount = sc.nextDouble();

        try {
            account.withdraw(amount);
            System.out.println("New balance: " + account.getBalance());
        }
        catch (DomainException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }

        sc.close();
    }
}