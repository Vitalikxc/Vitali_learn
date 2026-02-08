package org.example.homework_9.task1;

public class Rabbit extends Animal {

    @Override
    public void voice() {
        System.out.println(getClass().getSimpleName() + ": chump-chump или thump-thump");
    }

    @Override
    public void eat(Food food) {
        if (food == Food.GRASS) {
            System.out.println(getClass().getSimpleName() + " любит есть " + food.foodProduct);
        } else {
            System.out.println("Недоволен." + getClass().getSimpleName() + " не ест: " + food.foodProduct);
        }
    }
}
