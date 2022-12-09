package com.sparta;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        try {
            synchronized (SyncClass.class){
                SyncClass.syncMethod();
            }
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
