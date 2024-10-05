package com.laminformatique.concurrent.synchrone;

public class ThreadDemo extends Thread{
    public static void main(String[] args) {
        ThreadDemo demo= new ThreadDemo();
        demo.run();

        ThreadDemo demo2= new ThreadDemo();
        demo.run();

    }

    @Override
    public void run() {
        System.out.println("Salut Mouhamed");
    }
}
