package model;

import serviceInterface.Product;

public class ElectronicsProduct implements Product {

    private String name;
    private String article;
    private int quantity;
    private double price;

    @Override
    public String toString() {
        return "ElectronicsProduct{" +
                "name='" + name + '\'' +
                ", article='" + article + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

    public ElectronicsProduct(String name, String article, int quantity, double price) {
        this.name = name;
        this.article = article;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String getArticle() {
        return article;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void decreaseQuantity(int amount) {
        this.quantity -= amount;
    }

    @Override
    public void increaseQuantity(int amount) {
        this.quantity += amount;
    }
}
