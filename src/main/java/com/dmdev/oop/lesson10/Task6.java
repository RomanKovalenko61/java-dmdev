package com.dmdev.oop.lesson10;

public class Task6 {

    public static void main(String[] args) {
        var start = System.currentTimeMillis();
        StringBuilder value = new StringBuilder();
        for (int i = 0; i < 100_000; i++) {
            value.append(i);
        }
        System.out.println(System.currentTimeMillis() - start);
        System.out.println(value.length());
    }
}
