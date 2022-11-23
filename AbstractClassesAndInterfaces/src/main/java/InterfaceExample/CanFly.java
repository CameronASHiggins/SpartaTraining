package InterfaceExample;

public interface CanFly {
//    public abstract void fly(); //implicitly methods in an interface are both public and abstract, this makes declaring these keywords redundant

    default void fly(){
        System.out.println("Generic/default implementation of fly() method");
    }
}
