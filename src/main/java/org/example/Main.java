package org.example;

import org.example.homework_1.Homework1;
import org.example.homework_2.Homework2;
import org.example.homework_2.Practice;
import org.example.homework_4.Homework4;

public class Main {

    private static final Homework1 homework1 = new Homework1();
    private static final Homework2 homework2 = new Homework2();
    private static final Practice practice = new Practice();
    private static final Homework4 homework4 = new Homework4();


    public static void main(String[] args) {
        runHomework1();
        runHomework2();
        runPractice();
        runHomework4();
    }

    private static void runHomework1() {
        homework1.task1();
        homework1.task2();
        homework1.task3();
        homework1.task4();
        homework1.task5();
        homework1.task6();
    }

    private static void runHomework2() {
        homework2.task1();
        homework2.task2();
        homework2.task3();
        homework2.task4();
        homework2.task5();
    }

    private static void runPractice() {
        practice.task1();
        practice.task2();
        practice.task3();
        System.out.println(practice.task4(6, 5));
        practice.task5(7);
        practice.task6();
        System.out.println(practice.task7("Довод"));
        System.out.println(practice.task8(6));
        System.out.println(practice.task8(11));
        System.out.println(practice.task8(15));
        practice.task9(7);
        practice.task10("Абвгд");
        practice.task11("Hello, Привет");
        practice.task12(10);
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