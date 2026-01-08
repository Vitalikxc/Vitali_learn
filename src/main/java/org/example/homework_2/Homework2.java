package org.example.homework_2;

import java.util.Scanner;

public class Homework2 {
    Scanner scanner = new Scanner(System.in);


    public void task1() {
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное");
        }
    }

    public void task2() {
        int temperature = scanner.nextInt();
        if (temperature > -5) {
            System.out.println("Warm");
        }
        else if (temperature <= -20) {
            System.out.println("Cold");
        } else {
            System.out.println("Normal");
        }
    }

    public void task3() {
        int number;
        for (int i = 10; i <= 20; i++) {
            number = i * i;
            System.out.println("Квадрат числа " + i + ":" + number);
        }
    }

    public void task4() {
        int number = 0;
        while (number < 98) {
            number += 7;
            System.out.print(number + " ");
        }
    }

    public void task5() {
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number > 0) {
                long sum = 0L;
                for (int i = 1; i <= number; i++) {
                    sum += i;
                }
                System.out.println(sum);
            } else {
                System.out.println("Некорректное число");
            }
        } else {
            System.out.println("Ввод не является числом");
        }
    }
}
