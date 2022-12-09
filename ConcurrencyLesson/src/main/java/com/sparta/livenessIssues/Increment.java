package com.sparta.livenessIssues;

public class Increment extends Thread{
    @Override
    public void run() {
        IncAndDec incAndDec = new IncAndDec();
        incAndDec.increment();
    }
}
