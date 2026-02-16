package org.example.homework_10;

import org.example.homework_10.task1and2.Address;
import org.example.homework_10.task1and2.TypeClone;
import org.example.homework_10.task1and2.User;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        User user = new User("Tom", 12,1, new Address("Moscow"));
        User shallowClone = (User) user.clone(TypeClone.SHALLOW);
        User deepClone = (User) user.clone(TypeClone.DEEP);

        shallowClone.setName("Andrey");
        shallowClone.setAge(15);
        shallowClone.setId(2);
        shallowClone.getAddress().setCity("Minsk");
        deepClone.setName("Alex");
        deepClone.setAge(20);
        deepClone.setId(3);
        deepClone.getAddress().setCity("Mogilev");

        System.out.println(user);
        System.out.println(shallowClone);
        System.out.println(deepClone);

    }
}
