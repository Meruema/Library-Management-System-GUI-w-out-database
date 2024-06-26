/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dcit13.library;

/**
 *
 * @author mjeno
 */
public class Book {
    private String isbn; //attribute
    private String title;
    private String genre;
    private String author;
    private int quantity;

    // Constructor
    public Book(String isbn, String title, String author, String genre, int quantity) {
        this.isbn = isbn;
        this.title = title;
        this.genre = genre;
        this.author = author;
        this.quantity = quantity;
    }

    // Getters
    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public int getQuantity() {
        return quantity;
    }
    
    // Setter for quantity
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public String toString() {
        return "Book{" +
                "ISBN='" + isbn + '\'' +
                ", Title='" + title + '\'' +
                ", Author='" + author + '\'' +
                ", Quantity=" + quantity +'}';
    }
}
