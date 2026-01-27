package org.example.homework_9.task1;

public class Tiger extends Animal {
    @Override
    public void voice() {
        System.out.println(getClass().getSimpleName() + ": РРРР!");
    }

    @Override
    public void eat(Food food) {
        if (food == Food.MEAT) {
            System.out.println(getClass().getSimpleName() + " любит есть " + food.foodProduct);
        } else {
            System.out.println("Недоволен." + getClass().getSimpleName() + " не ест: " + food.foodProduct);
        }
    }
}
