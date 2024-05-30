// Exercício Fixação: vetores
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Rent[] rooms = new Rent[10];
        int N;
        String name, email;
        int numRoom;

        System.out.println("How many rooms will be rented?");
        N = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= N; i++){
            System.out.println("Rent #" + i);

            System.out.println("Name:");
            name = scanner.nextLine();

            System.out.println("Email");
            email = scanner.nextLine();

            System.out.println("Room:");
            numRoom = scanner.nextInt();
            scanner.nextLine();

            // Atribuindo ao vetor rooms (index = numeroRoom) uma instancia da classe Rent
            rooms[numRoom] = new Rent(name, email);
        }

        System.out.println("Busy rooms:");
        for (int i = 0; i < rooms.length; i++){
            if (rooms[i] != null)
                System.out.println(i + ":" + rooms[i]);
        }

        scanner.close();
    }
}