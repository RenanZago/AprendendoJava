import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int age;

        Scanner scanner =  new Scanner(System.in);

        System.out.println("Enter your age");
        age = scanner.nextInt();

        if (age < 0)
            System.out.println("You not exist");
        else if (age <= 12)
            System.out.println("You are a children");
        else if (age <= 17)
            System.out.println("You are a adolescent");
        else
            System.out.println("You are a adult");

        scanner.close();
    }
}