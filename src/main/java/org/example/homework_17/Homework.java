package org.example.homework_17;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Homework {
    Scanner scanner = new Scanner(System.in);

    public void oneHundredYears() {
        System.out.println("Введите дату своего рождения в формате yyyy/MM/dd>");
        LocalDate oneHundredYears = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        System.out.println(oneHundredYears.plusYears(100));
    }

    Predicate<Integer> isPositive = x -> x > 0;


    Function<String, Double> convert = it -> {
        String value = it.split(" ")[0];
        return Double.parseDouble(value) / 3;
    };

    Consumer<String> converter = it -> {
        Double value = Double.valueOf(it.split(" ")[0]);
        Double usd = value / 3;
        System.out.println(usd + " USD");
    };

    Supplier<StringBuilder> stringReverse = () -> {
        StringBuilder stringBuilder = new StringBuilder(scanner.nextLine());
        return stringBuilder.reverse();
    };
}

