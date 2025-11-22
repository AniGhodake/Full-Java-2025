package com.intellij.mypackage.inheritance;

public class Book extends LibraryItem{
    private String ISBN;

    public Book(String itemID, String title, String author, String ISBN) {
        super(itemID, title, author);
        this.ISBN = ISBN;
    }
}
