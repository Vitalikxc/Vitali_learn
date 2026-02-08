package org.example.homework_11;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class HomeTask {
    Scanner scanner = new Scanner(System.in);
    String[] array = new String[3];

    public void createMassive() {
        System.out.println("Введите 3 строки");
        for (int i = 1; i < array.length + 1; i++) {
            array[i - 1] = scanner.nextLine();
        }
    }

    public void task1() {
        createMassive();
        String minLength = array[0];
        String maxLenght = array[0];
        for (String s : array) {
            if (minLength.length() > s.length()) {
                minLength = s;
            }
            if (maxLenght.length() < s.length()) {
                maxLenght = s;
            }
        }
        System.out.println("Самая коротка строка: " + minLength + " Длинной: " + minLength.length() + "\n Самая длинная строка: " + maxLenght + " Длинной: " + maxLenght.length());
    }

    public void task2() {
        createMassive();
        Arrays.sort(array, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(array));
    }

    public void task3() {
        createMassive();
        int lengthSum = 0;
        for (String s : array) {
            lengthSum += s.length();
        }
        lengthSum /= array.length;
        for (String s : array) {
            if (s.length() < lengthSum) {
                System.out.println(s + " Длинна:" + s.length());
            }
        }
    }

    public void task4() {
        createMassive();
        for (String word : array) {
            for (char c : word.toCharArray()) {
                if (!Character.isLetter(c)) {
                    System.out.println(word);
                    return;
                }
            }
        }
    }

    public void task5() {
        String hi = "Hello";
        StringBuilder sb = new StringBuilder();
        for (char symbol : hi.toCharArray()) {
            sb.append(symbol).append(symbol);
        }
        System.out.println(sb);
    }

    public void task6() {
        String words = "Шалаш, Дерево, Крышка, Казак, Повод, Довод";
        String[] arrayWords = words.split(", ");
        System.out.println("Введите цифру для проверки на палиндром: " + Arrays.toString(arrayWords));
        if (scanner.hasNextInt()) {
            int userIn = scanner.nextInt();
            if (userIn > arrayWords.length || userIn <= 0) {
                System.out.println("Элемента с таким индексом не существует");
            } else {
                StringBuilder stringBuilder = new StringBuilder(arrayWords[userIn - 1]);
                System.out.println(stringBuilder.reverse().toString().equalsIgnoreCase(arrayWords[userIn - 1]));
            }
        }
    }
}
