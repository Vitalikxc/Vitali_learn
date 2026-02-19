package org.example.homework_16;

import org.example.homework_16.task1.LearnMap;

public class Main {
    public static void main(String[] args) {
        LearnMap learnMap = new LearnMap();
        String [] strings = {"a","b","a","c","b"};
        System.out.println(learnMap.wordMultiple(strings));
        String [] strings1 = {"man", "moon", "good", "night"};
        System.out.println(learnMap.pairs(strings1));
        learnMap.taskBrackets("())");

    }
}
