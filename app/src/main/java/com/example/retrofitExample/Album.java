package com.example.retrofitExample;

public class Album {
    private Integer id;
    private int userId;
    private String title;

    public Album(int userId, String title) {
        this.userId = userId;
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public String getTitle() {
        return title;
    }
}
