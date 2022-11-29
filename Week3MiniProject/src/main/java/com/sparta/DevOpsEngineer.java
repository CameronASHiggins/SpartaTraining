package com.sparta;

public class DevOpsEngineer implements Spartan{
    private String name;

    public DevOpsEngineer(String name) {
        this.name = name;
    }

    @Override
    public String spartanDoes() {
        return "A dev ops engineer builds, tests and maintains infrastructure";
    }

    @Override
    public String getName() {
        return this.name;
    }
}