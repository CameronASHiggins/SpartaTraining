package org.example;

public class Car {
    private int numberOfWheels = 4;
    private String colour = "pink";

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    void honk(){
        System.out.println("Very loud horn");
    }

    @Override
    public String toString(){
        return ("This car has " + this.getNumberOfWheels() + " wheels and is painted " + this.getColour());
    }
}
