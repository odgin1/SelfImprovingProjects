package org.example.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsMaker implements ContentMaker {
    private List<Follower> followerList = new ArrayList<>();
    private String news;

    public void register(Follower follower) {
        followerList.add(follower);
        System.out.println(String.format("%s subscribed to the news", follower.getName()));
    }

    public void unregister(Follower follower) {
        followerList.remove(follower);
        System.out.println(String.format("%s unsubscribed", follower.getName()));
    }

    public void notifyFollowers() {
        followerList.forEach(Follower::update);
    }

    public void setState(String freshNews) {
        news = freshNews;
        notifyFollowers();
    }

    public String getState() {
        return news;
    }
}
