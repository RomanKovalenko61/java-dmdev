package com.dmdev.oop.lesson20.person;

public class PersonExample {

    public static void main(String[] args) {
        var ivan = new Person(1, "Ivan", "Ivanov");
        var petr = new Person(2, "Petrov", "Petrov");
//        var petr = new Person(1, "Ivan", "Ivanov");

        System.out.println(ivan.hashCode());
        System.out.println(petr.hashCode());
        System.out.println(ivan.equals(petr));
    }
}
