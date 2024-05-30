import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> food = new ArrayList<>(); // Array dinâmico
        food.add("Pizza");
        food.add("Hamburguer");
        food.add("Alface");

        food.set(0, "Sushi");
        food.remove(2);

        // TEM UMA INFINIDADE DE MÉTODOS.

        for (String s : food) {
            System.out.println(s);
        }

        // Arrays 2D

    }
}