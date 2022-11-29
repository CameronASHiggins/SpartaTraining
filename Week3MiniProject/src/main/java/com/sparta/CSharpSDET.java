package com.sparta;

public class CSharpSDET implements Spartan{
    private String name;

    public CSharpSDET(String name) {
        this.name = name;
    }

    @Override
    public String spartanDoes() {
        return "A C#SDET tests and builds testing frameworks for C#";
    }

    @Override
    public String getName() {
        return this.name;
    }
}