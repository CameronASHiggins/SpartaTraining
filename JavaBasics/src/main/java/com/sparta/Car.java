package com.sparta;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Car {
    public Car(){
        super();
        int numberOfWheels = 4;
        String colourOfChassis = "red";
    }

    public Car(int i, String s){
        numberOfWheels = i;
        colourOfChassis = s;
    }

    int numberOfWheels = 4;
    String colourOfChassis = "red";
    int licenseNumber;

    public static void honkHorn(){
        System.out.println("Loud horn");
    }

    public List<String> getDetails(){
        List<String> list = new ArrayList<>();
        list.add(Integer.toString(numberOfWheels));
        list.add(colourOfChassis);
        return list;
    }
    public void getInfo(){
        System.out.println(numberOfWheels);
        System.out.println(colourOfChassis);
    }
}
