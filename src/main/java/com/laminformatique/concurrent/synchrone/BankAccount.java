package com.laminformatique.concurrent.synchrone;

import java.util.concurrent.Callable;

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Synchronized method to ensure thread-safe deposit operation
    public synchronized void deposit(double amount) {
        System.out.println(Thread.currentThread().getName() + " is depositing: " + amount);
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " new balance: " + balance);
    }

    // Synchronized method to ensure thread-safe withdrawal operation
    public synchronized void withdraw(double amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is withdrawing: " + amount);
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " new balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " - Insufficient balance.");
        }
    }

    public synchronized double getBalance() {
        return balance;
    }
}