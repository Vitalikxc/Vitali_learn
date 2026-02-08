package org.example.homework_12.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OutInfo {

    public void infoUser(String text) {
        Pattern patternEmail = Pattern.compile("[A-Za-z0-9]{1,}@[\\\\-]{0,1}[A-Za-z0-9]{1,}\\.(com|ru|by|net)");
        Matcher matcherEmail = patternEmail.matcher(text);
        while (matcherEmail.find()) {
            System.out.println("Email: " + matcherEmail.group());
        }

        Pattern patternDocument = Pattern.compile("([0-9]{4}[\\-][0-9]{4}[\\-][0-9]{2})");
        Matcher matcherDocument = patternDocument.matcher(text);
        while (matcherDocument.find()) {
            System.out.println("Документ №: " + matcherDocument.group());
        }

        Pattern patternPhone = Pattern.compile("(\\+375\\(?(29|25|44|33)\\)?\\d{7})");
        Matcher matcherPhone = patternPhone.matcher(text);
        if (matcherPhone.find()) {
            System.out.println("Номер телефона: " + matcherPhone.group());
        }
    }
}
