package DecoratorNotification;

public class SlackDecorator extends NotificationDecorator{
    public SlackDecorator(Notification notification) { super(notification); }

    @Override
    public String send() {
        String slack = "Sending notification over Slack";
        return super.send() + " " + slack;
    }
}
