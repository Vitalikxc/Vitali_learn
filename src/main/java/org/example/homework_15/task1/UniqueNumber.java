package org.example.homework_15.task1;


import java.util.*;

public class UniqueNumber {
    Scanner scanner = new Scanner(System.in);

    public void notRepeatingNumbers() {
        String input = scanner.nextLine();
        Set<Character> setList = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            setList.add(input.charAt(i));
        }
        System.out.println(setList);
    }
}
