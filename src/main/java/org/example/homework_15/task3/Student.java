package org.example.homework_15.task3;

import java.util.Random;

public class Student {
    private final String name;
    private int group;
    private int course;
    private final int[] ratings = new int[5];

    public Student(String name, int group, int course) {
        this.name = name;
        this.group = group;
        this.course = course;
        setRating();
    }

    public double getStudentRating() {
        double result = 0;
        for (int rating : this.ratings) {
            result += rating;
        }
        return result / this.ratings.length;
    }

    private void setRating() {
        Random random = new Random();
        for (int i = 0; i < this.ratings.length; i++) {
            this.ratings[i] = random.nextInt(1, 6);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    public int getCourse() {
        return course;
    }

    public void incrementCourse(){
        course++;
    }
}
