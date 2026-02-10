package org.example.homework_14;

import org.example.homework_14.task1.BookRead;
import org.example.homework_14.task2.ReadDocuments;

public class Main {
    public static void main(String[] args) {
        BookRead bookRead = new BookRead();
        bookRead.processFile();
        ReadDocuments.readProcess();

    }
}
