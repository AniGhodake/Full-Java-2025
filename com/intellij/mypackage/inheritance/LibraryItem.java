package com.intellij.mypackage.inheritance;

public class LibraryItem {
    protected String itemID;
    protected String title;
    protected String author;

    public LibraryItem(String itemID, String title, String author) {
        this.itemID = itemID;
        this.title = title;
        this.author = author;
    }

    protected void checkout(){
        System.out.println("checkout");
    }
    protected void returnItem(){
        System.out.println("Returning the book");
    }
}

