package org.example.pattern.strategy;

public class EatingSlowStrategy implements EatingStrategy {
  public void eat() {
    System.out.println("I'm eating slow");
  }
}
