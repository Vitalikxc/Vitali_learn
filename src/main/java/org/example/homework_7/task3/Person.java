package org.example.homework_7.task3;

public class Person implements Cloneable {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void info() {
        System.out.println("Имя: " + getName() + " Возраст: " + getAge());
    }

    public Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }
}
