package application;

import entities.Employee;
import entities.OutsorcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();

        System.out.println("Enter the number of employees: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Employee #" + i + " data: ");

            System.out.println("Outsourced?");
            char d = sc.next().charAt(0);

            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.println("Hours: ");
            int hours = sc.nextInt();

            System.out.println("Value Per Hour: ");
            double valuePerHour = sc.nextDouble();

            if (d == 'y') {
                System.out.println("Additional Change: ");
                double additionalChange = sc.nextDouble();
                list.add(new OutsorcedEmployee(name, hours, valuePerHour, additionalChange));
            } else {
                list.add(new Employee(name, hours, valuePerHour));

            }
        }
        System.out.println("PAYMENTS: ");
        for (Employee e : list) {
            System.out.println(e.getName() + " - $ " + String.format("%.2f", e.payment()));
        }

        sc.close();
    }
}