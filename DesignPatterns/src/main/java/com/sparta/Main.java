package com.sparta;

public class Main {
    public static void main(String[] args) {
        ThreeCheesePizza tcPizza = new ThreeCheesePizza();
        PepperoniThreeCheesePizza ptcPizza = new PepperoniThreeCheesePizza();
        System.out.println(tcPizza.prepare());
        System.out.println(tcPizza.getPrice());
        System.out.println(ptcPizza.prepare());
        System.out.println(ptcPizza.getPrice());
    }
}