package com.urmish.library.service;
import com.urmish.library.domain.Book;

// Separate class for searching books
public class SearchService {

    public void searchBook(Book[] books, String name) {
        boolean found = false;
        for (Book b : books) {
            if (b.title.equals(name)) {
                b.display();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book not found.");
        }
    }
}
