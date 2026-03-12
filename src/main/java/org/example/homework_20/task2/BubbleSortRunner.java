package org.example.homework_20.task2;

import java.util.Arrays;

public class BubbleSortRunner implements Runnable{
    private final int[] array;

    public BubbleSortRunner(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        int n = array.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        System.out.println("Пузырьковая сортировка завершена." + Arrays.toString(array));
    }
}
