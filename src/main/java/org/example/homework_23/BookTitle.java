package org.example.homework_23;

public class BookTitle {
    private final String firstName;
    private final String lastName;
    private final String title;

    public BookTitle(String firstName, String lastName, String title) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
    }

    @Override
    public String toString() {
        return firstName + "_" + lastName + "_" + title + ".txt";
    }
}
