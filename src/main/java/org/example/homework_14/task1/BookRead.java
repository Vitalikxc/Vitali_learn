package org.example.homework_14.task1;

import java.io.*;
import java.util.Scanner;

public class BookRead {


    public void processFile() {
        try {
            File file = new File("src/main/resources/Romeo and Juliet.txt");
            Scanner scanner = new Scanner(file);
            String wordWithMaxLength = findWordWithMaxLength(scanner);
            updateFile(wordWithMaxLength);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }

    private String findWordWithMaxLength(Scanner scanner) {
        String wordMaxLength = "";
        StringBuilder text = new StringBuilder();
        while (scanner.hasNextLine()) {
            text.append(scanner.nextLine()).append("\n");
        }
        String[] words = text.toString().split("[^A-Za-zА-Яа-яЁё]+");
        for (String s : words) {
            if (wordMaxLength.length() < s.length()) {
                wordMaxLength = s;
            }
        }
        return wordMaxLength;
    }

    private void updateFile(String word) {
        try (FileOutputStream fos = new FileOutputStream("./maxLengthWord.txt")) {
            byte[] buffer = word.getBytes();
            fos.write(buffer, 0, buffer.length);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
