package org.example.homework_10.task1and2;

import java.util.Objects;

import static org.example.homework_10.task1and2.TypeClone.DEEP;
import static org.example.homework_10.task1and2.TypeClone.SHALLOW;

public class User {
    private String name;
    private int age;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User() {
    }

    public User(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public String toString() {
        return "UserSystem{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User that = (User) o;
        return age == that.age && id == that.id && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, id);
    }

    public User myClone(TypeClone typeClone, User user) {
        User userClone = new User();
        if (typeClone == DEEP) {
            userClone.name = user.name;
            userClone.age = user.age;
            userClone.id = user.id;
        } else if (typeClone == SHALLOW) {
            userClone = user;
        }
        return userClone;
    }
}
