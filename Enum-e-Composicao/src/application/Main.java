package application;
import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities_enum.WorkerLevel;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        // formatador da data
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Input
        System.out.print("Department: ");
        String department = sc.nextLine();

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Level: ");
        String level = sc.nextLine();

        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();

        // Instânciando um worker
        Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(department)); // Como workerLevel é um Enum, fica assim = WorkerLevel.valueOf(level)

                                                                                                                // Como a gente ta fazendo uma composição de worker com department, tenho que instanciar ele também
        System.out.print("How many contracts to this worker? "); // Input
        int numContracts = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numContracts; i++){
            // Input
            System.out.println("Enter contract #" +(i+1) + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            LocalDate contractDate = LocalDate.parse(sc.next(), fmt);

            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            System.out.print("Duration (hours): ");
            int durationHours = sc.nextInt();

            // Instanciando um contrato
            HourContract contract = new HourContract(contractDate, valuePerHour, durationHours);
            // adicionando esse contrato ao worker
            worker.addContract(contract);
        }

        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

        sc.close();
    }
}