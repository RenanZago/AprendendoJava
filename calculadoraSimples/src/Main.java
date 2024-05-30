import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double result = 0, number1, number2;
        char operator;

        // Input
        System.out.println("[WELCOME TO CALCULATOR]");

        System.out.println("Enter the first number:");
        number1 = scanner.nextDouble();
        scanner.nextLine();

        do {
            System.out.println("Enter the operator (+, -, *, /):");
            operator = scanner.nextLine().charAt(0); // Input CHAR
        } while (operator != '+' && operator != '-' && operator != '*' && operator != '/');

        System.out.println("Enter the second number:");
        number2 = scanner.nextDouble();

        // Calculator
        switch (operator) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                if (number2 != 0)
                    result = number1 / number2;
                else
                    System.out.println("Error: Division by zero");
                break;
            default:
                System.out.println("Error: Invalid operator");
        }

        // Output
        System.out.println("Result: " + number1 + " " + operator + " " + number2 + " = " + result);

        scanner.close();
    }
}