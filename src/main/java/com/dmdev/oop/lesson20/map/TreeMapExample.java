package com.dmdev.oop.lesson20.map;

import com.dmdev.oop.lesson20.person.Person;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {
        var ivan = new Person(1, "Ivan", "Ivanov");
        var petr = new Person(29, "Petrov", "Petrov");
        var sveta = new Person(3, "Sveta", "Svetikova");
        var sveta1 = new Person(30, "Sveta1", "Svetikova1");
        var sveta2 = new Person(45, "Sveta2", "Svetikova2");
        var sveta3 = new Person(10, "Sveta3", "Svetikova3");

        Map<Integer, Person> map = new TreeMap<>();
        map.put(ivan.getId(), ivan);
        map.put(petr.getId(), petr);
        map.putIfAbsent(sveta.getId(), sveta);
        map.putIfAbsent(sveta1.getId(), sveta1);
        map.putIfAbsent(sveta2.getId(), sveta2);
        map.putIfAbsent(sveta3.getId(), sveta3);

        for (Map.Entry<Integer, Person> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}
