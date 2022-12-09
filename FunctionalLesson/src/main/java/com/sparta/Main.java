package com.sparta;

//import java.util.function.Consumer;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        AnonInterface anonInterface = () -> System.out.println("We are doing something!");
//        anonInterface.doSomething();
//        anonInterface.doingSomethingElse();
//        AnonInterface anotherAnonInterface = () -> System.out.println("Polymorphism rules!");
//        anotherAnonInterface.doSomething();
//        Consumer<String> c = (string) -> System.out.println(string);
//        c.accept("Howdy Consumer");

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Cameron","Alexander","Sidney","Higgins"));
        names.stream().filter(n -> n.contains("e")).map(x -> x.toUpperCase()).forEach(s -> System.out.println(s));
        System.out.println(names.stream().filter(n -> n.contains("e")).map(x -> x.toUpperCase()).findFirst().get());
//        System.out.println(names.stream().filter(n -> n.contains("e")).map(x -> x.toUpperCase()).toList());
    }
}