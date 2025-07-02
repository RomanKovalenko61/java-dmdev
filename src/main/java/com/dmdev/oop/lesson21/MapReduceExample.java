package com.dmdev.oop.lesson21;

import java.util.Optional;
import java.util.stream.Stream;

public class MapReduceExample {

    /**
     * [1000_000] -> age -> max
     * [1000_000] -> age -> max -> max
     * [1000_000] -> age -> max
     */

    public static void main(String[] args) {
        Optional<Student> maybeStudent = Stream.of(
                        new Student(18, "Ivan"),
                        new Student(23, "Petr"),
                        new Student(34, "Vasya"),
                        new Student(45, "Sveta"),
                        new Student(20, "Katya"),
                        new Student(68, "Den"),
                        new Student(101, "Kira")
                )
                .sequential()
                .flatMap(student -> student.getMarks().stream())
//                .map(Student::getAge)
//                .filter(student -> student.getAge() < 18)
                .reduce(((student, student2) -> student.getAge() > student2.getAge() ? student : student2));

        maybeStudent.ifPresent(System.out::println);

        maybeStudent.map(Student::getAge)
//                .filter(age -> age > 25)
                .flatMap(age -> Optional.of(age * 2))
                .ifPresent(System.out::println);
    }
}
