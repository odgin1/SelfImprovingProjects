package org.example.pattern.strategy;

public class EnglishQuackStrategy implements QuackingStrategy {

  public void quack() {
    System.out.println("Quack, Quack!!!");
  }
}
