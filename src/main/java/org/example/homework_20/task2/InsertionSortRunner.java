package org.example.homework_20.task2;

import java.util.Arrays;

public class InsertionSortRunner implements Runnable{
    private final int[] array;

    public InsertionSortRunner(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
        System.out.println("Сортировка вставками завершена." + Arrays.toString(array));
    }
}
