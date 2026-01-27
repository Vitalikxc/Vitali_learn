package org.example.homework_10;

import org.example.homework_10.task1and2.TypeClone;
import org.example.homework_10.task1and2.User;

public class Main {
    public static void main(String[] args) {
        User userOne = new User("Tom",15,1);
        User userTwo = new User("Tom",15,1);
        User userThree = new User("Tom",12,1);
        System.out.println(userTwo.equals(userOne));
        System.out.println(userOne.equals(userThree));

        User user = new User("Bob", 11, 1);
        User userShallow = user.myClone(TypeClone.SHALLOW, user);
        User userDeep = user.myClone(TypeClone.DEEP, user);
        System.out.println(user);
        System.out.println(userShallow);
        System.out.println(userDeep);
        userDeep.setId(3);
        userShallow.setId(6);
        System.out.println(user);
        System.out.println(userShallow);
        System.out.println(userDeep);
    }
}
