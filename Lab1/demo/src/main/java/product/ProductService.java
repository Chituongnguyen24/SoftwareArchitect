package product;

import infrastructure.ProductRepository;
import java.util.List;

public class ProductService {

    private ProductRepository repo = new ProductRepository();

    public void addProduct(Product product) {
        repo.save(product);
    }

    public Product getById(int id) {
        return repo.findById(id);
    }

    public List<Product> getAll() {
        return repo.findAll();
    }
}
