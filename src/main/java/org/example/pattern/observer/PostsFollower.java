package org.example.pattern.observer;

public class PostsFollower implements Follower {
    private PostsMaker postsMaker;
    private String name;

    public PostsFollower(PostsMaker postsMaker, String name) {
        this.postsMaker = postsMaker;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void update() {
        System.out.println(String.format("I have received following post %s", postsMaker.getState()));
    }
}
