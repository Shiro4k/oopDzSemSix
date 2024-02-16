package control;

import serviceInterface.Product;

public class Order {
    public void processOrder(Product product, int amount) {
        int currentQuantity = product.getQuantity();
        if (currentQuantity >= amount) {
            product.decreaseQuantity(amount);
            System.out.println("Заказ Одобрен");
        }
        else {
            System.out.println("Товара недостаточно на складе!");
        }
    }
}
