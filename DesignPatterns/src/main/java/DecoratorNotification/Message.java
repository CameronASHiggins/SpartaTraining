package DecoratorNotification;

public class Message implements Notification{
    @Override
    public String send() {
        return "Test message";
    }
}
