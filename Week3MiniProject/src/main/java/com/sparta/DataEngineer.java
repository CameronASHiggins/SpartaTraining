package com.sparta;

public class DataEngineer implements Spartan{
    private String name;

    public DataEngineer(String name) {
        this.name = name;
    }

    @Override
    public String spartanDoes() {
        return "A data engineer works with data";
    }

    @Override
    public String getName() {
        return this.name;
    }
}