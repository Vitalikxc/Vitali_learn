package org.example.homework_13.task2;

public class FinallyTask {

    public static void finallyNotStart() {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.exit(0);
        } finally {
            System.out.println("Блок Finally");
        }
    }
}
