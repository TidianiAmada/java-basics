package com.laminformatique.concurrent.ecommerce.domain;

public class Payment {
    private String paymentMethod;
    private double amount;

    public Payment(String paymentMethod, double amount) {
        this.paymentMethod = paymentMethod;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Payment [Method: " + paymentMethod + ", Amount: $" + amount + "]";
    }
}