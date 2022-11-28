package DecoratorNotification;

public class Main {
    public static void main(String[] args) {
        Notification facebookNotification = new FacebookDecorator(new Message());
        Notification facebookSlackSMSNotification = new FacebookDecorator(new SlackDecorator(new SMSDecorator(new Message())));

        System.out.println(facebookNotification.send());
        System.out.println(facebookSlackSMSNotification.send());
    }
}
