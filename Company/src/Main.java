import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, id;
        String name;
        double salary, percentage;
        List<Emplyoee> listEmplyoee = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        n = scanner.nextInt();
        scanner.nextLine();

        // Ler id, name e salary
        for (int i=0; i < n; i++){
            System.out.println("Employee #" + (i+1));

            System.out.println("Id:");
            id = scanner.nextInt();
            scanner.nextLine();
            while (hasId(listEmplyoee, id)) {
                System.out.print("Id already taken. Try again: ");
                id = scanner.nextInt();
                scanner.nextLine();
            }

            System.out.println("Name:");
            name = scanner.nextLine();

            System.out.println("Salary:");
            salary = scanner.nextDouble();

            listEmplyoee.add(new Emplyoee(id, name, salary));
        }

        System.out.println("Enter the employee id that will have salary increase:");
        id = scanner.nextInt();
        int finalId = id;
        Emplyoee emp = listEmplyoee.stream().filter(x -> x.getId() == finalId).findFirst().orElse(null); //emp armazena uma referência ao funcionario da lista, então se eu
                                                                                                                // fizer alterações em emp, vai alterar diretamente na lista
        if (emp == null){
            System.out.println("This id does not exist!");
        }
        else {
            System.out.println("Enter the percentage:");
            percentage = scanner.nextDouble();
            emp.increaseSalary(percentage); // alterando o emp, logo, alterando diretamente o funcionário da lista
        }

        System.out.println();
        System.out.println("List of employees:");
        for (Emplyoee obj : listEmplyoee) {
            System.out.println(obj);
        }
        scanner.close();
    }

    public static boolean hasId(List<Emplyoee> list,int id){
        Emplyoee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}