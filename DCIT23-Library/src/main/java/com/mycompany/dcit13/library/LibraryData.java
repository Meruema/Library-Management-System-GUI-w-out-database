/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dcit13.library;


import java.util.ArrayList;
/**
 *
 * @author mjeno
 */
public class LibraryData {
    private static final LibraryData instance = new LibraryData();
    private static ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Book> borrowedBooks;

    // Static block to initialize the books ArrayList with some default books
    static {
        books.add(new Book("978-0439136365", "Harry Potter", "J.K. Rowling", "Fantasy",  1));
        books.add(new Book("978-0143039433", "To Kill a Mockingbird", "Harper Lee", "Fiction",  1));
        books.add(new Book("978-0307277671", "The Road", "Cormac McCarthy", "Fiction", 1));
        books.add(new Book("978-1982137274", "Crawdads Sing", "Delia Owens", "Mystery", 1));
        books.add(new Book("978-0307949486", "The Night Circus", "Erin Morgenstern", "Fantasy", 1));
        books.add(new Book("978-0349429212", "The Duke and I", "Julia Quinn", "Romance", 1));
        books.add(new Book("978-0062352177", "Devil in Winter", "Lisa Kleypas", "Romance", 1));
        books.add(new Book("978-0349407753", "Moon Called", "Patricia Briggs", "Warewolf", 1));
        books.add(new Book("978-0735219090", "The Silent Patient", "Alex Michaelides", "Thriller", 1));
        books.add(new Book("978-0061120084", "The Alchemist", "Paulo Coelho", "Adventure", 1));
        // Add more books if you want lang
    }
    
    private LibraryData() {
        books = new ArrayList<>();
        borrowedBooks = new ArrayList<>();
    }

    // Method to get the singleton instance
    public static LibraryData getInstance() {
        return instance;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public boolean borrowBook(Book book) {
        if (books.contains(book) && book.getQuantity() > 0) {
            book.setQuantity(book.getQuantity() - 1);
            borrowedBooks.add(book);
            return true;
        }
        return false;
    }
    
    public boolean returnBook(Book book) {
    if (borrowedBooks.contains(book)) {
        // Increase the quantity of the returned book
        book.setQuantity(book.getQuantity() + 1);
        
        // Remove the book from borrowed list
        borrowedBooks.remove(book);
        
        // Return true indicating successful return
        return true;
        } else {
            // Return false if book was not found in borrowed list
            return false;
        }
    }
    
    public void removeBook(int index) {
    if (index >= 0 && index < books.size()) {
        Book removedBook = books.remove(index);
        borrowedBooks.remove(removedBook); // Remove from borrowed books if present
        }
    }
   

    // Other methods as needed for managing books
}
