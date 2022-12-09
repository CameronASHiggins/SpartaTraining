package com.sparta;

public class Main {

    public SyncClass sClass = new SyncClass();
    public static void main(String[] args) throws InterruptedException {
//        MyThread myThread = new MyThread();
//        myThread.start();

        MyRunnable myRunnable = new MyRunnable();
//        Thread clearlyNamedThread = new Thread(myRunnable);
        Thread clearlyNamedThread = new Thread(new MyRunnable()); // Oh, look! It's the decorator pattern

        clearlyNamedThread.start();
//        clearlyNamedThread.join(); // makes the thread this was called from wait for this thread to finish before continuing
        System.out.println("Main thread still running");
        Thread.sleep(1000);
        SyncClass.syncMethod();
        System.out.println("main thread");

    }
}