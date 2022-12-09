package com.sparta.livenessIssues;

public class Driver {
    public static void main(String[] args) {
//        System.out.println(IncAndDec.value);
//        IncAndDec.increment();
//        System.out.println(IncAndDec.value);
//        IncAndDec.decrement();
//        System.out.println(IncAndDec.value);



        for (int i = 0; i < 10 ; i++) {
            Thread inc = new Increment();
            Thread dec = new Decrement();
            inc.start();
            dec.start();
        }

        System.out.println(IncAndDec.value);

        //fox1 eats first then drinks
        //fox2 drinks first then eats
        //neither likes to share
        //neither will finish what they are doing until they have access to the next resource

    }
}
