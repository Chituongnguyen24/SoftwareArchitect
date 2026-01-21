package cart;

import product.Product;
import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> items = new ArrayList<>();

    public void add(Product product) {
        items.add(product);
    }

    public List<Product> getItems() {
        return items;
    }

    public double totalPrice() {
        return items.stream().mapToDouble(Product::getPrice).sum();
    }
}
