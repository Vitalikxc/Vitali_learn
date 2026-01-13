package org.example.homework_6;

import org.example.homework_6.task1.CardProcessor;
import org.example.homework_6.task2.ATMProcessor;

public class Main {
    public static void main(String[] args) {

        CardProcessor cardProcessor = new CardProcessor();
        cardProcessor.processHomeworkCards();

        ATMProcessor atmProcessor = new ATMProcessor();
        atmProcessor.ProcessATM();
    }
}
