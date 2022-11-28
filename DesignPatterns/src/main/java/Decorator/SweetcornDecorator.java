package Decorator;

public class SweetcornDecorator extends PizzaToppingDecorator{
    public SweetcornDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String prepare() {
        String sweetcornTopping = " adding sweetcorn";
        return super.prepare() + sweetcornTopping;
    }

    @Override
    public double getPrice() {
        double sweetcornPrice = 1.00;
        return super.getPrice() + sweetcornPrice;
    }
}
