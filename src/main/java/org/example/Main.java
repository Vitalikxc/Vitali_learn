package org.example;

import org.example.homework_1.Homework1;
import org.example.homework_5.Homework5;

public class Main {

    private static final Homework1 homework1 = new Homework1();
    private static final Homework5 homework5 = new Homework5();

    public static void main(String[] args) {
        runHomework1();
        runHomework5();
    }

    private static void runHomework1(){
        homework1.task1();
        homework1.task2();
        homework1.task3();
        homework1.task4();
        homework1.task5();
        homework1.task6();
    }

    private static void runHomework5(){
        homework5.task1();
        homework5.task2();
        homework5.task3();
    }
}
