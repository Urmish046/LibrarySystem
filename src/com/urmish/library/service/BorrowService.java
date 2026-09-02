package com.urmish.library.service;

import com.urmish.library.domain.Book;

public class BorrowService {

    public void borrowBook(Book[] books, String name, int days) {
        for (Book b : books) {
            if (b.title.equals(name)) {
                if (!b.isBorrowed) {
                    b.isBorrowed = true;
                    b.dueDays = days;
                    System.out.println("Book can be borrowed for days: " + days);
                } else {
                    System.out.println("Sorry, book is already borrowed!!!");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }
}
