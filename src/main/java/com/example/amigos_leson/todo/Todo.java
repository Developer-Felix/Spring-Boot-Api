package com.example.amigos_leson.todo;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Todo {
    @Id
    @SequenceGenerator(
            name = "todo_sequence",
            sequenceName = "todo_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "todo_sequence"
    )
    private Long id;
    private String title;
    private String content;
    private LocalDate date_added;
    private LocalDate date_updated;

    public Todo(){}

    public Todo(Long id, String title, String content, LocalDate date_added, LocalDate date_updated) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.date_added = date_added;
        this.date_updated = date_updated;
    }

    public Todo(String title, String content, LocalDate date_added, LocalDate date_updated) {
        this.title = title;
        this.content = content;
        this.date_added = date_added;
        this.date_updated = date_updated;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getDate_added() {
        return date_added;
    }

    public void setDate_added(LocalDate date_added) {
        this.date_added = date_added;
    }

    public LocalDate getDate_updated() {
        return date_updated;
    }

    public void setDate_updated(LocalDate date_updated) {
        this.date_updated = date_updated;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", date_added=" + date_added +
                ", date_updated=" + date_updated +
                '}';
    }
}
