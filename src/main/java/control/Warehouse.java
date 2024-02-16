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
        StringBuilder articles = new StringBuilder();
        for (Product product : products) {
            articles.append(product.getArticle()).append(", ");
        }
        return articles.toString();
    }

    @Override
    public String getName() {
        StringBuilder names = new StringBuilder();
        for (Product product : products) {
            names.append(product.getName()).append(", ");
        }
        return names.toString();
    }

    public int getQuantity() {
        int totalQuantity = 0;
        for (Product product : products) {
            totalQuantity += product.getQuantity();
        }
        return totalQuantity;
    }

    @Override
    public double getPrice() {
        double totalPrice = 0.0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }
}
