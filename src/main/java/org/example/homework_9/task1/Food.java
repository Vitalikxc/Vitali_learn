package org.example.homework_9.task1;

public enum Food {
    MEAT("Мясо"),
    GRASS("Траву"),
    BONE("Кость");

    public final String foodProduct;

    Food(String food) {
        this.foodProduct = food;
    }
}
