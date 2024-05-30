// Random Number

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int x = random.nextInt(10)+1; // números de 1 - 10
        System.out.println(x);
    }
}