package com.laminformatique.concurrent;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureWithExecutor {
    public static void main(String[] args) {
        // Create a custom thread pool (ExecutorService)
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            System.out.println("Task running in: " + Thread.currentThread().getName());
        }, executorService);  // Pass custom executor

        future.join();  // Wait for the task to finish (optional)
        
        // Shutdown the executor service after tasks are done
        executorService.shutdown();
    }
}
