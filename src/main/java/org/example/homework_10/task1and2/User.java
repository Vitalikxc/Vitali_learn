package org.example.homework_10.task1and2;

import java.util.Objects;

public class User implements Cloneable {
    private String name;
    private int age;
    private int id;
    private Address address;

    public User(String name, int age, int id, Address address) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                " " + address +
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

    public Object clone(TypeClone typeClone) throws CloneNotSupportedException {
        User userClone = (User) super.clone();
        if (typeClone == TypeClone.DEEP) {
            System.out.println("Глубокое клонирование");
            if (this.address != null) {
                userClone.address = this.address.clone();
            }
        }
        return userClone;
    }
}
