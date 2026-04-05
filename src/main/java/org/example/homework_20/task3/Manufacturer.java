package org.example.homework_20.task3;

import java.util.concurrent.atomic.AtomicInteger;

public class Manufacturer implements Runnable {

    public static AtomicInteger countProduct = new AtomicInteger(0);

    public Manufacturer(AtomicInteger countProduct) {
        Manufacturer.countProduct = countProduct;
    }

    @Override
    public void run() {
        synchronized (countProduct) {
            while (countProduct.get() != 5) {
                countProduct.set(countProduct.get() + 1);
                System.out.println("Произведено продукта : " + countProduct);
            }
        }
    }
}
