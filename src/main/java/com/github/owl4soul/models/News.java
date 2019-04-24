package com.github.owl4soul.models;

import java.sql.Timestamp;

public class News {
    private String name;
    private String content;
    private Timestamp date;
    private Category category;

    public News(String name, String content, Timestamp date, Category category) {
        this.name = name;
        this.content = content;
        this.date = date;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
