package com.dmdev.oop.lesson20.map;

import com.dmdev.oop.lesson20.person.Person;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
        var ivan = new Person(1, "Ivan", "Ivanov");
        var petr = new Person(2, "Petrov", "Petrov");
        var sveta = new Person(1, "Sveta", "Svetikova");

        Map<Integer, Person> map = new HashMap<>();
        map.put(ivan.getId(), ivan);
        map.put(petr.getId(), petr);
        map.putIfAbsent(sveta.getId(), sveta);

//        System.out.println(map.get(2));
//
//        System.out.println(map.keySet());
//        System.out.println(map.values());
//        System.out.println(map.entrySet());
//
//        for (Person person : map.values()) {
//            System.out.println(person.getFirstName());
//        }

        for (Map.Entry<Integer, Person> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println(map.containsKey(4));
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.getOrDefault(6, sveta));
    }
}
