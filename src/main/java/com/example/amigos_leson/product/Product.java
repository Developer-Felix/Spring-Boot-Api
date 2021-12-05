package com.example.amigos_leson.product;

import java.time.LocalDate;

public class Product {
    private Long id;
    private String name;
    private String description;
    private Double price;
    private String added_by;
    private LocalDate date_added;
    private LocalDate date_updated;

    public Product(){}

    public Product(Long id,
                   String name,
                   String description,
                   Double price,
                   String added_by,
                   LocalDate date_added,
                   LocalDate date_updated) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.added_by = added_by;
        this.date_added = date_added;
        this.date_updated = date_updated;
    }

    public Product(String name,
                   String description,
                   Double price,
                   String added_by,
                   LocalDate date_added,
                   LocalDate date_updated) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.added_by = added_by;
        this.date_added = date_added;
        this.date_updated = date_updated;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getAdded_by() {
        return added_by;
    }

    public void setAdded_by(String added_by) {
        this.added_by = added_by;
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
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", added_by='" + added_by + '\'' +
                ", date_added=" + date_added +
                ", date_updated=" + date_updated +
                '}';
    }
}
