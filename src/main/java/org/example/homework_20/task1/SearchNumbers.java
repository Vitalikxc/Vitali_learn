package org.example.homework_20.task1;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchNumbers {
    private final ArrayList<Integer> numbersList = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    public void task1() {
        for (int i = 0; i < 5; i++) {
            numbersList.add(scanner.nextInt());
        }
        System.out.println(numbersList);
        Thread threadMin = new Thread(() -> {
            Integer minNumber = numbersList.stream()
                    .min(Integer::compareTo)
                    .orElseThrow(IllegalArgumentException::new);
            System.out.println(minNumber);
        });
        Thread threadMax = new Thread(() -> {
            Integer maxNumber = numbersList.stream()
                    .max(Integer::compareTo)
                    .orElseThrow(IllegalArgumentException::new);
            System.out.println(maxNumber);
        });
        threadMax.start();
        threadMin.start();
    }


}
