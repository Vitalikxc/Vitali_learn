package org.example.homework_6.task2;

import static org.example.homework_6.task2.Constants.INCORRECT_SUM;
import static org.example.homework_6.task2.Constants.SUCCESS;

public class ATMProcessor {
    private final ATM atm = new ATM(3, 3, 3);

    public void ProcessATM() {
        printAllSum();
        deposit();
        withdraw();
    }

    private void printAllSum() {
        System.out.println("Сумма в банкомате: " + atm.moneyInATM());
    }

    private void deposit() {
        System.out.println(atm.deposit(1, 1, 1) ? SUCCESS.value : INCORRECT_SUM.value);
        printAllSum();
    }

    private void withdraw() {
        System.out.println(atm.withdraw(480) ? SUCCESS.value : INCORRECT_SUM.value);
        printAllSum();
    }
}
