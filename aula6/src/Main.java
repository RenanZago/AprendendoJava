// Switch
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a day");
        String day = scanner.nextLine();

        switch (day) {
            case "segunda": System.out.println("Hoje é segunda");
            break;
            case "terça": System.out.println("VOCE JA ENTENDEU...");
        }

        scanner.close();
    }
}