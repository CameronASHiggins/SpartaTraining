package com.sparta.livenessIssues;

public class Decrement extends Thread{
    @Override
    public void run() {
        IncAndDec incAndDec = new IncAndDec();
        incAndDec.decrement();
    }
}
