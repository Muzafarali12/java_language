package com.hello.LMMS;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryManagementSystem {

    private List<Book> bookList = new ArrayList<>();
    private List<Student> studentList = new ArrayList<>();

    public LibraryManagementSystem() {
        bookList.add(new Book("Java        ", "Leo        ", "ISBN001", 10));
        bookList.add(new Book("C++         ", "Villan     ", "ISBN002", 5));
        bookList.add(new Book("Python      ", "Honey      ", "ISBN003", 7));
        bookList.add(new Book("C#          ", "Metheyo    ", "ISBN004", 3));
        bookList.add(new Book("Poetry      ","Hashim Ziya ", "ISBN005",15));
    }

    public void displayMenu() {
        System.out.println("Welcome SMIU Library (Karachi)");
        System.out.println("1. Show all Books");
        System.out.println("2. Add a Book");
        System.out.println("3. Issue a Book");
        System.out.println("4. Return a Book");
        System.out.println("5. Show all Students");
        System.out.println("6. Exit");
    }

    public void showAllBooks() {
        if (bookList.isEmpty()) {
            System.out.println("No books available.");
        } else {
            System.out.println("Books Available:");
            System.out.println("Name               Author         ISBAN       Quantity");
            for (int i = 0; i < bookList.size(); i++) {
                System.out.print((i +1)+" ");
                bookList.get(i).display();
            }
        }
    }

    public void addBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Book Details:");

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Author: ");
        String author = scanner.nextLine();

        System.out.print("ISBN: ");
        String isbn = scanner.nextLine();

        System.out.print("Quantity: ");
        int quantity = scanner.nextInt();

        Book book = new Book(name, author, isbn, quantity);
        bookList.add(book);

        System.out.println("Book added successfully!");
    }

    public void issueBook() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student Name       : ");
        String studentName = scanner.nextLine();

        System.out.print("Enter Book ISBAN         : ");
        String bookIsban = scanner.nextLine();

        System.out.print("Enter Student id Number  : ");
        String id = scanner.nextLine();

        System.out.print("Enter Student  address   : ");
        String address = scanner.nextLine();

        Book foundBook = null;
        for (Book book : bookList) {
            if (book.getIsbn().equalsIgnoreCase(bookIsban)) {
                foundBook = book;
                break;
            }
        }

        if (foundBook != null && foundBook.getQuantity() > 0) {
            foundBook.setQuantity(foundBook.getQuantity() - 1);
            System.out.println("Book issued to " + studentName);
            studentList.add(new Student(studentName,id,address,bookIsban));
            System.out.println("Return date: " + LocalDate.now().plusDays(7));
        } else {
            System.out.println("Book not available or out of stock.");
        }
    }

    public void returnBook() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Book Name: ");
        String bookName = scanner.nextLine();

        Book foundBook = null;
        for (Book book : bookList) {
            if (book.getName().equalsIgnoreCase(bookName)) {
                foundBook = book;
                break;
            }
        }

        if (foundBook != null) {
            foundBook.setQuantity(foundBook.getQuantity() + 1);
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("This book does not belong to our library.");
        }
    }

    public void showAllStudents() {
        System.out.println("Student that Take Book From This Library  : ");
        
            for (int i = 0; i < studentList.size(); i++) {
                System.out.print((i + 1) + " ");
                studentList.get(i).displayStudentData();
            }

    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            displayMenu();
            System.out.print("Choose an option: ");
            String choice = scanner.next();

            switch (choice) {
                case "1":
                    showAllBooks();
                    break;
                case "2":
                    addBook();
                    break;
                case "3":
                    issueBook();
                    break;
                case "4":
                    returnBook();
                    break;
                case "5":
                    showAllStudents();
                    break;
                case "6":
                    System.out.println("Exiting Library Management System. Bye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option! Try again.");
            }
        }
    }

    public static void main(String[] args) {
        LibraryManagementSystem system = new LibraryManagementSystem();
        system.run();
    }
}

