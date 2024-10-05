package com.laminformatique.concurrent.synchrone;

public class SynchronizedExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        Runnable customer1 = () -> {
            account.deposit(500);
            account.withdraw(300);
        };

        Runnable customer2 = () -> {
            account.deposit(200);
            account.withdraw(700);
        };

        Thread thread1 = new Thread(customer1, "Bineta Dieng");
        Thread thread2 = new Thread(customer2, "Mouhamed Ndiaye");

        thread1.start();
        thread2.start();
    }
}