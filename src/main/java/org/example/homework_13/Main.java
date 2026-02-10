package org.example.homework_13;

import org.example.homework_13.task1.Authorization;
import org.example.homework_13.task1.WrongLoginException;
import org.example.homework_13.task1.WrongPasswordException;
import org.example.homework_13.task2.FinallyTask;

public class Main {
    public static void main(String[] args) {
        try {
            Authorization.login("HelloWorldHelloWorlxx", "HelloWorld1", "HelloWorld1");
        } catch (WrongLoginException e) {
            System.out.println("Невалидный логин: " + e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println("Невалидный пароль " + e.getMessage());
        }
        FinallyTask.finallyNotStart();

    }
}
