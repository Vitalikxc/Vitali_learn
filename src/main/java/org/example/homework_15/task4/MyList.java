package org.example.homework_15.task4;

import java.util.Arrays;

public class MyList<Type> {

    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 8;


    public MyList() {
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        this.elements = new Object[capacity];
    }

    public void add(Type element) {
        extension();
        this.elements[size] = element;
        size++;
    }

    public void remove(Integer index) {
        elements[index] = null;
        for (int i = index; i < elements.length - 1; i++) {
            elements[i] = elements[i + 1];
        }
    }

    public <T> T get(int index) {
        if (index < 0 || index > size) {
            throw new RuntimeException("Вы вышли за массив");
        }
        return (T) elements[index];
    }

    public boolean contains(Type type) {
        for (int i = 0; i <= size; i++) {
            if (type.equals(elements[i])) {
                return true;
            }
        }
        return false;
    }

    public void removeAll() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
    }

    private void extension() {
        if (size == elements.length) {
            int extensionCapacity = elements.length + 1;
            elements = Arrays.copyOf(elements, extensionCapacity);
        }
    }

    @Override
    public String toString() {
        return "MyList{" +
                "element=" + Arrays.toString(elements) +
                '}';
    }
}