package com.sparta;

public class SyncClass {

    public static void syncMethod() throws InterruptedException{
        System.out.println("Inside the sync method");
        Thread.sleep(4000);
        System.out.println("Still running this thread");
        System.out.println("Still hold the lock for the method");
        System.out.println("Giving up the lock now");
    }
}
