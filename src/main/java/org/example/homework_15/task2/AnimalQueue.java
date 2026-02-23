package org.example.homework_15.task2;

import java.util.LinkedList;

public class AnimalQueue {
    public AnimalQueue(LinkedList<String> animals) {
        this.animals = animals;
    }

    private final LinkedList<String> animals;

    public void addAnimal(String animal){
        animals.addFirst(animal);
    }

    public void removeAnimal(){
        if (!animals.isEmpty()){
            animals.removeLast();
        } else
            System.out.println("Пусто");
    }
    @Override
    public String toString() {
        return animals.toString();
    }
}
