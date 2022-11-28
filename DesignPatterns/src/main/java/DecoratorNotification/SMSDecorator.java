package DecoratorNotification;

public class SMSDecorator extends NotificationDecorator{

    public SMSDecorator(Notification notification) {
        super(notification);
    }

    @Override
    public String send() {
        String sms = "Sending notification over SMS";
        return super.send() + " " + sms;
    }
}
