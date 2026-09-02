package com.urmish.library.domain;

public class LibraryDomainFactory {
    Book[] books;

    public LibraryDomainFactory() {
        books = new Book[5];
        books[0] = new Book("Java", "Urmish");
        books[1] = new Book("OOP", "Haris");
        books[2] = new Book("DSA", "Abuzar");
        books[3] = new Book("Computer Networks", "Hassan");
        books[4] = new Book("Database", "Bilal");
    }

    public Book[] getBooks() {
        return books;
    }

    public void showAllBooks() {
        for (Book b : books) {
            b.display();
        }
    }
}