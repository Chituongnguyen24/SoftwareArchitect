package order;

import cart.Cart;
import notification.EmailService;
import payment.PaymentService;

public class OrderService {

    public Order placeOrder(Cart cart) {

        if (cart.getItems().isEmpty()) {
            throw new RuntimeException("Cart is empty");
        }

        boolean paid = PaymentService.pay(cart.totalPrice());

        if (!paid) {
            throw new RuntimeException("Payment failed");
        }

        Order order = new Order(
                (int) System.currentTimeMillis(),
                cart.getItems(),
                cart.totalPrice()
        );

        // Async notification (trade-off demo)
        new Thread(() -> EmailService.send(order)).start();

        return order;
    }
}
