package infrastructure;

import user.User;
import product.Product;
import java.util.HashMap;
import java.util.Map;

public class InMemoryDatabase {
    public static Map<Integer, User> users = new HashMap<>();
    public static Map<Integer, Product> products = new HashMap<>();
}
