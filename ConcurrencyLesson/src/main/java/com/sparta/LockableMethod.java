package com.sparta;

public class LockableMethod {

    public synchronized void goAndThenWait() throws InterruptedException{
        System.out.println("Acquired the lock and inside the method");
//        this.wait();
    }
}
