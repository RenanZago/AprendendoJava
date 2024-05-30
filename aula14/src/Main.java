public class Main {
    public static void main(String[] args) {

        // Criando instâncias da classe Car
        Car car1 = new Car("FERRARI", 4000000, 2024);
        Car car2 = new Car("AUDI", 3500000, 2022);
        Car car3 = new Car("aaaa", 3500000, 2042);


        System.out.println(car1.getMake());
        System.out.println(car1.getPrice());
        System.out.println(car1.getYear());

        car1.drive();
        car2.brake();

        // Testando método toString sobrescrito
        System.out.println(car1);

        // Array de objetos
        Car[] cars = {car1,car2};
        for (Object car : cars){
            System.out.println(car);
        }

        System.out.println("numero de carros: " + Car.getNumCars());
    }
}