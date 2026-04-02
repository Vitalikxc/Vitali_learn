package org.example.homework_23;

import java.util.Scanner;

public class Main {

    private static final DOMProcessor domProcessor = new DOMProcessor();
    private static final SAXProcessor saxProcessor = new SAXProcessor();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        switch (scanner.nextInt()) {
            case 1 -> saxProcessor.process();
            case 2 -> domProcessor.process();
            default -> throw new Exception("Неверное значение");
        }
    }
}
