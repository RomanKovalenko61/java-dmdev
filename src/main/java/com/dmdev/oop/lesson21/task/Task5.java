package com.dmdev.oop.lesson21.task;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

import static java.util.stream.Collectors.*;

public class Task5 {

    public static void main(String[] args) {
        var persons = List.of(
                new Person("Ivan", "Ivanov", 20),
                new Person("Petr", "Petrov", 25),
                new Person("Sveta", "Svetikova", 33),
                new Person("Kate", "Ivanova", 25),
                new Person("Slava", "Slavikov", 18),
                new Person("Arni", "Kutuzov12345", 56)
        );

        persons.stream()
                .filter(person -> person.getFullName().length() < 15)
                .max(Comparator.comparingInt(Person::getAge))
                .map(Person::getFullName)
                .ifPresent(System.out::println);

        var map = persons.stream()
                .collect(groupingBy(Person::getAge,
                        mapping(Person::getFullName, toList())));
        System.out.println(map);

        //exception Duplicate key 25
        var personMap = persons.stream()
                .collect(toMap(Person::getAge, Function.identity()));
        System.out.println(personMap);
    }
}
