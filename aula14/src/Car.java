public class Car {
    // Atributos
    private String make;
    private double price;
    private int year;
    private static int numCars;

    // Construtor
    public Car(String make, double price, int year){
        this.make = make;
        this.price = price;
        this.year = year;
        numCars++;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static int getNumCars() {
        return numCars;
    }

    // Métodos Adicionais
    void drive(){
        System.out.println("You drive the car!");
    }

    void brake(){
        System.out.println("You brake the car!");
    }

    public String toString(){
        return make + "\n" + price+ "\n" + year+ "\n";
    }

}
