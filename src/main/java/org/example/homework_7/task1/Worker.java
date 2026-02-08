package org.example.homework_7.task1;

public class Worker implements Employee {
    private final String title = "Worker";

    @Override
    public void printTitle() {
        System.out.println(title);
    }
}
