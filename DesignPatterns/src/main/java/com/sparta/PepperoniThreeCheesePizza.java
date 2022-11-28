package com.sparta;

public class PepperoniThreeCheesePizza extends ThreeCheesePizza{
    @Override
    public String prepare() {
        String pepporoni = "adding pepperoni";
        return super.prepare() + " " + pepporoni;
    }

    @Override
    public double getPrice() {
        double pepperoniCost = 3.0;
        return super.getPrice() + pepperoniCost;
    }
}
