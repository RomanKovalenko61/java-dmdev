package com.dmdev.oop.lesson20.map;

import com.dmdev.oop.lesson20.person.Person;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
        var ivan = new Person(1, "Ivan", "Ivanov");
        var petr = new Person(2, "Petrov", "Petrov");

        Map<Integer, Person> map = new HashMap<>();
        map.put(ivan.getId(), ivan);
        map.put(petr.getId(), petr);

        System.out.println(map.get(2));
    }
}
