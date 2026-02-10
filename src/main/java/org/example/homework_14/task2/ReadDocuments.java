package org.example.homework_14.task2;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadDocuments {

    public static void readProcess() {
        String[] numberOfDocuments = getNumberOfDocuments();
        StringBuilder validDocuments = searchValid(numberOfDocuments);
        StringBuilder invalidDocuments = searchInvalid(numberOfDocuments);
        saveDocumentsInFile("./ValidDocuments.txt", validDocuments);
        saveDocumentsInFile("./InvalidDocuments.txt", invalidDocuments);
    }

    private static String[] getNumberOfDocuments() {
        StringBuilder fileText = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите путь к файлу" + "\n Например Z://NumberDocuments.txt");
        File file = new File(scanner.nextLine());
        try (FileInputStream inputStream = new FileInputStream(file)) {
            int currentChar;
            while ((currentChar = inputStream.read()) != -1) {
                fileText.append((char) currentChar);
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла.");
        }
        return fileText.toString().split("[\\r\\n]+");
    }

    private static StringBuilder searchValid(String[] numberOfDocuments) {
        StringBuilder validDocuments = new StringBuilder();
        Pattern pattern = Pattern.compile("(docnum[A-Za-z0-9]{9}|contract[A-Za-z0-9]{7})");
        Matcher matcher = pattern.matcher(Arrays.toString(numberOfDocuments));
        while (matcher.find()) {
            validDocuments.append(matcher.group()).append("\n");
        }
        return validDocuments;
    }

    private static StringBuilder searchInvalid(String[] numberOfDocuments) {
        StringBuilder invalidDocuments = new StringBuilder();
        for (String numberOfDocument : numberOfDocuments) {
            if (numberOfDocument.length() != 15) {
                invalidDocuments.append(numberOfDocument).append(" Документ должен состоять из 15 символов\n");
            } else if (!numberOfDocument.matches("^[a-zA-Zа-яА-Я0-9]+$")) {
                invalidDocuments.append(numberOfDocument).append(" Документ не должен содержать пробелы и служебные символы\n");
            } else if (!numberOfDocument.contains("docnum") && !numberOfDocument.contains("contract")) {
                invalidDocuments.append(numberOfDocument).append(" Документ должен начинаться с docnum или contract\n");
            }
        }
        return invalidDocuments;
    }


    private static void saveDocumentsInFile(String filePath, StringBuilder documents) {
        try (FileOutputStream outputStream = new FileOutputStream(filePath)) {
            byte[] buffer = documents.toString().getBytes();
            outputStream.write(buffer, 0, buffer.length);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
