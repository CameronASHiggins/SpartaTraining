package com.sparta;

public class JavaSDET implements Spartan{

    private String name;

    public JavaSDET(String name) {
        this.name = name;
    }

    @Override
    public String spartanDoes() {
        return "A JavaSDET tests and builds testing frameworks for Java";
    }

    @Override
    public String getName() {
        return this.name;
    }
}