import product.Product;
import product.ProductService;

public class Main {
    public static void main(String[] args) {

        ProductService productService = new ProductService();

        productService.addProduct(
                new Product(1, "Laptop", 1200)
        );

        Product p = productService.getById(1);
        System.out.println(p.getName() + " - $" + p.getPrice());
    }
}
