package com.sparta;

public class Starter {

    public static void start(){
//        DateParser d1 = new DateParser();
//        System.out.println(d1.convertToDate("2022-11-29"));
        Cat newCat = new Cat();
        System.out.println(newCat.meow("Fudge"));
        System.out.println(newCat.meow(null));
    }
}
