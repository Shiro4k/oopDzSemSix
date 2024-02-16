package control;
import java.util.ArrayList;
import java.util.List;
import serviceInterface.Product;

public class Warehouse implements Product{
    private List<Product> products;
    public Warehouse() {
        this.products = new ArrayList<>();
    }
    public void addProduct(Product product) {
        products.add(product);
    }
    public void removeProduct(Product product) {
        products.remove(product);
    }
    public void decreaseQuantity(int amount){
        for (Product product : products) {
            product.decreaseQuantity(amount);
        }
    }
    public void increaseQuantity(int amount){
        for (Product product : products) {
            product.increaseQuantity(amount);
        }
    }
    public Product findProductByArticle(String article) {
        for (Product product : products) {
            if (product.getArticle().equals(article)) {
                return product;
            }
        }
        return null;
    }
    @Override
    public String getArticle() {
        return products.get(0).getArticle();
    }

    @Override
    public String getName() {
        return products.get(0).getName();
    }

    @Override
    public int getQuantity() {
        return products.get(0).getQuantity();
    }

    @Override
    public double getPrice() {
        return products.get(0).getPrice();
    }
}
