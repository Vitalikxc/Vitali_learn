package org.example.homework_6.task1;


public class CreditCard {
    private final String  accountNumber;
    private int currentSum;

    public CreditCard(String accountNumber, int currentSum) {
        this.accountNumber = accountNumber;
        this.currentSum = currentSum;
    }

    public boolean incrementCurrentSum(int sum) {
        if (sum <= 0) {
            return false;
        }
        currentSum += sum;
        return true;
    }

    public boolean decrementCurrentSum(int sum) {
        if (sum <= 0 || currentSum < sum) {
            return false;
        }
        currentSum -= sum;
        return true;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getCurrentSum() {
        return currentSum;
    }
}
