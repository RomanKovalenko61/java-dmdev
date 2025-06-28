package com.dmdev.oop.lesson11;

import java.util.Random;

public interface Printable {

    String SOME_VALUE = "Example";
    Random random = new Random();

    default void printWithRandom() {
        System.out.println("Random value " + generateRandom());
        print();
    }

    void print();

    private int generateRandom() {
        return random.nextInt();
    }
}
