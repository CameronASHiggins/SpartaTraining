package org.example;

public class Crossbow extends Bow{

    @Override
    public void readyShot(){
        System.out.println("Cock! Nock! Aim!");
    }

    @Override
    public String getShootsArrows(){
        return "This shoots bolts";
    }
}
