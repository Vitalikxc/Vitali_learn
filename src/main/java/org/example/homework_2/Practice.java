package org.example.homework_2;

import java.util.Scanner;

public class Practice {

    Scanner scanner = new Scanner(System.in);

    public void task1() {
        System.out.println("Введите цифру месяца");
        int month = scanner.nextInt();

        switch (month) {
            case 12, 1, 2 -> System.out.println("Зима");
            case 3, 4, 5 -> System.out.println("Весна");
            case 6, 7, 8 -> System.out.println("Лето");
            case 9, 10, 11 -> System.out.println("Осень");
        }
    }

    public void task2() {
        StringBuilder builder = new StringBuilder();
        int number = 0;
        while (number <= 25) {
           builder.append(number).append(" ");
            number++;
        }
        System.out.println(builder);
    }

    public void task3() {

        for (int i = 0; i <= 20; i += 2) {
            if (i <= 10)
                continue;
            System.out.println(i);
        }
    }

    public int task4(int numberOne, int numberTwo) {
        return Math.max(numberOne, numberTwo);
    }

    public int task5(int factorial) {
        int result = 1;
        for (int i = 1; i <= factorial; i++) {
            result = i * result;
        }
        System.out.println(result);
        return result;
    }

    public void task6() {
        int number = scanner.nextInt();
        int result = 0;
        while (number > 0) {
            result += number % 10;
            number = number / 10;
        }
        System.out.println(result);
    }

    public boolean task7(String text) {
        StringBuilder stringBuilder = new StringBuilder(text);
        stringBuilder.reverse();
        return stringBuilder.toString().equalsIgnoreCase(text);
    }

    public boolean task8(int number) {
        if (number <= 1)
            return false;
        else if (number == 2)
            return true;
        for (int i = 3; i <= (int) Math.sqrt(number); i += 2) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public void task9(int number) {
        int result;
        for (int i = 1; i < 10; i++) {
            result = number * i;
            System.out.println(result);
        }
    }

    public void task10(String text) {
        StringBuilder reverse = new StringBuilder(text).reverse();
        System.out.println(reverse);
    }

    public void task11(String word) {
        String lowerCase = word.toLowerCase();
        int counter = 0;
        for (int i = 0; i < lowerCase.length(); i++) {
            char array = word.charAt(i);
            if (array == 'a' || array == 'e' || array == 'i' || array == 'o' || array == 'y' || array == 'u')
                counter++;
            if (array == 'а' || array == 'о' || array == 'у' || array == 'ы' || array == 'э' || array == 'и' || array == 'я' || array == 'е' || array == 'ё' || array == 'ю')
                counter++;
        }
        System.out.println(counter);
    }

    public void task12(int fi) {
        int[] arr = new int[fi + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= fi; i++) {
            arr[i] = arr[i-1] + arr[i-2];
            System.out.println(arr[i]);
        }
    }
}
