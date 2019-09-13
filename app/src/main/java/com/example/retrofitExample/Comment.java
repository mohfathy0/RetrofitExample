package com.example.retrofitExample;

public class Comment {
    private Integer id;
    private int postId;
    private String name;
    private String email;
    private String body;

    public Comment(int postId, String name, String email, String body) {
        this.postId = postId;
        this.name = name;
        this.email = email;
        this.body = body;
    }

    public Integer getId() {
        return id;
    }
}
