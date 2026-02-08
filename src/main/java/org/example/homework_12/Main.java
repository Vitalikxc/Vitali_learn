package org.example.homework_12;

import org.example.homework_12.task1.Cipher;
import org.example.homework_12.task2.OutInfo;

public class Main {
    private static final Cipher cipher = new Cipher();
    private static final OutInfo OUT_INFO = new OutInfo();

    public static void main(String[] args) {
        cipher.task();
        String userInfo = "teachmeskills@gmail.com 1423-1512-51 +375296058790";
        OUT_INFO.infoUser(userInfo);
    }
}

