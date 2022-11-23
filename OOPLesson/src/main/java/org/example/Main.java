package org.example;

public class Main {
    public static void main(String[] args) {
        Bow myBow = new Bow();
        Bow myFriendsBow = new Bow();
        Bow myLongbow = new Longbow();
        Bow myCrossbow = new Crossbow();
        Crossbow newCrossbow = new Crossbow();

//        System.out.println(myBow.getShootsArrows());
//        System.out.println(myCrossbow.getShootsArrows());

//        myBow.readyShot();
//        myBow.shoot();
//        myCrossbow.readyShot();
//        myCrossbow.shoot();

//        System.out.println(myBow.isCool);     // This is private and thus cannot be got
//        System.out.println(myBow.getIsCool());  // This uses the getter method to access the encapsulated information
//        System.out.println(myBow.getMaterial());
//        System.out.println(myLongbow.getMaterial());
//        myFriendsBow.setRiserColour("Yellow");
//        System.out.println(myFriendsBow.getRiserColour());
        myBow.shoot("French soldier");
        myBow.shoot("10 zone face");

    }
}