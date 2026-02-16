package org.example.homework_10.task1and2;

public class Address implements Cloneable {
    private String city;

    public Address(String city) {
        this.city = city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public Address clone() {
        try {
            return (Address) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "city=" + city;
    }
}
