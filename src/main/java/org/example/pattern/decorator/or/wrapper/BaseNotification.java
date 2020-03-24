package org.example.pattern.decorator.or.wrapper;

public class BaseNotification implements Notification {

    @Override
    public void sendMessage(String message) {
        System.out.println("sent from Base:" + message);
    }
}
