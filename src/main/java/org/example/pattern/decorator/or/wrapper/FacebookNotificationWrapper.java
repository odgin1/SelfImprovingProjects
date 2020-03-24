package org.example.pattern.decorator.or.wrapper;

public class FacebookNotificationWrapper extends BaseWrapper {
    public FacebookNotificationWrapper(Notification notification) {
        super(notification);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Sent to Facebook: " + message);
        super.sendMessage(message);
    }
}
