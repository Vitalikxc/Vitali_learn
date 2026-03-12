package org.example.homework_20;

import org.example.homework_20.task1.SearchNumbers;
import org.example.homework_20.task2.BubbleSortRunner;
import org.example.homework_20.task2.InsertionSortRunner;
import org.example.homework_20.task2.SelectionSortRunner;
import org.example.homework_20.task3.Buyer;
import org.example.homework_20.task3.Manufacturer;
import org.example.homework_20.task3.Shop;


public class Main {
    public static void main(String[] args) throws InterruptedException {

        SearchNumbers searchNumbers = new SearchNumbers();
        searchNumbers.task1();

        int[] numbers = {5,3,75,1,54,3,22,4,8,10,43,11};
        Thread threadBubble = new Thread(new BubbleSortRunner(numbers));
        Thread threadSelection = new Thread(new SelectionSortRunner(numbers));
        Thread threadInsertion = new Thread(new InsertionSortRunner(numbers));
        threadSelection.start();
        threadInsertion.start();
        threadBubble.start();

        
        Thread manufacturerThread = new Thread(new Manufacturer(Manufacturer.countProduct));
        Thread shopThread = new Thread(new Shop(Manufacturer.countProduct));
        Thread buyerThread = new Thread(new Buyer(Shop.productInShop));
        manufacturerThread.start();
        shopThread.start();
        buyerThread.start();
    }
}
