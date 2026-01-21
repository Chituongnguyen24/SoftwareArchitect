import logging.LogManager;
import user.UserService;
import order.OrderService;

public class Main {
    public static void main(String[] args) {

        UserService userService = new UserService();
        OrderService orderService = new OrderService();

        userService.login("chi_tuong");
        orderService.createOrder(101);

        LogManager log1 = LogManager.getInstance();
        LogManager log2 = LogManager.getInstance();

        System.out.println("log1 hash: " + log1.hashCode());
        System.out.println("log2 hash: " + log2.hashCode());
    }
}
