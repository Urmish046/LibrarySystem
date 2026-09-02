package com.urmish.library.domain;

import java.util.Objects;

public class Book {
    public String title;
    String author;
    public boolean isBorrowed;
    public int dueDays;

    Book(String t, String a) {
        title = t;
        author = a;
        isBorrowed = false;
        dueDays = 0;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isBorrowed=" + isBorrowed +
                ", dueDays=" + dueDays +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return isBorrowed == book.isBorrowed && dueDays == book.dueDays && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, isBorrowed, dueDays);
    }

    public void display() {
        System.out.println("Book name: " + title+"Author"+author+"due day"+dueDays);
    }
}


