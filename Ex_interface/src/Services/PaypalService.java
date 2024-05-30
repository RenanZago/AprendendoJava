package Services;

public class PaypalService implements OnlinePaymentService {
    public double paymentFee(double amount){
        return (0.02 * amount);
    }
    public double interest(double amount, int months) {
        return (0.01 * amount) * months;
    }
}
