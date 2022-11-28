package Decorator;

public class PepperoniDecorator extends PizzaToppingDecorator{

    public PepperoniDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String prepare() {
        String pepperoni = " adding pepperoni";
        return super.prepare() + pepperoni;
    }

    @Override
    public double getPrice() {
        double pepperoniPrice = 3.00;
        return super.getPrice() + pepperoniPrice;
    }
}
