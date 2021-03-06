package org.example.pattern.observer.or.listener;

public interface ContentMaker {
    void register(Follower follower);
    void unregister(Follower follower);
    void notifyFollowers();
    void setState(String newPost);
    String getState();
}
