package DecoratorNotification;

public class FacebookDecorator extends NotificationDecorator{
    public FacebookDecorator(Notification notification) { super(notification); }

    @Override
    public String send() {
        String facebook = "Sending notification on Facebook";
        return super.send() + " " + facebook;
    }
}
