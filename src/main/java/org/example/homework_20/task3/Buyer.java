package org.example.homework_20.task3;

import java.util.concurrent.atomic.AtomicInteger;

public class Buyer implements Runnable {
    AtomicInteger countProduct;
    public static AtomicInteger productBuyer = new AtomicInteger(0);

    public Buyer(AtomicInteger countProduct) {
        this.countProduct = countProduct;
    }

    @Override
    public void run() {
        synchronized (Shop.productInShop) {
            while (productBuyer.get() != 5) {
                if (Shop.productInShop.get() == 0) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                productBuyer.set(productBuyer.get() + 1);
                Shop.productInShop.set(Shop.productInShop.get() - 1);
                System.out.println("Продукта у покупателя: " + productBuyer);
            }
        }
    }
}
