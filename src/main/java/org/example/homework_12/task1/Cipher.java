package org.example.homework_12.task1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cipher {
    Scanner scanner = new Scanner(System.in);

    public void task() {
        String userIn = scanner.nextLine();
        Pattern pattern = Pattern.compile("[A-ZА-ЯЁ]{2,6}");
        Matcher matcher = pattern.matcher(userIn);
        while (matcher.find()) {
            userIn = matcher.group();
        }
        System.out.println(userIn);
    }
}
