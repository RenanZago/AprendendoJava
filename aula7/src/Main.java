import java.util.Scanner;

// Arrays
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] cars = new String[3];

        cars[0] = "Fusca";
        cars[1] = "Gol bolinha";
        cars[2] = "Gol quadrado";

        for (int i = 0; i < cars.length; i++){
            System.out.println(cars[i]);
        }

        //2d arrays
        int numbers[][] = new int[3][3];

        // Input
        for (int i = 0; i < numbers.length; i++){
            for (int j = 0; j < numbers[i].length; j++){
                   numbers[i][j] = scanner.nextInt();
            }
        }

        // Output
        for (int i = 0; i < numbers.length; i++){
            for (int j = 0; j < numbers[i].length; j++){
                System.out.print(numbers[i][j]);
            }
            System.out.println();
        }

        scanner.close();
    }
}