package org.example.pattern.decorator.or.wrapper;

public class EmailNotificationWrapper extends BaseWrapper {
    public EmailNotificationWrapper(Notification notification) {
        super(notification);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Sent to Email: " + message);
        super.sendMessage(message);
    }
}
