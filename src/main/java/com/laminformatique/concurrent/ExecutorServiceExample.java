package com.laminformatique.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        // Creating a thread pool of 3 threads
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        
        // Submitting tasks to be executed
        for (int i = 1; i <= 5; i++) {
            final int taskNumber = i;
            executorService.submit(() -> {
                System.out.println("Task " + taskNumber + " executed in thread: " + Thread.currentThread().getName());
            });
        }

        // Shutdown the executor
        executorService.shutdown();
    }
}
