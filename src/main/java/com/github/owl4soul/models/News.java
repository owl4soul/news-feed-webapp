package com.github.owl4soul.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Timestamp;
import java.time.LocalDate;

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
    private LocalDate date;

    @Column(name = "category_news")
    private Category category;

    public News() {
    }

    public News(String name, String content, LocalDate date, Category category) {
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
