package org.example.pattern.strategy;

public class DuckClient {
    private String name;
    private String age;
    private EatingStrategy eatingStrategy;
    private QuackingStrategy quackingStrategy;

    public DuckClient() {
    }

    public DuckClient(String name, String age, EatingStrategy eatingStrategy, QuackingStrategy quackingStrategy) {
        this.name = name;
        this.age = age;
        this.eatingStrategy = eatingStrategy;
        this.quackingStrategy = quackingStrategy;
    }

    public void eat(){
        eatingStrategy.eat();
    }

    public void quack(){
        quackingStrategy.quack();
    }

    @Override
    public String toString() {
        return name + " " + age + " ";
    }
}
