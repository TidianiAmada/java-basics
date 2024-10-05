package com.laminformatique.concurrent.ecommerce.service;

import com.laminformatique.concurrent.ecommerce.domain.*;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class OrderService {
    private ExecutorService executorService = Executors.newFixedThreadPool(3);

    // Step 1: Validate Order
    public CompletableFuture<Void> validateOrder(Order order) {
        return CompletableFuture.runAsync(() -> {
            System.out.println("Validating order: " + order);
            try {
                TimeUnit.SECONDS.sleep(2);  // Simulating delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Order validation complete.");
        }, executorService);
    }

    // Step 2: Process Payment
    public CompletableFuture<Void> processPayment(Payment payment) {
        return CompletableFuture.runAsync(() -> {
            System.out.println("Processing payment: " + payment);
            try {
                TimeUnit.SECONDS.sleep(3);  // Simulating payment processing delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Payment processed successfully.");
        }, executorService);
    }

    // Step 3: Send Notification
    public CompletableFuture<Void> sendNotification(Customer customer) {
        return CompletableFuture.runAsync(() -> {
            System.out.println("Sending notification to: " + customer.getEmail());
            try {
                TimeUnit.SECONDS.sleep(1);  // Simulating notification delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Notification sent to: " + customer.getEmail());
        }, executorService);
    }

    // Method to shutdown the executor
    public void shutdown() {
        executorService.shutdown();
        try {
            if (!executorService.awaitTermination(5, TimeUnit.SECONDS)) {
                executorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
        }
    }
}
