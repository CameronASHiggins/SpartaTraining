package InterfaceExample;

public class Eagle implements Animal, CanFly{
    @Override
    public void sleep() {
        System.out.println("Eagle sleeps");
    }

    @Override
    public void eat() {
        System.out.println("Eagle devours its prey");
    }

    @Override
    public void fly() {
        System.out.println("Eagle soars into the sky");
    }
}
