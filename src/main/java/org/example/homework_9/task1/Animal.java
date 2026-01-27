package org.example.homework_9.task1;

public class Animal {
    public void voice() {
        System.out.println("Голос");
    }

    public void eat(Food food) {
        System.out.println("Ест " + food.foodProduct);
    }
}
