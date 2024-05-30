import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numGrades;

        System.out.println("Enter the number of grades:");
        numGrades = scanner.nextInt();

        // Error Handling
        if (numGrades <= 0) {
            System.out.println("Invalid number of grades. Please enter a positive integer.");
            return;
        }

        double[] grades = new double[numGrades];
        double sumGrades = 0, average;

        // Input Grades
        for (int i = 0; i < numGrades; i++) {
            System.out.println("Enter the grade " + (i + 1));
            grades[i] = scanner.nextDouble();
            sumGrades += grades[i];
        }

        // Calculate (sumGrades/numGrades)
        average = sumGrades / numGrades;

        // Output Average
        System.out.println("Grade average: " + average);

        scanner.close();
    }
}