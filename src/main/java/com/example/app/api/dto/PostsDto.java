package com.example.app.api.dto;

public class PostsDto {

    private long id;

    private String title;

    private String content;

    private String author;

    public PostsDto(long id, String title, String content, String author) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getId() {
        return id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle(String title) {
        return title;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getContent() {
        return content;
    }
    public void setAuhtor(String author) {
        this.author = author;
    }
    public String getAuhtor(String author) {
        return author;
    }
}
