package com.dmdev.oop.lesson23;

import java.io.Serial;
import java.io.Serializable;

public final class Person implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private final int age;
    private final String firstName;
    private final transient String lastName;

    public Person(int age, String firstName, String lastName) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
