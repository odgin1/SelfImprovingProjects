package org.example.pattern.decorator.or.wrapper;

public class GoogleNotificationWrapper extends BaseWrapper {
    public GoogleNotificationWrapper(Notification notification) {
        super(notification);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Sent to Google: " + message);
        super.sendMessage(message);
    }
}
