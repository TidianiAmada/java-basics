package com.laminformatique.concurrent.ecommerce;

import com.laminformatique.concurrent.ecommerce.domain.Customer;
import com.laminformatique.concurrent.ecommerce.domain.Order;
import com.laminformatique.concurrent.ecommerce.domain.Payment;
import com.laminformatique.concurrent.ecommerce.service.OrderService;

import java.util.concurrent.CompletableFuture;

public class OrderApp {
    public static void main(String[] args) {
        // Create instances of customer, order, and payment
        Customer customer = new Customer("Samuel", "samuele@gmail.com");
        Order order = new Order("P001", 2, 50.0);  // Product ID, Quantity, Price per unit
        Payment payment = new Payment("Credit Card", order.getTotalPrice());

        // Create the OrderService to manage async tasks
        OrderService orderService = new OrderService();

        // Asynchronously process the order workflow
        CompletableFuture<Void> orderWorkflow = orderService.validateOrder(order)
            .thenCompose(validated -> orderService.processPayment(payment))
            .thenCompose(paymentProcessed -> orderService.sendNotification(customer));

        // Block and wait for the entire workflow to complete
        orderWorkflow.join();

        System.out.println("Order workflow completed successfully.");

        // Shutdown the executor service
        orderService.shutdown();
    }
}
