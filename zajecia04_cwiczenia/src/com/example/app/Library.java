package com.example.app;

import com.example.model.Book;

public class Library {
    public static void main(String[] args) {

        Book book1 = new Book("Wiedźmin", "Andrzej Sapkowski", "jakis_numer_isbn");
        book1.showInfo();

        //System.out.println(book1.title);
    }
}
