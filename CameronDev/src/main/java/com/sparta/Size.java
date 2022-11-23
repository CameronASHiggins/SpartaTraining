package com.sparta;

public enum Size {
    SMALL("Small pizza", 100),
    MEDIUM("Medium pizza", 180),
    LARGE("Large pizza", 230),
    EXTRALARGE("Extra large pizza", 400);

    private final String pizzaSize;

    private final int pizzaCalories;

    private Size(String pizzaSize, int pizzaCalories){
        this.pizzaSize = pizzaSize;
        this.pizzaCalories = pizzaCalories;
    }

    public String getPizzaSize(){
        return pizzaSize;
    }

    public int getPizzaCalories(){
        return pizzaCalories;
    }

    public int getEnergyInJoules(){
        return (int) (pizzaCalories * 4.184);
    }
}
