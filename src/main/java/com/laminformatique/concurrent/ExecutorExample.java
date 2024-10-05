package com.laminformatique.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ExecutorExample {
    public static void main(String[] args) {
        // Creating an Executor instance
        Executor executor = Executors.newSingleThreadExecutor();
        
        // Submitting a task for execution
        executor.execute(() -> {
            System.out.println("Task executed using Executor in thread: " + Thread.currentThread().getName());
        });

        System.out.println("Main thread: " + Thread.currentThread().getName());
    }
}
