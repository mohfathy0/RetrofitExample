package com.example.retrofitExample;

public class Post {

    private Integer id;
    private int userId;
    private String title;
    private String body;

    public Post(int userId, String title, String body) {
        this.userId = userId;
        this.title = title;
        this.body = body;
    }

    public int getId() {
        return id;
    }
}
