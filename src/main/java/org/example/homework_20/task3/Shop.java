package org.example.homework_20.task3;

import java.util.concurrent.atomic.AtomicInteger;

public class Shop implements Runnable {
    AtomicInteger countProduct;
    public static AtomicInteger productInShop = new AtomicInteger(0);

    public Shop(AtomicInteger countProduct) {
        this.countProduct = countProduct;
    }

    @Override
    public void run() {
        synchronized (countProduct) {
            while (productInShop.get() != 5) {
                productInShop.set(productInShop.get() + 1);
                countProduct.set(countProduct.get() - 1);
                System.out.println("Продукта у производителя: " + countProduct);
                System.out.println("Продуктов в магазине: " + productInShop);
                if (countProduct.get() == 0){
                    return;
                }
                if (countProduct.get() == 0){
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                if (productInShop.get() == 3) {
                    try {
                        System.out.println("Продуктов у магазина : " + productInShop);
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}
