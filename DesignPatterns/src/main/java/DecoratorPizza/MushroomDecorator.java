package DecoratorPizza;

public class MushroomDecorator extends PizzaToppingDecorator{
    public MushroomDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String prepare() {
        String mushroomTopping = " adding mushrooms";
        return super.prepare() + mushroomTopping;
    }

    @Override
    public double getPrice() {
        double mushroomPrice = 1.00;
        return super.getPrice() + mushroomPrice;
    }
}
