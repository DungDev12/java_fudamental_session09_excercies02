package org.example;

public class Main {
    static void main(String[] args) {
        Book b1 = new Book("Java", "James", 100);
        Book b2 = new Book("Python", "Guido", 120);
        Book b3 = new Book("C++", "Bjarne", 150);

        Book[] books = new Book[3];

        books[0] = b1;
        books[1] = b2;
        books[2] = b3;

        System.out.println("------ LIST OF BOOKS ------");

        for (int i = 0; i < books.length; i++) {
            books[i].printInfo();
        }
    }
}
