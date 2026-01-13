package org.example.homework_6.task2;

public class ATM {

    private int banknote20;
    private int banknote50;
    private int banknote100;

    public ATM(int banknote20, int banknote50, int banknote100) {
        this.banknote20 = banknote20;
        this.banknote50 = banknote50;
        this.banknote100 = banknote100;
    }

    public int moneyInATM() {
        return banknote20 * 20 + banknote50 * 50 + banknote100 * 100;
    }

    public boolean deposit(int banknote20, int banknote50, int banknote100) {
        if (isDepositValid(banknote20, banknote50, banknote100)) {
            this.banknote20 += banknote20;
            this.banknote50 += banknote50;
            this.banknote100 += banknote100;
            return true;
        }
        return false;
    }

    private boolean isDepositValid(int banknote20, int banknote50, int banknote100) {
        return ((banknote20 >= 0 && banknote50 >= 0 && banknote100 >= 0) && !(banknote20 == 0 && banknote50 == 0 && banknote100 == 0));
    }

    public boolean withdraw(int sum) {
        int cash100 = 0;
        int cash50 = 0;
        int cash20 = 0;
        if (sum <= 0 || moneyInATM() < sum) {
            return false;
        } else {
            while (sum >= 100 && banknote100 > 0) {
                sum -= 100;
                banknote100--;
                cash100++;
            }
            while (sum >= 50 && banknote50 > 0) {
                sum -= 50;
                banknote50--;
                cash50++;
            }
            while (sum >= 20 && banknote20 > 0) {
                sum -= 20;
                banknote20--;
                cash20++;
            }
            System.out.println("Выдано: " + "Купюр номиналом 100: " + cash100 + " Купюр номиналом 50: " + cash50 + " Купюр номиналом 20: " + cash20 + "\n" + "Непринятая сумма: " + sum);
            return true;
        }
    }
}
