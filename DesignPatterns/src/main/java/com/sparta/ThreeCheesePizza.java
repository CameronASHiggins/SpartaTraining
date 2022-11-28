package com.sparta;

public class ThreeCheesePizza extends Pizza{
    @Override
    public String prepare() {
        String cheese = "adding three cheeses to pizza";
        return super.prepare() + " " + cheese;
    }
}
