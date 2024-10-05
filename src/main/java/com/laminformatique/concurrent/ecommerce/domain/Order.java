package com.laminformatique.concurrent.ecommerce.domain;

public class Order {
    private String productId;
    private int quantity;
    private double price;

    public Order(String productId, int quantity, double price) {
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
    }

    public double getTotalPrice() {
        return quantity * price;
    }

    @Override
    public String toString() {
        return "Order [Product ID: " + productId + ", Quantity: " + quantity + ", Total Price: $" + getTotalPrice() + "]";
    }
}