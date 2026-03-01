package org.example.homework_17;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Homework homework = new Homework();
        homework.oneHundredYears();

        Integer[] x = {1, -2, -3, 4, 5, 6, 7};
        List<Integer> numbersList = new ArrayList<>(List.of(x));
        numbersList.stream()
                .filter(homework.isPositive)
                .forEach(System.out::println);


        String sum = "100 BYN";

        Double bynToUSD = homework.convert.apply(sum);
        System.out.println(bynToUSD + " USD");

        homework.converter.accept(sum);


        String input = String.valueOf(homework.stringReverse.get());
        System.out.println(input);
    }
}
