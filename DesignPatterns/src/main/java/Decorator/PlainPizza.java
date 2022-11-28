package Decorator;

public class PlainPizza implements Pizza {

    // This applies to every pizza we create
        @Override
    public String prepare() {
        return "Preparing signature thin dough";
    }

    @Override
    public double getPrice() {
        return 4.00;
    }
}
