package com.urmish.library.service;
import com.urmish.library.domain.Book;

public class ReturnService {

    public void returnBook(Book[] books, String name, int daysLate) {
        for (Book b : books) {
            if (b.title.equalsIgnoreCase(name)) {
                if (b.isBorrowed) {
                    b.isBorrowed = false;
                    b.dueDays = 0;
                    int fine = daysLate * 10;
                    if (daysLate > 0) {
                        System.out.println("U r late. Now give fine of Rs: " + fine);
                    } else {
                        System.out.println("Okay!! Book is returned o time.");
                    }
                } else {
                    System.out.println("Book was not borrowed.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }
}
