package org.example.homework_6.task1;

import java.util.Scanner;

public class CardProcessor {
    Scanner scanner = new Scanner(System.in);

    public void processHomeworkCards() {
        CreditCard creditCard_1 = new CreditCard("1101", 200);
        CreditCard creditCard_2 = new CreditCard("1102", 250);
        CreditCard creditCard_3 = new CreditCard("1103", 300);

        processIncrement(creditCard_1);
        processIncrement(creditCard_2);
        processDecrement(creditCard_3);
    }

    private void processIncrement(CreditCard creditCard) {
        System.out.println("Введите сумму пополнения");
        System.out.println(creditCard.incrementCurrentSum(scanner.nextInt()) ? "Пополнение успешно" : "Сумма некорректна");
        getCardInfo(creditCard);
    }

    private void processDecrement(CreditCard creditCard) {
        System.out.println("Введите сумму вывода");
        System.out.println(creditCard.decrementCurrentSum(scanner.nextInt()) ? "Снятие успешно" : "Сумма некорректна");
        getCardInfo(creditCard);
    }

    private void getCardInfo(CreditCard creditCard){
        System.out.println("Номер счета: " + creditCard.getAccountNumber() + ", Сумма на счете: " + creditCard.getCurrentSum());
    }
}
