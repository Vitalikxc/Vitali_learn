package org.example.homework_16.task1;

import java.util.*;

public class LearnMap {
    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> wordMultiple = new HashMap<>();
        for (String s : strings) {
            if (wordMultiple.containsKey(s)) {
                wordMultiple.put(s, true);
            } else {
                wordMultiple.put(s, false);
            }
        }
        return wordMultiple;
    }

    public Map<String, String> pairs(String[] strings) {
        Map<String, String> pairs = new HashMap<>();
        for (String s : strings) {
            String firstChar = String.valueOf(s.charAt(0));
            String lastChar = String.valueOf(s.charAt(s.length() - 1));
            pairs.put(firstChar, lastChar);
        }
        return pairs;
    }

    public void taskBrackets(String string) {
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put('(', ')');
        brackets.put('[', ']');
        brackets.put('{', '}');
        String part1 = string.substring(0, string.length() / 2);
        String part2 = string.substring(string.length() / 2);
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : part1.toCharArray()) {
            stringBuilder.append(brackets.get(c));
        }
        stringBuilder.reverse();
        System.out.println(stringBuilder.toString().equals(part2));
    }
}
