package InterfaceExample;

public class Pig implements Animal{
    @Override
    public void sleep() {
        System.out.println("Pig falls asleep zzzzzzzz");
    }

    @Override
    public void eat() {
        System.out.println("Pig chows down");
    }

}
