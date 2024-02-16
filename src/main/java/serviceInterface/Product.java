package serviceInterface;

public interface Product {
        String getArticle();
        String getName();
        int getQuantity();
        double getPrice();
        void decreaseQuantity(int amount);
        void increaseQuantity(int amount);
}
