package com.sparta;

public abstract class Pizza {
    // describe the pizza you have made

    public String prepare(){
        return "Preparing signature thin dough";
    }

    // gets the price
    public double getPrice(){
        // base price of pizza
        return 4.00;
    }
}
