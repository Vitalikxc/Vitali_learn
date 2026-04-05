package org.example.homework_20.task2;

import java.util.Arrays;

public class SelectionSortRunner implements Runnable {
    private final int[] array;

    public SelectionSortRunner(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;

            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIdx]) {
                    minIdx = j;
                }
            }

            if (minIdx != i) {
                int temp = array[minIdx];
                array[minIdx] = array[i];
                array[i] = temp;
            }
        }
        System.out.println("Сортировка выбором завершена." + Arrays.toString(array));
    }
}
