package org.example.entities;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Book extends Person{
    private String title;
    private String author;
    private String category;
    private int quantity;

    public Book(String title, String author, String category, int quantity) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.quantity = quantity;
    }

}
