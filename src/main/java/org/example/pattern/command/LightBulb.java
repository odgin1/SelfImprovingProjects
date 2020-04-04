package org.example.pattern.command;

public class LightBulb {
  public void on() {
    System.out.println("Light is turned on");
  }

  public void off() {
    System.out.println("Light is turned off");
  }

  public void dim() {
    System.out.println("Dimming the light");
  }

  public void brighten() {
    System.out.println("Brightening the light");
  }
}
