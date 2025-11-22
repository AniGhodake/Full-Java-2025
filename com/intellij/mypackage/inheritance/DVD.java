package com.intellij.mypackage.inheritance;

public class DVD extends LibraryItem{
    protected int duration;

    public DVD(String itemID, String title, String author, int duration) {
        super(itemID, title, author);
        this.duration = duration;
    }
}
