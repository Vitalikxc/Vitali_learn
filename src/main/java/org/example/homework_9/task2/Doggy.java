package org.example.homework_9.task2;

public class Doggy {
    private Doggy() {
    }

    private static void eat() {
        System.out.println("Ест мясо");
    }

    private static void voice() {
        System.out.println("Гав");
    }

    public static void voiceAndEat() {
        voice();
        eat();
    }
}
