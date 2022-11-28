package DecoratorPizza;

public class Main {
    public static void main(String[] args) {
        Pizza mushroomPepperoniPizza = new MushroomDecorator(new PepperoniDecorator(new PlainPizza()));

        System.out.println(mushroomPepperoniPizza.prepare());
        System.out.println(mushroomPepperoniPizza.getPrice());
    }
}
