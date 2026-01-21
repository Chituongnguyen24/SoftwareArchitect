package order;

import product.Product;
import java.util.List;

public class Order {
    private int orderId;
    private List<Product> items;
    private double total;

    public Order(int orderId, List<Product> items, double total) {
        this.orderId = orderId;
        this.items = items;
        this.total = total;
    }

    public int getOrderId() {
        return orderId;
    }

    public double getTotal() {
        return total;
    }
}
