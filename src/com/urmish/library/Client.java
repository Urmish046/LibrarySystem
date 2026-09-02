package com.urmish.library;
import com.urmish.library.domain.LibraryDomainFactory;
import com.urmish.library.service.BorrowService;
import com.urmish.library.service.ReturnService;
import com.urmish.library.service.SearchService;
import java.util.Scanner;

public class Client {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            LibraryDomainFactory lib = new LibraryDomainFactory();
            SearchService searchService = new SearchService();
            BorrowService borrowService = new BorrowService();
            ReturnService returnService = new ReturnService();
            int choice;

            do {
                System.out.println("\n--- Menu ---");
                System.out.println("1. Show All Books");
                System.out.println("2. Search Book");
                System.out.println("3. Borrow Book");
                System.out.println("4. Return Book");
                System.out.println("5. Exit");
                System.out.print("Enter choice: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        lib.showAllBooks();
                        break;
                    case 2:
                        System.out.print("Enter book name to search: ");
                        String name = sc.nextLine();
                        searchService.searchBook(lib.getBooks(), name);
                        break;
                    case 3:
                        System.out.print("Enter book name to borrow: ");
                        String borrowName = sc.nextLine();
                        System.out.print("For how many days? ");
                        int days = sc.nextInt();
                        sc.nextLine();  // consume newline
                        borrowService.borrowBook(lib.getBooks(), borrowName, days);
                        break;
                    case 4:
                        System.out.print("Enter book name to return: ");
                        String rname = sc.nextLine();
                        System.out.print("How many days late? (0 if on time): ");
                        int late = sc.nextInt();
                        sc.nextLine();
                        returnService.returnBook(lib.getBooks(), rname, late);
                        break;
                    case 5:
                        System.out.println("Thanks for using Library System.");
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }

            } while (choice != 5);
        }
    }



