package DecoratorNotification;

public abstract class NotificationDecorator implements Notification{

    protected Notification notification;

    public NotificationDecorator(Notification notification){
        this.notification = notification;
    }

    @Override
    public String send() {
        return notification.send();
    }
}
