package InterfaceExample;

public class Goose extends Bird{
    @Override
    public void sleep() {
        System.out.println("Goose sleeps with subtle honks");
    }

    @Override
    public void eat() {
        System.out.println("Goose eats");
    }
}
