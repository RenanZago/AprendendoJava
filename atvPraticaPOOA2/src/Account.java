public class Account {
    private Transaction transaction;

    public Account(Transaction transaction) {
        this.transaction = transaction;
    }

    public void deposit(double amount) {
        transaction.deposit(amount);
    }

    public void withdraw(double amount) {
        transaction.withdraw(amount);
    }

}
