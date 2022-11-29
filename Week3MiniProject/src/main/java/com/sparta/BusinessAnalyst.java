package com.sparta;

public class BusinessAnalyst implements Spartan{
    private String name;

    public BusinessAnalyst(String name) {
        this.name = name;
    }

    @Override
    public String spartanDoes() {
        return "A business analyst analyses business";
    }

    @Override
    public String getName() {
        return this.name;
    }
}
