package model;

import serviceInterface.Product;

public class FoodProduct implements Product {
    private String name;
    private String article;
    private int quantity;
    private double price;

    public FoodProduct(String name, String article, int quantity, double price) {
        this.name = name;
        this.article = article;
        this.quantity = quantity;
        this.price = price;
    }
    @Override
    public String getArticle() {
        return this.article;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getQuantity() {
        return this.quantity;
    }

    @Override
    public double getPrice() {
        return this.price;
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
