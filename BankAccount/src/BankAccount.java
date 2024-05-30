public class BankAccount {
    private final int number;
    private String holder;
    private double balance;
    private int tax = 5;

    public BankAccount(int number, String holder, double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public BankAccount(int number, String holder) {
        this.number = number;
        this.holder = holder;
        this.balance = 0;
    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double value){
        this.balance += value;
    }

    public void withdraw(double value){
        this.balance -= (value+tax);
    }

    public String toString(){
        return "Account data " + number + ", Holder: " + holder + ", Balance: $ " + balance;
    }

}
