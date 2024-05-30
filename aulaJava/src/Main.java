import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Output
        System.out.println("Hello World");

        // Loop
        for (int i = 0; i < 5; i++){
            System.out.println("Indice: " + i);
        }

        // Variables
        int age = 19;
        double height = 1.75;
        boolean z = false;
        String name = "Renan Zago";
        String course = "Ciência da Computação";
        String programmingLanguage = "Java";

        System.out.println("Oi, eu sou " + name + ", sou estudante de " + course + ", estou estudando " + programmingLanguage + ". Tenho " + age + " anos e " + height + " de altura.");

        // Swap two variables
        int a = 1;
        int b = 2;
        int temp;
        System.out.println("Antes do Swap");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("Depois do Swap");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        // User Input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual seu nome?");
        String name1 = scanner.nextLine();

        System.out.println("Qual sua idade?");
        int age1 = scanner.nextInt();
        scanner.nextLine(); // Necessário para não sobrar um /n do "nextInt"

        System.out.println("Olá " + name1);

        // Convert types
        int number = 10;
        double result;

        result = (double) number / 3;

        System.out.println(result);


        scanner.close();
    }
}