package org.example.homework_9;

import org.example.homework_9.task1.Dog;
import org.example.homework_9.task1.Food;
import org.example.homework_9.task1.Rabbit;
import org.example.homework_9.task1.Tiger;
import org.example.homework_9.task2.Doggy;

public class Main {
    private static final Dog dog = new Dog();
    private static final Tiger tiger = new Tiger();
    private static final Rabbit rabbit = new Rabbit();


    public static void main(String[] args) {
        processAnimalVoiceAndEat();
        Doggy.voiceAndEat();
    }

    private static void processAnimalVoiceAndEat() {
        dog.voice();
        dog.eat(Food.MEAT);
        dog.eat(Food.BONE);
        dog.eat(Food.GRASS);
        tiger.voice();
        tiger.eat(Food.MEAT);
        tiger.eat(Food.BONE);
        tiger.eat(Food.GRASS);
        rabbit.voice();
        rabbit.eat(Food.MEAT);
        rabbit.eat(Food.BONE);
        rabbit.eat(Food.GRASS);
    }
}
