package org.example.homework_5;

import java.util.Random;
import java.util.Scanner;

public class Homework5 {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int[][] matrix = new int[5][5];


    public void task1() {
        int sum = 0;
        System.out.println("Введите число которое хотите добавить");
        int number = scanner.nextInt();
        scanner.close();
        for (int i = 0; i < matrix.length; i += 1) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(0, 10) + number;
                sum += matrix[i][j];
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.print("\n");
        }
        System.out.println("Сумма всех чисел: " + sum);
    }

    public void task2() {
        String[][] strings = new String[8][8];
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings.length; j++) {
                if ((j + i) % 2 == 0) {
                    strings[i][j] = "W";
                } else if ((i + j) % 2 == 1) {
                    strings[i][j] = "B";
                }
                System.out.print(strings[i][j]);
            }
            System.out.print("\n");
        }
    }

    public void task3() {
        int n = 4;
        int m = 6;
        int[][] a = new int[n][m];
        int s = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = s;
                s++;
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < a[i].length; j++) {
                    System.out.print(a[i][j] + "\t");
                }
                System.out.print("\n");
            } else {
                for (int j = a[i].length - 1; j >= 0; j--) {
                    System.out.print(a[i][j] + "\t");
                }
                System.out.print("\n");
            }
        }
    }
}
