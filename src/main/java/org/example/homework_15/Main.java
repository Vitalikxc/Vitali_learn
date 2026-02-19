package org.example.homework_15;

import org.example.homework_15.task1.UniqueNumber;
import org.example.homework_15.task2.AnimalQueue;
import org.example.homework_15.task3.College;
import org.example.homework_15.task3.Student;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UniqueNumber uniqueNumber = new UniqueNumber();
        uniqueNumber.notRepeatingNumbers();

        AnimalQueue animalQueue = new AnimalQueue(new LinkedList<>(List.of("Dog", "Cat", "Tiger", "Lion")));
        System.out.println(animalQueue);
        animalQueue.addAnimal("Raccoon");
        System.out.println(animalQueue);
        animalQueue.removeAnimal();
        System.out.println(animalQueue);

        College college = new College(new LinkedList<>(List.of(
                new Student("Bob", 2, 3),
                new Student("Tom", 2, 3),
                new Student("Alex", 1, 2),
                new Student("Jerry", 1, 2),
                new Student("Garry", 1, 2)
        )));
        college.selectionStudents();
        college.printStudents(3);

    }
}
