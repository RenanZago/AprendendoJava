// Math Class

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double x,y,z;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the X");
        x = scanner.nextDouble();

        System.out.println("Enter the Y");
        y = scanner.nextDouble();

        z = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));

        System.out.println(z);
        scanner.close();
    }
}