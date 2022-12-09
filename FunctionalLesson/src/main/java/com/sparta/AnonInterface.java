package com.sparta;
@FunctionalInterface
public interface AnonInterface {
    void doSomething();
    default void doingSomethingElse(){
        System.out.println("We are doing something else!");
    }
}
