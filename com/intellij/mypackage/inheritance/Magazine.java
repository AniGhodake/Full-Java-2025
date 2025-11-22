package com.intellij.mypackage.inheritance;

public class Magazine extends LibraryItem{
    protected int issueNumber;

    public Magazine(String itemID, String title, String author, int issueNumber) {
        super(itemID, title, author);
        this.issueNumber = issueNumber;
    }
}
