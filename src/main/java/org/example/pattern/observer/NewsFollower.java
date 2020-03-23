package org.example.pattern.observer;

public class NewsFollower implements Follower {
    private String name;

    private NewsMaker newsMaker;
    public NewsFollower(NewsMaker newsMaker, String name) {
        this.newsMaker = newsMaker;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void update() {
        System.out.println(String.format("%s: I have received following news:%n     %s",name, newsMaker.getState()));
    }
}
