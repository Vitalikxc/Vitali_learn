package org.example.homework_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework4 {
    Scanner scanner = new Scanner(System.in);
    int[] numbers;
    Random random = new Random();


    public void task1() {
        System.out.println("Введите длинну массива");
        numbers = new int[scanner.nextInt()];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Введите " + i + " Элемент массива");
            numbers[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }

    public void task2And3() {
        int min = numbers[0];
        int minIndex = 0;
        int max = numbers[0];
        int maxIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
                minIndex = i;
            }
            if (max < numbers[i]) {
                max = numbers[i];
                maxIndex = i;
            }
        }
        System.out.printf("\n" + "Минимальное значение | Индекс: " + minIndex + " Значение:" + min + "\n");
        System.out.println("Максимальное значение | Индекс: " + maxIndex + " Значение: " + max);
    }

    public void task4() {
        int count = 0;
        System.out.println("Введите длинну массива");
        int[] arrayNumbers = new int[scanner.nextInt()];
        for (int i = 0; i < arrayNumbers.length; i++) {
            arrayNumbers[i] = random.nextInt(0, 50);
            if (arrayNumbers[i] == 0) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Нет нулевых элементов");
        } else {
            System.out.println("Количество нулей:" + count);
        }
        scanner.close();
        System.out.println(Arrays.toString(arrayNumbers));
    }

    public void task5() {

        int temp = 0;
        int index = numbers.length - 1;
        int number;
        while (temp < index) {
            number = numbers[temp];
            numbers[temp] = numbers[index];
            numbers[index] = number;

            temp++;
            index--;
        }
        System.out.println(Arrays.toString(numbers));
    }

    public void task6() {
        boolean isIncrementOrder = true;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[i - 1]) {
                isIncrementOrder = false;
                break;
            }
        }
        if (isIncrementOrder) {
            System.out.println("Массив является возрастающей последовательностью");
        } else {
            System.out.println("Массив не является возрастающей последовательностью");
        }
    }

    public void task7() {
        int[] number = {9, 9, 9};
        StringBuilder stringBuilder = new StringBuilder();
        for (int j : number) {
            String s = Integer.toString(j);
            stringBuilder.append(s);
        }
        String s = stringBuilder.toString();
        int x = Integer.parseInt(s);
        x += 1;
        s = Integer.toString(x);
        char[] symbol = s.toCharArray();
        System.out.println(Arrays.toString(symbol));
    }
}
