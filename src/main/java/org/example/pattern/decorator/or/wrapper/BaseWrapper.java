package org.example.pattern.decorator.or.wrapper;

public abstract class BaseWrapper implements Notification {

  private Notification notification;

  public BaseWrapper(Notification notification) {
    this.notification = notification;
  }

  @Override
  public void sendMessage(String message) {
    notification.sendMessage(message);
  }
}
