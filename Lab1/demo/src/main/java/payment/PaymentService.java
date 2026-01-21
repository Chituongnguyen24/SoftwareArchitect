package payment;

public class PaymentService {

    public static boolean pay(double amount) {
        System.out.println("Processing payment: $" + amount);
        return true; // demo success
    }
}
