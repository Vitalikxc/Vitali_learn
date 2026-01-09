package org.example;

import org.example.homework_1.Homework1;
import org.example.homework_4.Homework4;


public class Main {

    private static final Homework1 homework1 = new Homework1();
    private static final Homework4 homework4 = new Homework4();

    public static void main(String[] args) {
        runHomework1();
        runHomework4();
    }

    private static void runHomework1(){
        homework1.task1();
        homework1.task2();
        homework1.task3();
        homework1.task4();
        homework1.task5();
        homework1.task6();
    }

    private static void runHomework4() {
        homework4.task1();
        homework4.task2And3();
        homework4.task4();
        homework4.task5();
        homework4.task6();
        homework4.task7();
    }
}
