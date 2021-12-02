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
    
    public long getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getContent() {
        return content;
    }
    public String getAuthor() {
        return author;
    }
}
