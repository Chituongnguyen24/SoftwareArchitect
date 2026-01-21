package notification;

import order.Order;

public class EmailService {

    public static void send(Order order) {
        try {
            Thread.sleep(1000);
            System.out.println("Email sent for order " + order.getOrderId());
        } catch (InterruptedException e) {
            System.out.println("Email failed");
        }
    }
}
