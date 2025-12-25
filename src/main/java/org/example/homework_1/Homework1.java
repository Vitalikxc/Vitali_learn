package org.example.homework_1;

public class Homework1 {

    public void task1() {
        int b = 3, c = 5;
        int a = 4 * (b + c - 1) / 2;
        System.out.println(a);
    }

    public void task2() {
        int n = 26;
        char[] q = String.valueOf(n).toCharArray();
        int sum = 0;
        for (int i : q) {
            int a = Character.getNumericValue(i);
            sum = sum + a;
        }
        System.out.println(sum);
    }

    public void task3() {
        int n = 126;
        char[] q = String.valueOf(n).toCharArray();
        int sum = 0;
        for (int i : q) {
            int a = Character.getNumericValue(i);
            sum = sum + a;
        }
        System.out.println(sum);
    }

    public void task4() {
        double d = 125.78;
        System.out.println(Math.round(d));
    }

    public void task5() {
        int q = 21, w = 8;
        int whole = q / w;
        int remainder = q % w;
        System.out.println(q + "/" + w + " = " + whole + " and " + remainder);
    }

    public void task6() {
        int one = 1;
        int two = 2;

        one ^= two;
        two ^= one;
        one ^= two;
        System.out.println("Nunber one: " + one + " " + "Number two: " + two);
    }
}