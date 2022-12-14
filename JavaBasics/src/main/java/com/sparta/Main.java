package com.sparta;

public class Main extends Bike {
    static int newInt;
    static char newChar;
    public static void main(String[] args) {
        byte myByte = 2;
        short myShort = 3;
        int myIndex = 1;
        long myLong = 4;

        float myFloat = 1.0f;
        Double myDouble = 2.0;

        char myChar = 'c';

        boolean myBoolean = true;

        String myString = "example of a string";

        int a = 5;
        int b = 17;
        float c = 17.0f;

/*
        System.out.println(b/a); //Example of int division - expected answer 3
        System.out.println(c/a); //Example of promotion (var 'a' is promoted to larger type so that division can be performed with floats)
        System.out.println((double) b / a); //Example of casting - var 'a' is then promoted
        if (a > 2) {
            System.out.println("a is bigger than 2");
        }
*/
        Car redCar1 = new Car();
        Car blueCar1 = new Car();
        Car pinkCar1 = new Car();
        redCar1.licenseNumber = 1234;
        blueCar1.licenseNumber = 2468;
        pinkCar1.licenseNumber = 1357;
        redCar1.honkHorn();
        Car.honkHorn();

        System.out.println(redCar1.licenseNumber + " " + blueCar1 + " " + pinkCar1.licenseNumber);
    }
}