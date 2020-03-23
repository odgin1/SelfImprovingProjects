package org.example.pattern.observer;

import java.util.List;

public class PostsMaker implements ContentMaker {
    private List<Follower> followerList;
    private String posts;

    public void register(Follower follower) {
        followerList.add(follower);
    }

    public void unregister(Follower follower) {
        followerList.remove(follower);
    }

    public void notifyFollowers() {
        followerList.forEach(Follower::update);
    }

    public void setState(String newPost) {
        posts = newPost;
        notifyFollowers();
    }

    public String getState() {
        return posts;
    }
}
