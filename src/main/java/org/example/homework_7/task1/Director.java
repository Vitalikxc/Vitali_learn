package org.example.homework_7.task1;

public class Director implements Employee {
    private final String title = "Director";

    @Override
    public void printTitle() {
        System.out.println(title);
    }
}
