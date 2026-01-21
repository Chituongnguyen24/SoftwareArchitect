package cart;

import product.Product;

public class CartService {

    public void addToCart(Cart cart, Product product) {
        cart.add(product);
    }
}
