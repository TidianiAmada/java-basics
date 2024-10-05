package com.laminformatique.concurrent;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {
    public static void main(String[] args) {
        System.out.println("Main thread starts: " + Thread.currentThread().getName());

        // Asynchronous task
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            try {
                // Simulate a long-running task
                Thread.sleep(2000);
                System.out.println("Task finished in thread: " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Another task in the main thread
        System.out.println("Main thread continues execution.");

        // Wait for the async task to finish (optional, for demo purposes)
        future.join();  
    }
}
