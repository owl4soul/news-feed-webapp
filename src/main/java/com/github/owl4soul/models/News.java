package com.github.owl4soul.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Entity
@Table(name = "news")
public class News {

    @Id
    @Column(name = "id_news")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @Size(min = 1, max = 127)
    @Column(name = "name_news")
    private String name;

    @NotNull
    @Column(name = "content_news")
    private String content;

    @Column(name = "date_news")
    private LocalDateTime date;


    @Column(name = "category_news")
    private String category;

    protected News() {

    }

    public News(String name, String content, LocalDateTime date, Category category) {
        this.name = name;
        this.content = content;
        this.date = date;
        this.category = category.name();
    }

    public News(String name, String content, LocalDateTime date, String category) {
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

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setCategory(Category category) {
        this.category = category.name();
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "{"
                + "ID: " + this.id + " | "
                + "NAME: " + this.name + " | "
                + "CONTENT: " + this.content + " | "
                + "DATE: " + this.date + " | "
                + "CATEGORY: " + this.category
                + "}";

    }
}
