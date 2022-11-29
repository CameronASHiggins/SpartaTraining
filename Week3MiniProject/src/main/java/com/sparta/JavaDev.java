package com.sparta;

public class JavaDev implements Spartan{
    private String name;
    public JavaDev(String name) {
        this.name = name;
    }

    @Override
    public String spartanDoes() {
        return "A Java developer develops software in Java";
    }

    @Override
    public String getName() {
        return this.name;
    }
}