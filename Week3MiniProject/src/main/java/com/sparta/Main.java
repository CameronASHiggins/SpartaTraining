package com.sparta;

public class Main {
    public static void main(String[] args) {
        Spartan spartanJavaDev = new SpartanFactory().getSpartan("javadev", "A more useful name");
        SpartanFactory xf = new SpartanFactory();
        Spartan x = xf.getSpartan("businessanalyst", "Dave");

        System.out.println(spartanJavaDev.spartanDoes());
        System.out.println(spartanJavaDev.getName());
        System.out.println(x.spartanDoes());
        System.out.println(x.getName());

        System.out.println(spartanJavaDev.getClass());

    }
}