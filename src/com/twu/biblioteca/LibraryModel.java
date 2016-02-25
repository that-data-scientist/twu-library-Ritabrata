package com.twu.biblioteca;

import java.util.List;

//Welcome User, Display Main menu
public class LibraryModel {
    String welcomeMessage;
    List<Book> books;

    LibraryModel(List<Book> books) {
        welcomeMessage = "**** Welcome Customer! We are glad to have you at LibraryModel! ****";
        this.books = books;
    }

    public void addBooks() {
        books.add(new Book("Head First Design Pattern!", "Martin Fowler", 2007));
    }

    public List<Book> getBooks() {
        return books;
    }
}
