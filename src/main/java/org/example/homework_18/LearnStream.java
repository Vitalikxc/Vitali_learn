package org.example.homework_18;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LearnStream {
    static final List<Integer> VALID_IDS = List.of(1, 2, 5, 8, 9, 13);

    public void task1() {
        ArrayList<Integer> listInt = new ArrayList<>();
        listInt.add(1);
        listInt.add(2);
        listInt.add(2);
        listInt.add(4);
        int sum = listInt.stream()
                .distinct()
                .filter(it -> it % 2 == 0)
                .mapToInt(Integer :: intValue)
                .sum();

        System.out.println(sum);
    }

    public void task2() {
        Map<Integer, String> users = Map.of(
                1, "john",
                2, "Tom",
                3, "Bob",
                4, "Georg",
                5, "James",
                6, "Andrew"
        );
        List<String> list = users.entrySet().stream()
                .filter(it -> VALID_IDS.contains(it.getKey()))
                .filter(it -> it.getValue().length() % 2 == 0)
                .map(it -> {
                    StringBuilder stringBuilder = new StringBuilder(it.getValue());
                    return stringBuilder.reverse().toString();
                }).toList();
        System.out.println(list);
    }
}
