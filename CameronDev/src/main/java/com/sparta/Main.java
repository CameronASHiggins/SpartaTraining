package com.sparta;

import java.util.Comparator;

public class Main {

    public static boolean airportOpen;

    public static void main(String[] args) {
//        DayIndex dayOfWeek;
//        dayOfWeek = DayIndex.SUNDAY;
//
//        if(dayOfWeek == DayIndex.SATURDAY || dayOfWeek == DayIndex.SUNDAY) {
//            System.out.println("It's the weekend");
//        }
//        else {
//            System.out.println("It's a weekday");
//        }

//        Size size = Size.SMALL;
//        System.out.println("Size: " + size.getPizzaSize());
//        System.out.println(Size.SMALL.ordinal());
//        System.out.println("Calories: " + size.getPizzaCalories());
//        System.out.println("Energy: " + size.getEnergyInJoules() + " Joules");
//
//        System.out.println("Energy of a medium pizza: " + Size.valueOf("MEDIUM").getEnergyInJoules());
//        System.out.println("Energy of a medium pizza: " + Size.MEDIUM.getEnergyInJoules());

        Customer c1 = new Customer("Craig", "Wroe");
        Customer c2 = new Customer("Craig", "Wroe");
        Customer c3 = new Customer("Craig", "Wroe");
        Customer c4 = new Customer("Ignas", "Stepura");
//
//        if (c1.equals(c2)){
//            System.out.println("These are the same customer");
//        } else {
//            System.out.println("These are not the same customer");
//        }
//
//        if (c1 == c2) {     //Are these references pointing to the same object -- i.e. the same location in memory
//            System.out.println("These are the same customer");
//        } else {
//            System.out.println("These are not the same customer");      // These are not the same object
//        }

        //Test the equals() contract
        //reflexive
        System.out.println("Testing reflexivity");
        System.out.println(c1.equals(c2));

        //Symmetric
        System.out.println("Testing symmetry");
        System.out.println(c2.equals(c1));

        //Transitive
        System.out.println("Testing transiency");
        System.out.println(c1.equals(c2) && c2.equals(c3) && c1.equals(c3));

        //consistent
        System.out.println("Testing consistency");
        for (int i = 0; i<10;i++ ){
            System.out.println(c1.equals(c2));
        }

        //test the hachcode() contract
        System.out.println("Testing the hashcode equals consistency");
        System.out.println(c1.hashCode() - c2.hashCode()); // Should be zero

    }
}
