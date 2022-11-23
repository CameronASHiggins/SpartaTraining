package org.example;

public class FordFiesta extends Car{

    @Override // Method overriding
    public void honk(){
        System.out.println("Fanfare honk sounds!");
    }

    public void honk(String volume){ // Method Overloading
        System.out.println("Honk sounds " + volume);
    }
}
