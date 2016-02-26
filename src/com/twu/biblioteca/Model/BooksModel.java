package com.twu.biblioteca.Model;

import java.util.List;

//Welcome User, Display Main menu
public class BooksModel {
    String welcomeMessage;
    List<Book> books;

    public BooksModel(List<Book> books) {
        welcomeMessage = "**** Welcome Customer! We are glad to have you at BooksModel! ****";
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }
}