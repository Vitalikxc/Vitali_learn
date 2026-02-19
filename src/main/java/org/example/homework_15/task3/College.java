package org.example.homework_15.task3;

import java.util.LinkedList;

public class College {

    public College(LinkedList<Student> students) {
        this.students = students;
    }

    private final LinkedList<Student> students;

    public void selectionStudents() {
        for (Student student : students) {
            if (student.getStudentRating() >= 3) {
                student.incrementCourse();
            }
        }
        students.removeIf(student -> student.getStudentRating() < 3);
        System.out.println(students);
    }

    public void printStudents(int course) {
        System.out.println("Студенты обучающиеся на " + course + " курсе:");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student);
            }
        }
    }
}
