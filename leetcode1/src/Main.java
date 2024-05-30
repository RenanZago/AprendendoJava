import java.util.Objects;

public class Main {
    public static void main(String[] operations) {
        int X = 0;
        for (String operation : operations){
            if (Objects.equals(operation, "++X") || Objects.equals(operation, "X++")){
                X++;
            }
            else if (Objects.equals(operation, "X--") || Objects.equals(operation, "--X")){
                X--;
            }
        }

        System.out.println(X);
    }
}