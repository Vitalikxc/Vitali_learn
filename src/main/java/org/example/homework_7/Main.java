package org.example.homework_7;

import org.example.homework_7.task1.Booker;
import org.example.homework_7.task1.Director;
import org.example.homework_7.task1.Employee;
import org.example.homework_7.task1.Worker;
import org.example.homework_7.task2.Circle;
import org.example.homework_7.task2.Figure;
import org.example.homework_7.task2.Rectangle;
import org.example.homework_7.task2.Triangle;
import org.example.homework_7.task3.Person;

import java.util.List;

public class Main {

    private static final Employee worker = new Worker();
    private static final Employee booker = new Booker();
    private static final Employee director = new Director();
    private static final Person person = new Person(10, "Tom");

    public static void main(String[] args) throws CloneNotSupportedException {
        runTitle();
        processFigure();
        runTaskCloneable();
    }

    private static void runTitle() {
        director.printTitle();
        worker.printTitle();
        booker.printTitle();
    }

    private static void processFigure() {
        List<Figure> figures = List.of(new Circle(5), new Rectangle(10, 4), new Triangle(7, 4, 4), new Circle(7), new Rectangle(6, 9));
        figures.forEach(f -> {
            System.out.println(f.getClass().getSimpleName());
            System.out.println("Периметр: " + f.getPerimeter());
            System.out.println("Площадь: " + f.getSquare());
        });
    }

    private static void runTaskCloneable() throws CloneNotSupportedException {
        Person person1 = person.clone();
        person.setAge(15);
        person.setName("Bob");
        person.info();
        person1.info();
    }
}
